/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.Aluno;
import modelo.persistencia.AlunoDAO;

/**
 *
 * @author gdsant
 */
public class AlunoControle {

    // método estático cadastrar
    public static boolean cadastrar(String nome, String telefone, int serie, String situacao,
            int codEndereco) throws Exception {

        // verificação dos dados
        if (nome.isEmpty() || telefone.isEmpty() || serie < 1 || situacao.isEmpty()) {
            return false;
        }

        Aluno aluno = new Aluno(nome, telefone, serie, situacao);
        return AlunoDAO.salvar(aluno, codEndereco);
    }

    // método estático excluir
    public static boolean excluir(int matricula) throws Exception {
        return AlunoDAO.excluir(matricula);
    }

    // método estático buscarPorSerie
    public static Aluno[] buscarPorSerie(int serie) throws Exception {
        return AlunoDAO.buscarPorSerie(serie);
    }

    /**
     * Realiza uma busca por alunos com um determinado nome.
     *
     * @param nome o nome ou parte do nome do(s) aluno(s) que se deseja(m)
     * buscar.
     * @return vetor com os alunos cujos nomes correspondem com o parâmetro
     * recebido.
     */
    public static Aluno[] buscarPorNome(String nome) throws Exception {
        if (nome.isEmpty()) {
            return null;
        }

        return AlunoDAO.buscarPorNome(nome);
    }

    // método estático listarTodos
    public static Aluno[] listarTodos() throws Exception {
        return AlunoDAO.listarTodos();
    }

    /**
     * Faz alteração dos dados de um determinado aluno no banco de dados.
     *
     * @param a objeto da classe Aluno com os dados modificados, preservado o
     * id.
     * @return true: se os dados recebidos são válidos e se foi possível
     * realizar a alteração no banco.<br>
     * false; se os dados são inválidos ou se não foi possível realizar a
     * alteração no banco.
     */
    public static boolean alterar(Aluno a) throws Exception {
        if (a.getNome().isEmpty() || a.getTelefone().isEmpty() || a.getSituacao().isEmpty()
                || a.getSerie() <= 0) {
            return false;
        }
        return AlunoDAO.alterar(a);
    }

}

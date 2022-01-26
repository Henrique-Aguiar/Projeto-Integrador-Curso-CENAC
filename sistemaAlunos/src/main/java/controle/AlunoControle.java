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
        return false; // retorno temporário, falta implementar método
    }

    // método estático buscarPorSerie
    public static Aluno[] buscarPorSerie(int serie) throws Exception {
        return null; // retorno temporário, falta implementar
    }

    // método estático buscarPorNome
    public static Aluno[] buscarPorNome(String nome) throws Exception {
        return null; // retorno temporário, falta implementar
    }

    // método estático listarTodos
    public static Aluno[] listarTodos() throws Exception {
        return AlunoDAO.listarTodos(); // retorno temporário, falta implementar
    }

    // método estático alterar
    public static boolean alterar(Aluno a) throws Exception {
        return false; // retorno temporário, falta implementar
    }

    // método estático alterar situação
    public static boolean alterarSituacao(int matricula, String situacao)throws Exception {
        if (situacao.isEmpty()) {
            return false;
        }
        return AlunoDAO.alterarSituacao(matricula, situacao);
    }
}

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
        if(nome.isEmpty() || telefone.isEmpty() || serie < 0 || situacao.isEmpty()){
            return false;
        }
        
        Aluno aluno = new Aluno(nome, telefone, serie, situacao);
        return AlunoDAO.salvar(aluno, codEndereco);
    }

    // método estático excluir
    // método estático buscarPorSerie
    // método estático buscarPorNome
    // método estático listarTodos
    // método estático alterar
}

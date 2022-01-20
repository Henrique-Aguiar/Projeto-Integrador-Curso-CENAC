/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.Aluno;
/**
 *
 * @author gdsant
 */
public class AlunoDAO {
    
    // método estático salvar
    public static boolean salvar(Aluno a, int codEndereco) throws Exception{
        Connection conexao = FabricaDeConexoes.getConnection();
        
        String sql = "INSERT INTO aluno (nome, telefone, serie, situacao, cod_endereco) "
                + "VALUES (?, ?, ?, ?, ?)";
        
        PreparedStatement comandoPreparado = conexao.prepareStatement(sql);
        
        comandoPreparado.setString(1, a.getNome());
        comandoPreparado.setString(2, a.getTelefone());
        comandoPreparado.setInt(3, a.getSerie());
        comandoPreparado.setString(4, a.getSituacao());
        comandoPreparado.setInt(5, codEndereco);
        
        comandoPreparado.execute();
        
        comandoPreparado.close();
        conexao.close();
        
        return true;
    }
    
    // método estático excluir
    public static boolean excluir (int matricula){
        
    }
    
    // método estático buscarPorSerie
    
    
    // método estático buscarPorNome
    
    
    // método estático listarTodos
    
    
    // método estático alterar
    
}

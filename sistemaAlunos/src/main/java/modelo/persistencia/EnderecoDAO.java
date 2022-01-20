/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Endereco;

/**
 *
 * @author gdsant
 */
public class EnderecoDAO {

    // método estático salvar
    public static int salvar(Endereco e) throws Exception {

        Connection conexao = FabricaDeConexoes.getConnection();

        String sql = "INSERT INTO endereco (cidade, bairro, rua, numero_casa) "
                + "VALUES (?, ?, ?, ?)";

        PreparedStatement comandoPreparado = conexao.prepareStatement(sql);

        comandoPreparado.setString(1, e.getCidade());
        comandoPreparado.setString(2, e.getBairro());
        comandoPreparado.setString(3, e.getRua());
        comandoPreparado.setInt(4, e.getNumero());

        comandoPreparado.execute();

        comandoPreparado.close();
        conexao.close();

        return getEnderecoRecemCriado();
    }

    public static int getEnderecoRecemCriado() throws Exception {
        Connection conexao = FabricaDeConexoes.getConnection();

        String sql = "SELECT max(cod_endereco) as endereco_recem_criado FROM endereco";

        PreparedStatement comandoPreparado = conexao.prepareStatement(sql);
        
        ResultSet resultado = comandoPreparado.executeQuery();
        
        resultado.next();
        
        int ultimoCodEndereco = resultado.getInt("endereco_recem_criado");
        
        resultado.close();
        comandoPreparado.close();
        conexao.close();
        
        return ultimoCodEndereco;
    }

    // método estático excluir
    // método estático alterar
}

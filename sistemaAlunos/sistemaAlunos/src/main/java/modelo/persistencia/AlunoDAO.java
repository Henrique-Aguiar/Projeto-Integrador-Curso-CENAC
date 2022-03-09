/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Aluno;
import modelo.Endereco;

/**
 *
 * @author gdsant
 */
public class AlunoDAO {

    /**
     * Salva o registro de uma aluno no banco de dados.
     *
     * @param a objeto da classe Aluno, representando o aluno que será salvo no
     * banco de dados
     * @param codEndereco código do endereço que será vinculado ao aluno.
     * @return true: se o registro do aluno foi salvo<br>
     * false: se não foi possível salvar o registro.
     */
    public static boolean salvar(Aluno a, int codEndereco) throws Exception {
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

    /**
     * Exclui o registro do aluno com a dada matrícula do banco de dados.
     *
     * @param matricula a matrícula do registro do aluno que deverá ser
     * excluído.
     * @return true: se o registro foi excluído<br>
     * false: se o registro não pôde ser excluído.
     */
    public static boolean excluir(int matricula) throws Exception {
        Connection conexao = FabricaDeConexoes.getConnection();

        String sql = "DELETE FROM aluno WHERE matricula = ?";

        PreparedStatement comandoPreparado = conexao.prepareStatement(sql);

        comandoPreparado.setInt(1, matricula);

        comandoPreparado.execute();

        comandoPreparado.close();
        conexao.close();

        return true;
    }

    /**
     * Realiza uma busca por alunos de uma determinada série.
     *
     * @param serie a série da qual se deseja buscar os alunos.
     * @return vetor com os alunos da série recebida como parâmetro.
     */
    public static Aluno[] buscarPorSerie(int serie) throws Exception {

        Connection conexao = FabricaDeConexoes.getConnection();

        String sql = "SELECT * FROM aluno a, endereco e"
                + " WHERE serie = ? AND a.cod_endereco = e.cod_endereco";

        PreparedStatement comandoPreparado = conexao.prepareStatement(sql);

        comandoPreparado.setInt(1, serie);

        ResultSet resultado = comandoPreparado.executeQuery();

        Aluno[] alunos = new Aluno[getQtdBuscaPorSerie(serie)];

        int contAlunos = 0;

        while (resultado.next()) {

            int matricula = resultado.getInt("matricula");
            String nome = resultado.getString("nome");
            String telefone = resultado.getString("telefone");
            String situacao = resultado.getString("situacao");

            int codEndereco = resultado.getInt("cod_endereco");
            String cidade = resultado.getString("cidade");
            String bairro = resultado.getString("bairro");
            String rua = resultado.getString("rua");
            int numeroCasa = resultado.getInt("numero_casa");
            Endereco endereco = new Endereco(codEndereco, cidade, bairro,
                    rua, numeroCasa);

            Aluno a = new Aluno(matricula, nome, telefone, serie,
                    situacao, endereco);

            alunos[contAlunos] = a;

            contAlunos++;

        }

        comandoPreparado.close();

        conexao.close();

        return alunos;

    }

    public static int getQtdBuscaPorSerie(int serie) throws Exception {

        Connection conexao = FabricaDeConexoes.getConnection();

        String sql = "SELECT count(*) as qtd_alunos FROM aluno "
                + "WHERE serie = ?";

        PreparedStatement comandoPreparado = conexao.prepareStatement(sql);

        comandoPreparado.setInt(1, serie);

        ResultSet resultado = comandoPreparado.executeQuery();

        resultado.next();

        int qtdAlunos = resultado.getInt("qtd_alunos");

        resultado.close();

        comandoPreparado.close();

        conexao.close();

        return qtdAlunos;

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
        Connection conexao = FabricaDeConexoes.getConnection();

        String sql = "SELECT * FROM aluno a, endereco e"
                + " WHERE nome LIKE ? AND a.cod_endereco = e.cod_endereco";

        PreparedStatement comandoPreparado = conexao.prepareStatement(sql);

        comandoPreparado.setString(1, "%" + nome + "%");

        ResultSet resultado = comandoPreparado.executeQuery();

        Aluno[] alunos = new Aluno[getQtdBuscaPorNome(nome)];

        int contAlunos = 0;
      
        while (resultado.next()) {

            int matricula = resultado.getInt("matricula");
            nome = resultado.getString("nome");
            int serie = resultado.getInt("serie");
            String telefone = resultado.getString("telefone");
            String situacao = resultado.getString("situacao");

            int codEndereco = resultado.getInt("cod_endereco");
            String cidade = resultado.getString("cidade");
            String bairro = resultado.getString("bairro");
            String rua = resultado.getString("rua");
            int numero = resultado.getInt("numero_casa");
            Endereco endereco = new Endereco(codEndereco, cidade, bairro, rua, numero);

            Aluno a = new Aluno(matricula, nome, telefone, serie, situacao, endereco);

            alunos[contAlunos] = a;

            contAlunos++;

        }

        resultado.close();
        comandoPreparado.close();
        conexao.close();

        return alunos;
    }

    public static int getQtdBuscaPorNome(String nome) throws Exception {

        Connection conexao = FabricaDeConexoes.getConnection();

        String sql = "SELECT count(matricula) as qtd_alunos FROM aluno "
                + "WHERE nome LIKE ?";

        PreparedStatement comandoPreparado = conexao.prepareStatement(sql);

        comandoPreparado.setString(1, "%" + nome + "%");

        ResultSet resultado = comandoPreparado.executeQuery();

        resultado.next();

        int qtdAlunos = resultado.getInt("qtd_alunos");

        resultado.close();

        comandoPreparado.close();

        conexao.close();

        return qtdAlunos;

    }

    /**
     * Lista todos os alunos do banco de dados.
     *
     * @return vetor com todos os alunos cadastrados no banco de dados.
     */
    public static Aluno[] listarTodos() throws Exception {
        Connection conexao = FabricaDeConexoes.getConnection();

        String sql = "SELECT * FROM aluno";

        PreparedStatement comandoPreparado = conexao.prepareStatement(sql);

        ResultSet resultado = comandoPreparado.executeQuery();

        Aluno[] alunos = new Aluno[getQtdAlunosRegistrados()];
        int contAlunos = 0;

        while (resultado.next()) {
            int matricula = resultado.getInt("matricula");
            String nome = resultado.getString("nome");
            String telefone = resultado.getString("telefone");
            int serie = resultado.getInt("serie");
            String situacao = resultado.getString("situacao");
            Aluno a = new Aluno(matricula, nome, telefone, serie, situacao);
            alunos[contAlunos] = a;
            contAlunos++;
        }

        resultado.close();
        comandoPreparado.close();
        conexao.close();

        return alunos;
    }

    /**
     * Obtém a quantidade total de registros na tabela aluno.
     *
     * @return quantidade de alunos registrados.
     */
    public static int getQtdAlunosRegistrados() throws Exception {
        Connection conexao = FabricaDeConexoes.getConnection();

        String sql = "SELECT count(matricula) FROM aluno";

        PreparedStatement comandoPreparado = conexao.prepareStatement(sql);

        ResultSet resultado = comandoPreparado.executeQuery();

        resultado.next();

        int qtdAlunos = resultado.getInt("count(matricula)");

        resultado.close();
        comandoPreparado.close();
        conexao.close();
        return qtdAlunos;
    }

    /**
     * Faz alteração dos dados de um determinado aluno no banco de dados.
     *
     * @param a objeto da classe Aluno com os dados modificados, preservado o
     * id.
     * @return true: se foi possível realizar a alteração.<br>
     * false; se não foi possível realizar a alteração.
     */
    public static boolean alterar(Aluno a) throws Exception {
        Connection conexao = FabricaDeConexoes.getConnection();

        String sql = "UPDATE aluno SET nome = ?, telefone = ?, serie = ?, "
                + "situacao = ? WHERE matricula = ?";

        PreparedStatement comandoPreparado = conexao.prepareStatement(sql);

        comandoPreparado.setString(1, a.getNome());
        comandoPreparado.setString(2, a.getTelefone());
        comandoPreparado.setInt(3, a.getSerie());
        comandoPreparado.setString(4, a.getSituacao());
        comandoPreparado.setInt(5, a.getMatricula());

        comandoPreparado.execute();

        comandoPreparado.close();
        conexao.close();
        return true;
    }

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Emille
 */
public class Aluno {

    private String nome;
    private int matricula;
    private Endereco endereco;
    private String telefone;
    private int serie;
    private String situacao;

    public Aluno(int matricula, String nome, String telefone, int serie, String situacao) {
        
        this.matricula = matricula;
        this.nome = nome;
        this.telefone = telefone;
        this.serie = serie;
        this.situacao = situacao;
    }
    
    public Aluno(int matricula, String nome, String telefone, int serie, String situacao,
            Endereco endereco) {

        this.nome = nome;
        this.matricula = matricula;
        this.endereco = endereco;
        this.telefone = telefone;
        this.serie = serie;
        this.situacao = situacao;
    }
    
    public Aluno(String nome, String telefone, int serie, String situacao){
        this.nome = nome;   
        this.telefone = telefone;
        this.serie = serie;
        this.situacao = situacao;
    }
    
    public Aluno(String nome, String telefone, int serie, String situacao,
            Endereco endereco) {

        this.nome = nome;        
        this.endereco = endereco;
        this.telefone = telefone;
        this.serie = serie;
        this.situacao = situacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String toString() {
        return "nome: " + nome
                + "\nmatricula: " + matricula
                + "\nendereco: " + endereco
                + "\ntelefone: " + telefone
                + "\nserie: " + serie
                + "\nsituação: " + situacao;

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Aluno {
    private int matricula;
    private String nome;   
    private String telefone;
    private int serie;
    private String situacao;
    private Endereco endereco;
    
    public Aluno(int matricula, String nome, String telefone,
            int serie, String situacao, Endereco endereco){
        
        this.matricula = matricula;
        this.nome = nome;
        this.telefone = telefone;
        this.serie = serie;
        this.situacao = situacao;
        this.endereco = endereco;
    }
    
    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public String toString(){
        return "matricula: " + matricula
                + "\nnome: " + nome 
                + "\ntelefone: " + telefone
                + "\nsérie: " + serie
                + "\nsituação: " + situacao
                + "\nendereço: " + endereco;
    }
                
}

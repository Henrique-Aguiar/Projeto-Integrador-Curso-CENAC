/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Emille
 */
public class Endereco {

    private int codEndereco;
    private String rua;
    private String cidade;
    private String bairro;

    public Endereco(int codEndereco, String cidade, String bairro, String rua) {
        this.codEndereco = codEndereco;
        this.rua = rua;
        this.cidade = cidade;
        this.bairro = bairro;
    }

    public int getCodEndereco() {
        return codEndereco;
    }

    public void setCodEndereco(int codEndereco) {
        this.codEndereco = codEndereco;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;

    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String toString() {
        return "cidade: " + cidade
                + "\nbairro: " + bairro
                + "\nrua: " + rua;
    }
}

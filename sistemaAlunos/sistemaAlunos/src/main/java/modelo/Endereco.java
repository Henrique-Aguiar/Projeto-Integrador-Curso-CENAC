/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Emille
 */
public class Endereco {

    private int codEndereco;
    private String rua;
    private String cidade;
    private String bairro;
    private int numero;

    public Endereco(int codEndereco, String cidade, String bairro, String rua, int numero) {
        this.codEndereco = codEndereco;
        this.rua = rua;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = numero;
    }

    public Endereco(String cidade, String bairro, String rua, int numero) {
        this.rua = rua;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
                + "\nrua: " + rua
                + "\nnumero: " + numero;
    }

    public static void main(String[] args) {
        try {
            int opcao = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite a opção numérica"));

            System.out.println(opcao);
        } catch (NumberFormatException e) {
            System.out.println("Digite um número de endereço válido");
        }

    }

}

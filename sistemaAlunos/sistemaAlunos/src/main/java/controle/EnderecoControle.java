/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.Endereco;
import modelo.persistencia.EnderecoDAO;

/**
 *
 * @author gdsant
 */
public class EnderecoControle {

    // método estático cadastrar
    public static int cadastrar(String cidade, String bairro, String rua, int numero)
            throws Exception {

        if (cidade.isEmpty() || bairro.isEmpty() || rua.isEmpty()) {
            return 0;
        }

        Endereco e = new Endereco(cidade, bairro, rua, numero);
        int codEnderecoCadastrado = EnderecoDAO.salvar(e);
        return codEnderecoCadastrado;
    }

    // método estático alterar
    public static boolean alterar(Endereco e) throws Exception {
        if (e.getCidade().isEmpty() || e.getBairro().isEmpty() || e.getRua().isEmpty()
                || e.getNumero() <= 0) {
            return false;
        }

        return EnderecoDAO.alterar(e);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista3;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ex05 {
    
    public static void main(String[] args) {
        
        int opcao = 0;
        double valor = 0.0;
        
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Suco de Polpa: R$3.50"
                    + "\n2 - Suco de Laranja; R$5.00"
                    + "\n3 - Refrigerante Lata: R$3.00"
                    + "\n4 - Refrigerante Garrafa: R$2.20"
                    + "\nQual bebida você deseja?(0 para pedir a conta) "));
            if(opcao == 1){
                valor += 3.50;
            }else if(opcao == 2){
                valor += 5.00;
            }else if(opcao == 3){
                valor += 3.00;
            }else if(opcao == 4){
                valor += 2.20;
            }else if(opcao != 0){
                JOptionPane.showMessageDialog(null, "Opção invalida");
            }
        } while (opcao != 0);
        JOptionPane.showMessageDialog(null, "Total a pagar: R$" + valor);
                
    }
}

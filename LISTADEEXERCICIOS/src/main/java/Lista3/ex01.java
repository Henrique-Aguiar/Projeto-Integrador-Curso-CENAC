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
public class ex01 {
    
    
    public static void main(String[] args) {
        
        int soma = 0;
        int numeros = 0;
        float media = 0;
        
        for (int i = 0; i < 10; i++) {           
            numeros = Integer.parseInt(JOptionPane.showInputDialog(
                    "Informe um número: "));
            soma = soma + numeros;        
        }
        media = soma / 10;
        JOptionPane.showMessageDialog(null, "A soma total dos números é: " + soma
                + "\nE a média dos números é: " + media);
        
    }
}

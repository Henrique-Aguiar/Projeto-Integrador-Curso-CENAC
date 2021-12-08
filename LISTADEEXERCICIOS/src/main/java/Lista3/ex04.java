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
public class ex04 {
    
    public static void main(String[] args) {
        
        int numeros = 1;
        int soma = 0;
        do {
            numeros = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite um número (0 para encerrar): "));
            if(numeros >= 1){
               soma += numeros; 
            }
        }while (numeros != 0);
        
        JOptionPane.showMessageDialog(null, "A soma dos números positivos é: "
        + soma);
        
        
       
    }
}

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
public class ex03 {
    
    
    public static void main(String[] args) {
        
        int idade = 0;
        int quant = 0;       
        
              
        for(int i = 0; i < 10; i++){
            idade = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite uma idade: "));
            if(idade >= 18) {
                quant = quant + 1;
            }    
        }
        JOptionPane.showMessageDialog(null, 
                    "Quantidade de pessoas maiores de idade: " + quant);
    }
}

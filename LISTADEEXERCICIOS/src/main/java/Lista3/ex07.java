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
public class ex07 {
    public static void main(String[] args) {
        String nome[] = new String[21];
        int opcao = 0; 
        
        for(int i = 1; i <=20; i++) {
            nome[i] = JOptionPane.showInputDialog("Digite o " + i + "º nome: ");
            
        }
        while(opcao != 4){
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1- Listar Nomes."
                    + "\n2- Buscar Nome."
                    + "\n3- Alterar Nome."
                    + "\n4- Sair"));
            if(opcao == 1){
                for(int i = 1; i <=20; i++) {                  
                    System.out.println("\nNome" + i + " " + nome[i]);
                }             
            }else if(opcao == 2){
                
            }
                
                
        }
        
    }
    
}

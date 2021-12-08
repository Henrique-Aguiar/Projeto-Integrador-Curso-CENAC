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
public class ex06 {
    public static void main(String[] args) {
        double salario[] = new double[11];
        double soma = 0;
        double fgts[] = new double[11];
        double somafgts = 0;
        int opcao = 0;
        for (int i = 1; i <= 10; i++) {
           salario[i] = Double.parseDouble(JOptionPane.showInputDialog(
                    "Digite o salário do funcionario N" + i + " R$"));
           soma += salario[i];
           fgts[i] = salario[i] * 8/100;
           somafgts += fgts[i];
            
        }
        
        while (opcao != 4) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "1- Calcular total a pagar para funcionários."
                  + "\n2- Listar salários e valor de FGTS."
                  + "\n3- Calcular total a pagar de FGTS."
                  + "\n5- SAIR."));
            
            if(opcao == 1) {
                JOptionPane.showMessageDialog(null, "Total a pagar: R$" + soma);
            }else if(opcao == 2) {
                JOptionPane.showMessageDialog(null, "Salários e valor de FGTS");
                for(int i = 1; i <= 10; i++) {
                    JOptionPane.showMessageDialog(null, "Funcionario N" + i
                    + "\nsalário R$" + salario[i] + "\nFGTS R$" + fgts[i] + "\n");
                }
            }else if(opcao == 3) {
                JOptionPane.showMessageDialog(
                        null, "Total a pagar de FGTS: R$" + somafgts);
            }else if(opcao != 4) {
                JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA!");
            }
        }
            
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio05;

import javax.swing.JOptionPane;

public class decisao {

    void idade() {

        try {

            int idade = Integer.parseInt(JOptionPane.showInputDialog("digite sua idade: "));

            if (idade >= 18) {
                System.out.println("Maioridade");
            } else {
                System.out.println("Menor de idade");
            }

        } catch (Exception e) {
            System.out.println("caractere invalido, digite novamente");
        }
    }

    void soma() {
        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));

            int soma = a + b;

            JOptionPane.showMessageDialog(null, "Valor da soma: " + soma);
        } catch (Exception e) {
            System.out.println("Caractere inválido digite novamente");
        }
    }

    void sub() {
        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a: "));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b: "));

            int sub = a - b;

            JOptionPane.showMessageDialog(null, "Valor da sub: " + sub);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Caractere inválido!");
        }
    }
    
    
    
    

}

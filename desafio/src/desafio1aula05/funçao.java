/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio1aula05;

import javax.swing.JOptionPane;

public class funçao {

    void area() {
        try {
            int decisao = Integer.parseInt(JOptionPane.showInputDialog("Você deseja calcular um triagulo(opção 1). quadrado (opção 2) ou retangulo(opção 3) : "));
            if (decisao == 1 || decisao == 2 || decisao == 3) {
                
                int base = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da base: "));
                if(base <=0){
                    JOptionPane.showMessageDialog(null, "Digite um valor válido");
                } else {
                    
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da altura: "));
                 if(altura <=0){
                    JOptionPane.showMessageDialog(null, "Digite um valor válido");
                } else {
                if (decisao == 1) {
                    int triangulo = (base * altura) / 2;
                    JOptionPane.showMessageDialog(null, "a aréa do seu triângulo é: " + triangulo);
                } else if (decisao == 2) {
                    int quadrado = (base * altura);
                    JOptionPane.showMessageDialog(null, "a aréa do seu quadrado é: " + quadrado);
                } else if (decisao == 3) {
                    int retangulo = (base * altura);
                    JOptionPane.showMessageDialog(null, "a aréa do seu retângulo é: " + retangulo);
                } else {
                    JOptionPane.showMessageDialog(null, "Digite um valor válido");
                }
                }
                }

            }else{
                JOptionPane.showMessageDialog(null, "Digite um valor válido");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite um valor válido");
        }

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;

import java.util.Scanner;

/**
 *
 * @author CAMARGO
 */
public class ex02 {
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        
        
        System.out.print("Digite o valor de A: ");
        int a = x.nextInt();
                
        System.out.print("Digite o valor de B: ");
        int b = x.nextInt();
        
        int soma = a + b;
        int divisao = a / b;
        
        System.out.println("A soma é: " + soma);
        System.out.println("A divisão é: " + divisao);
        System.out.println("A multiplicação é: " + a * b);
        System.out.println("A subtração é: " + (a - b));
        
        System.out.println("Bem vindo a calculadora de IMC de um homem de 45 anos e de signo de touro!");
        
        System.out.println("Digite sua altura: ");
        int altura = x.nextInt();
        
        System.out.println("Digite seu peso: ");
        int peso = x.nextInt();
        
        System.out.println("Seu IMC é igual a: " + peso / (altura * altura));
        
    }
}

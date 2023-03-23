/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade;

/**
 *
 * @author CAMARGO
 */
public class atividade {
    
    void Ex01(){
        
        int somaPar = 0;
        int somaImpar = 0;
        
        for(int i = 0; i <= 100; i++){
        
            if(i % 2 == 0){
                somaPar = somaPar + i;
            } else {
                somaImpar = somaImpar + i;
            }
        }
    
        if (somaPar > somaImpar) {
            System.out.println("O valor da maior soma é: " + somaPar);   
        } else {
            System.out.println("O valor da maior soma é: " + somaImpar);
        }
    
    }
    
}

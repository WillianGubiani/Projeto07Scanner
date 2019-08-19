/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto07scanner;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Projeto07Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Classe SCANNER deve ser importada de
        dentro do pacote java.util.Scanner
        usando a palavra reservada NEW
        qu eé responsável pela instanciação de objetos
        de uma classe JAVA.
        */
        
        /*
        Criar um programa que receba ENTRADA de
        2 (dois) valor (num1 e num2) e verifique
        qual o maior numero entra os dois     
        */
        
        String nome = "Gubiani";
        Scanner entrada = new Scanner(System.in);
        
        int num1, num2;
        System.out.println("Digite o primeiro número");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo número");
        num2 = entrada.nextInt();
        //Valores atribuidos a num1 e num2
        System.out.println("Valor NUM1: " + num1);
        System.out.println("Valor NUM2: " + num2);
        
        if (num1 > num2){
            System.out.println("Maior número é: " + num1);
            System.out.println("Maior número é: " + num2);
        }
        else {
            System.out.println("Maior número é: " + num2);
            System.out.println("Maior número é: " + num1);
        }
    }
}

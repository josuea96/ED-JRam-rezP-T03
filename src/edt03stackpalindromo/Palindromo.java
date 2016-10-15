/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edt03stackpalindromo;

import EstructurasdeDatos.Stacks;
import java.util.Scanner;

/**
 *
 * @author josuealexis96
 */
public class Palindromo {
    
    Stacks node1 = new Stacks();
    Stacks node2 = new Stacks();
    
    public static String crearString(){
        String p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la frase o palabra que deseas usar");
        p = sc.nextLine();//Guardamos la palabra o la frase dada en el string
        return p;//Regresa el String
    }
    
    public char[] palindromo(String pa){
        int i2 = 0;
        Stacks s = new Stacks();
        pa.toLowerCase();
        pa = pa.replace(" ", "");
        pa = pa.replace(",", "");
        pa = pa.replace(".", "");
        char [] caracteres = pa.toCharArray();
        char [] caracter2 = new char [caracteres.length];
        
        for(int i = caracteres.length - 1, j = 0; j < caracteres.length; i--, j++){
            caracter2[j] = caracteres[i];
            System.out.print("[" + caracteres[i] + "]");
        }

        do {
            node1.push(caracteres[i2]);
            ++i2;
        }while(caracteres.length != i2);
        
        i2 = 0;
        
        do {
            node2.push(caracter2[i2]);
            ++i2;
        }while(caracteres.length != i2);
        
        return caracteres;
    }
    
    public boolean verificarPalindromo(char [] caracteres){
        for(int i = 0; i < caracteres.length; i++){
            if(node1.getTop().getData() == node2.getTop().getData()){
                node1.pop();
                node2.pop();
            }
            else{
                return false;
            }
        }
        return true;
    }
}

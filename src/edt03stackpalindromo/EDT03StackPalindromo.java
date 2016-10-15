//Josué Alexis Ramírez Pérez 513622 4º Semestre
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edt03stackpalindromo;
/**
 *
 * @author josuealexis96
 */
public class EDT03StackPalindromo{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Palindromo sp = new Palindromo();
        String palabra;
        palabra = sp.crearString();
        if(sp.verificarPalindromo(sp.palindromo(palabra))){
            System.out.println("La palabra o frase es palindromo");
        }
        else{
            System.out.println("La palabra o frase no es palindromo");
        }
        
    }
}
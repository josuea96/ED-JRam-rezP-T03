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
public class EDT03StackPalindromo{//Clase Main
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Palindromo sp = new Palindromo();//Primero que nada se crea un objeto
        //para mandar a llamar a los metodos que estan en la clase palindromo y utilizarlos
        String palabra;//Empezamos creando nuestras variables que en este caso es un string
        //ya que se estara trabajando con una palabra y verificar si es o no un palindromo
        palabra = sp.crearString();//El string que acabamos de crear lo igualamos a
        //un metodo que tenemos en la clase palindromo que sirve para crear una palabra o frase
        if(sp.verificarPalindromo(sp.palindromo(palabra))){//
            System.out.println("La palabra o frase es palindromo");
        }
        else{
            System.out.println("La palabra o frase no es palindromo");
        }
        
    }
}
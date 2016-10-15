//Josué Alexis Ramírez Pérez 513622 4º Semestre
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
    
    /**
     * 
     * @return 
     */
    public static String crearString(){
        String p;//Se crea una variable de tipo string donde guardaremos nuestra palabra o frase
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la frase o palabra que deseas usar");//Se le solicita al usuario
        //la palabra o frase que desee
        p = sc.nextLine();//Guardamos la palabra o la frase dada en el string
        return p;//Regresa el String
    }
    
    /**
     * 
     * @param pa como un parametro de tipo String
     * @return 
     */
    public char[] palindromo(String pa){
        int i2 = 0;
        Stacks s = new Stacks();//Se crea un objeto para mandar a llamar a los metodos que estan en la
        //libreria, pero unicamente las pilas (stacks)
        pa.toLowerCase();//La palabra que se inición anteriormente se cambia todo a minusculas para que de
        //esta forma la obtención del palindromo sea mucho mas sencilla
        pa = pa.replace(" ", "");//Se eliminan todos los puntos, comas y espacios para que la palabra quede
        //junta
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
    
    /**
     * 
     * @param caracteres de la palabra creada anterioremente
     * @return un true o un false
     */
    public boolean verificarPalindromo(char [] caracteres){
        for(int i = 0; i < caracteres.length; i++){//Se crea un ciclo for para ir
            //recorriendo caracter por caracter
            if(node1.getTop().getData() == node2.getTop().getData()){//Se crea un ciclo if dentro del for
                //en donde se estara tomando los tados de la 
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

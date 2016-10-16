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
    
    Stacks node1 = new Stacks();//Se crean dos nodos fuera de los metodos para que puedan ser utilizados
    //por los mismos y de esta manera tener dos pilas distintas para poder comparar los caracteres
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
        char [] caracteres = pa.toCharArray();//Se cambia la palabra o frase a caracteres
        char [] caracter2 = new char [caracteres.length];//Se crea otra variable de tipo char que contenga
        //la misma longitud de caracteres 
        
        for(int i = caracteres.length - 1, j = 0; j < caracteres.length; i--, j++){//Se entra a un ciclo for
            //en donde se va a estar comparando
            caracter2[j] = caracteres[i];//En la otra variable de tipo char que se creó se van guardando
            //los mismos caracteres mientras se va recorriendo
            System.out.print("[" + caracteres[i] + "]");//Se imprimen los caracteres
            System.out.println("");
        }

        do {//Realiza una condición
            node1.push(caracteres[i2]);//Se utiliza un nodo para guardar los caracteres en una pila
            ++i2;//y se va recorriendo en uno
        }while(caracteres.length != i2);//hasta que el tamaño de caracteres sea diferente del ultimo caracter
        
        i2 = 0;
        
        do {
            node2.push(caracter2[i2]);//Se utiliza el siguiente nodo para guardar los caracteres en otra pila
            ++i2;//y se va recorriendo en uno como en el caso anterior
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
                //en donde se estara tomando los datos de la los tops tanto del nodo1 como el del nodo2
                node1.pop();//Mientras se hace la comparación, se van sacando los caracteres
                node2.pop();
            }
            else{//Si el ciclo if no se cumple, se da por hecho que no es palindromo dado que unas letras
                //son diferentes
                return false;//y por ende se regresa un false
            }
        }//De no ser este el caso, se regresa un true
        return true;
    }
}

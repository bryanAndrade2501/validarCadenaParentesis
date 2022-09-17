package com.ejercicio3;

import java.util.Stack;

public class pilaStack {
    public static boolean verificar(String cadena){
        //Se crea una pila, tambien se crea un contador que empieza en cero
        Stack<String> pila = new Stack<String>(); int i = 0;
        //entra en un ciclo while que recorre el string dado
        while(i<cadena.length()){
            if(cadena.charAt(i)=='('){ //si el caracter i del string es igual a (, entonces añade un ( a la pila
                pila.push("(");
                System.out.println("Lee el caracter (, por tanto, Añade un elemento ( a la pila: " + pila); //se imprime la pila
            }else if (cadena.charAt(i)==')'){//si el caracter i del String es igual a ), entonces se genera un condicional if
                if(!pila.empty()){
                    pila.pop(); //si la pila no se encuentra vacía, entonces elimina el ultimo elemento de la pila
                    System.out.println("Lee el caracter ), como la pila no esta vacia, Elimina el ultimo elemento de la pila: " + pila); //se imprime la pila
                }
                else{
                    pila.push(")"); //por otro lado, si la pila esta vacía, añade un elemento ) a la pila
                    System.out.println("Lee el caracter ), como la pila esta vacia, añade ) a la pila y finaliza la ejecución: " + pila); //se imprime la pila
                    break; //se termina la ejecucion, por esta razon el string no
                }
            }
            i++;
        }
        if(pila.empty()){ //verifica si la cola se encuentra vacía
            System.out.println("La pila esta vacia");
            return true; //si la cola esta vacia, entonces devuelve el valor true
        }else{
            System.out.println("La pila no esta vacia");
            return false;//si la cola no esta vacia, entonces devuelve el valor false
        }
    }
}

package com.ejercicio3;
import static com.ejercicio3.pilaStack.verificar;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String cadena1 = "(Cadena1 --> (()()()))))";
        String cadena2 = "(Cadena2 --> ())";
        String cadena3 = ")(()(()))(";
        String cadena4 = "(())";
        String cadena5 = "())(";
        System.out.println("Verificacion 1, verifica si existe el mismo numero de ( y ), y si se encuentran en orden:primero ( y luego con ), en este caso no se cumplen las 2 condiciones, por tanto da como resultado false");
        System.out.println(verificar(cadena1));
        System.out.println("Verificacion 2, verifica si existe el mismo numero de ( y ), y si se encuentran en orden:primero ( y luego con ), en este caso si se cumplen las 2 condiciones, por tanto da como resultado true");
        System.out.println(verificar(cadena2));
        System.out.println("Verificacion 3, verifica si existe el mismo numero de ( y ), y si se encuentran en orden:primero ( y luego con ), en este caso no se cumplen las 2 condiciones, por tanto da como resultado false");
        System.out.println(verificar(cadena3));
        System.out.println("Verificacion 4, verifica si existe el mismo numero de ( y ), y si se encuentran en orden:primero ( y luego con ), en este caso si se cumplen las 2 condiciones, por tanto da como resultado true");
        System.out.println(verificar(cadena4));
        System.out.println("Verificacion 5, Verificacion 3, verifica si existe el mismo numero de ( y ), y si se encuentran en orden:primero ( y luego con ), en este caso no se cumplen las 2 condiciones, por tanto da como resultado false\"");
        System.out.println(verificar(cadena5));
    }
}

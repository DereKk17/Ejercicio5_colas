package Test;

import Ejercicio5.Funciones;
import TdaCola.ColaCircular;

import java.util.LinkedList;
import java.util.Queue;

public class App {

    static Funciones simulacion = new Funciones();

    public static void main(String[] args) {

        Queue<Integer> numeros1 = new LinkedList<>();
        Queue<Integer> numeros2 = new LinkedList<>();

        Queue<Integer> numeros3 = new LinkedList<>();
        Queue<Integer> numeros4 = new LinkedList<>();

        numeros3.add(4);
        numeros4.add(4);
        numeros3.add(-125);
        numeros4.add(-125);
        numeros3.add(6);
        numeros4.add(-90);


        llenar(numeros1, numeros2);

        System.out.println(numeros1);
        System.out.println(numeros2);

        System.out.println(simulacion.iguales(numeros1, numeros2));
        System.out.println(simulacion.iguales(numeros3, numeros4));
    }

    public static void llenar(Queue<Integer> cola1, Queue<Integer> cola2){
        for(int i = 0; i < 1; i++){
            cola1.add((int) Math.floor(Math.random()*(125-(-125)+1)-125));
            cola2.add((int) Math.floor(Math.random()*(125-(-125)+1)-125));
        }
    }

}

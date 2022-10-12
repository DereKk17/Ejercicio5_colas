package Ejercicio5;

import java.util.Queue;

public class Funciones {

    public int iguales(Queue<Integer> cola1, Queue<Integer> cola2){
        if(cola2.isEmpty())
        {
            return 1;
        }
        else if(cola1.peek() != cola2.peek())
        {
            return -1;
        }
        else
        {
            cola1.poll();
            cola2.poll();
            return iguales(cola1, cola2);
        }
    }

}

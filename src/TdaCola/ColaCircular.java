package TdaCola;

public class ColaCircular<T>
{
    private Object []cola;

    private int frente;
    private int fin;

    private int size = 200;

    private int tamanio = 0;

    public ColaCircular() {
        this.cola = new Object[size];
        this.frente = 0;
        this.fin = size - 1;
    }

    private int siguiente(int s){
        return (s + 1) % size;
    }

    public boolean isEmpty(){
        return frente == siguiente(fin);
    }

    public boolean llena(){
        return frente == siguiente(siguiente(frente));
    }

    public int size(){
        return tamanio;
    }

    public void encolar(Object dato){
        if(!llena()){
            fin = siguiente(fin);
            cola[fin] = dato;
            tamanio ++;
        }
        else{
            System.out.println("cola llena");
        }
    }

    public Object desencolar(){

        if(!isEmpty()){
            Object borrado = cola[frente];
            frente = siguiente(frente);
            tamanio --;
            return borrado;
        }
        else{
            return "cola vacia";
        }
    }
}

package org.example;

public class AutomataFinitoMatriz extends AutomataFinito{
    private int [][] matrix;

    public AutomataFinitoMatriz(int num, int alfabeto) {
        super(num, alfabeto);
        this.matrix=new int[num][alfabeto];
    }

    @Override
    public void cierreTransicion(int estado, int[] cadena) {
        cadena[this.]
    }

    @Override
    public boolean perteneceLenguaje(int[] cadena) {

    }

    @Override
    public int transicion(int estado, int letra) {
        return this.matrix[estado][letra];
    }
}

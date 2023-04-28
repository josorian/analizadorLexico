package org.example;

abstract class AutomataFinito {
    private int numEstados;
    private boolean[] finales;
    private int tamAlfabero;
    public AutomataFinito(int num,int alfabeto){
        this.numEstados=num;
        this.tamAlfabero=alfabeto;
        this.finales=new boolean[numEstados];
        for(int i=0;i<this.numEstados;i++){
            this.finales[i]=false;
        }
    }
    public AutomataFinito(int num,int alfabeto,boolean [] finales){
        this.numEstados=num;
        this.tamAlfabero=alfabeto;
        this.finales=finales;
    }
    public void marcarFinal(int estado){
        this.finales[estado]=true;
    }

    public void setFinales(boolean[] finales) {
        this.finales = finales;
    }

    public int getNumEstados() {
        return numEstados;
    }

    public boolean[] getFinales() {
        return finales;
    }
    public boolean isEstadoFianl(int estado){
        return this.finales[estado];
    }
    public abstract void cierreTransicion(int estado,int cadena[]);
    public abstract boolean perteneceLenguaje(int [] cadena);
    public abstract int transicion(int estado,int letra);
}

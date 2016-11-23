/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Usuario
 */
public class Nodo {
    private boolean visitado;
    private String valor;
    private Nodo Arriba;
    private Nodo Abajo;
    private Nodo Izquierdo;
    private Nodo Derecho;
    private Nodo anterior;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    public Nodo(){
        visitado=false;
        Arriba=null;
        Abajo=null;
        Izquierdo=null;
        Derecho=null;
        anterior=null;
        valor=" ";
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public Nodo getArriba() {
        return Arriba;
    }

    public void setArriba(Nodo Arriba) {
        this.Arriba = Arriba;
    }

    public Nodo getAbajo() {
        return Abajo;
    }

    public void setAbajo(Nodo Abajo) {
        this.Abajo = Abajo;
    }

    public Nodo getIzquierdo() {
        return Izquierdo;
    }

    public void setIzquierdo(Nodo Izquierdo) {
        this.Izquierdo = Izquierdo;
    }

    public Nodo getDerecho() {
        return Derecho;
    }

    public void setDerecho(Nodo Derecho) {
        this.Derecho = Derecho;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    
    
}

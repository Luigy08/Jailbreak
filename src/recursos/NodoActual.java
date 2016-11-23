package recursos;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class NodoActual {
    private String tipoNodo;
    private int siguienteNodo;
    private int fila;
    private int columna;

    public NodoActual() {
    }

    public String getTipoNodo() {
        return tipoNodo;
    }

    public void setTipoNodo(String tipoNodo) {
        this.tipoNodo = tipoNodo;
    }

    public int getSiguienteNodo() {
        return siguienteNodo;
    }

    public void setSiguienteNodo(int siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    
}

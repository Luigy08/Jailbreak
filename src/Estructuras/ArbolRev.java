/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;
/**
 *
 * @author Usuario
 */
public class ArbolRev {
    private Nodo raiz;
    private Nodo ultimaHoja;
    public ArbolRev(){
        this.raiz=null;
        this.ultimaHoja=null;
    }
    public ArbolRev(Nodo raiz) {
        this.raiz = raiz;
    }
    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo getUltimaHoja() {
        return ultimaHoja;
    }

    public void setUltimaHoja(Nodo ultimaHoja) {
        this.ultimaHoja = ultimaHoja;
    }
    
    
}

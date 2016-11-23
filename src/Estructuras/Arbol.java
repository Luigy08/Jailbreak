/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;
/**
 *
 * @author Usuario
 */
public class Arbol {
    private Nodo raiz;
    private Nodo ultimaHoja;
    public Arbol(){
        this.raiz=null;
        this.ultimaHoja=null;
    }
    public Arbol(Nodo raiz) {
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

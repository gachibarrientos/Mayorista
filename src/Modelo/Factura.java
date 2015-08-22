/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @Creado por.. Gachi
 */
public class Factura {

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public Factura(int nro) {
        this.nro = nro;
    }

    public Factura() {
    }
    private int nro;
}

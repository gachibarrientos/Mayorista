/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @Creado por.. Gachi
 */
public class Mayorista {

    public String getCUIT() {
        return CUIT;
    }

    public void setCUIT(String CUIT) {
        this.CUIT = CUIT;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Mayorista() {
    }

    public Mayorista(String direccion, String CUIT) {
        this.direccion = direccion;
        this.CUIT = CUIT;
    }
    private String direccion, CUIT;
}

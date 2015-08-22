/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @Creado por.. Gachi
 */
public class DomicilioCli extends Cliente{

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public ArrayList<DomicilioCli> getDomicilios() {
        return domicilios;
    }

    public void setDomicilios(ArrayList<DomicilioCli> domicilios) {
        this.domicilios = domicilios;
    }

    public DomicilioCli(String direccion, int num) {
        this.direccion = direccion;
        this.num = num;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

   

    public DomicilioCli() {
    }
    private String direccion;
    private int num;
}

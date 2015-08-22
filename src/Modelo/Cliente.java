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
public class Cliente{

    public Cliente(int CUIT, int tel, String CT, String Nombre, String Apellido) {
        this.CUIT = CUIT;
        this.tel = tel;
        this.CT = CT;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }
    
    ArrayList<DomicilioCli> domicilios = new ArrayList<DomicilioCli>();
    private int CUIT, tel;
    private String CT, Nombre, Apellido;
    
    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCT() {
        return CT;
    }

    public void setCT(String CT) {
        this.CT = CT;
    }

    public int getCUIT() {
        return CUIT;
    }

    public void setCUIT(int CUIT) {
        this.CUIT = CUIT;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }




    public Cliente() {
    }
    
    public void agregarDireccion(DomicilioCli d){
    domicilios.add(d);
    }

}

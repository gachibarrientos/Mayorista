/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @Creado por.. Gachi
 */
public class Cheque {

    public Cheque() {
    }

    public Cheque(int nro, String fp, String fe, String titular, double importe) {
        this.nro = nro;
        this.fp = fp;
        this.fe = fe;
        this.titular = titular;
        this.importe = importe;
    }
    private int nro;
    private String fp, fe, titular;
    private double importe;

    /**
     * @return the nro
     */
    public int getNro() {
        return nro;
    }

    /**
     * @param nro the nro to set
     */
    public void setNro(int nro) {
        this.nro = nro;
    }

    /**
     * @return the fp
     */
    public String getFp() {
        return fp;
    }

    /**
     * @param fp the fp to set
     */
    public void setFp(String fp) {
        this.fp = fp;
    }

    /**
     * @return the fe
     */
    public String getFe() {
        return fe;
    }

    /**
     * @param fe the fe to set
     */
    public void setFe(String fe) {
        this.fe = fe;
    }

    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * @return the importe
     */
    public double getImporte() {
        return importe;
    }

    /**
     * @param importe the importe to set
     */
    public void setImporte(double importe) {
        this.importe = importe;
    }
    
}

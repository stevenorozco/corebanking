/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Steven
 */
public class Referencia {
    String tipoReferencia; 
    String nombre; 
    String apellido; 
    int cedula; 
    int numeroFijo; 
    int celular; 

    public Referencia(String tipoReferencia, int cedula) {
        this.tipoReferencia = tipoReferencia;
        this.cedula = cedula;
    }

    public String getTipoReferencia() {
        return tipoReferencia;
    }

    public void setTipoReferencia(String tipoReferencia) {
        this.tipoReferencia = tipoReferencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getNumeroFijo() {
        return numeroFijo;
    }

    public void setNumeroFijo(int numeroFijo) {
        this.numeroFijo = numeroFijo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    
    
}

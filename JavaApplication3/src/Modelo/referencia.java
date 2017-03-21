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
public class referencia {
    String tipo_referencia; 
    String nombre; 
    String apellido; 
    int cedula; 
    int numero_fijo; 
    int celular; 

    public referencia(String tipo_referencia, int cedula) {
        this.tipo_referencia = tipo_referencia;
        this.cedula = cedula;
    }

    public String getTipo_referencia() {
        return tipo_referencia;
    }

    public void setTipo_referencia(String tipo_referencia) {
        this.tipo_referencia = tipo_referencia;
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

    public int getNumero_fijo() {
        return numero_fijo;
    }

    public void setNumero_fijo(int numero_fijo) {
        this.numero_fijo = numero_fijo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
    
    
    
}

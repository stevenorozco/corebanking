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
public class Cliente {
    String nombres; 
    String apellidos; 
    String tipo_persona; //si es persona natural o juridica
    int cedula; 
    int nit; //si es juridica 
    String razon_social; //si es juridica 
    String genero; 
    int promedio_ingresos_mes;
    int promedio_egresos_mes; 
    String actividad_economica; //descripcion principal actividad economica

    public Cliente(String tipo_persona, int cedula) {
        this.tipo_persona = tipo_persona;
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipo_persona() {
        return tipo_persona;
    }

    public void setTipo_persona(String tipo_persona) {
        this.tipo_persona = tipo_persona;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPromedio_ingresos_mes() {
        return promedio_ingresos_mes;
    }

    public void setPromedio_ingresos_mes(int promedio_ingresos_mes) {
        this.promedio_ingresos_mes = promedio_ingresos_mes;
    }

    public int getPromedio_egresos_mes() {
        return promedio_egresos_mes;
    }

    public void setPromedio_egresos_mes(int promedio_egresos_mes) {
        this.promedio_egresos_mes = promedio_egresos_mes;
    }

    public String getActiuvidad_economica() {
        return actividad_economica;
    }

    public void setActiuvidad_economica(String actiuvidad_economica) {
        this.actividad_economica = actiuvidad_economica;
    }
    
    
    
}

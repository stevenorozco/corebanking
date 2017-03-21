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
    String tipoPersona; //si es persona natural o juridica
    int cedula; 
    int nit; //si es juridica 
    String razonSocial; //si es juridica 
    String genero; 
    int promediIngresosMes;
    int promedioEgresosMes; 
    String actividadEconomica; //descripcion principal actividad economica

    public Cliente(String tipoPersona, int cedula) {
        this.tipoPersona = tipoPersona;
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

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
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

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPromediIngresosMes() {
        return promediIngresosMes;
    }

    public void setPromediIngresosMes(int promediIngresosMes) {
        this.promediIngresosMes = promediIngresosMes;
    }

    public int getPromedioEgresosMes() {
        return promedioEgresosMes;
    }

    public void setPromedioEgresosMes(int promedioEgresosMes) {
        this.promedioEgresosMes = promedioEgresosMes;
    }

    public String getActividadEconomica() {
        return actividadEconomica;
    }

    public void setActividadEconomica(String actividadEconomica) {
        this.actividadEconomica = actividadEconomica;
    }

  

    
    
    
}

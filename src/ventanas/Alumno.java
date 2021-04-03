/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class Alumno implements Serializable {
    
    private String nombre;
    private String paterno;
    private String materno;
    private String matricula;
    private Double calificacion;
    private Carrera carrera;
    
    public Alumno(String nombre, String paterno, String materno, String matricula, Double calificacion, Carrera carrera){
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.matricula = matricula;
        this.calificacion = calificacion;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
    
}

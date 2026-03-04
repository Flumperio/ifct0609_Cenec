package com.example.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Asistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String id_alumno;
    private String id_curso;
    private String fecha_asistencia;

    // Getters y Setters

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getId_alumno() {
        return id_alumno;
    }
    public void setId_alumno(String id_alumno) {
        this.id_alumno = id_alumno;
    }
    public String getId_curso() {
        return id_curso;
    }
    public void setId_curso(String id_curso) {
        this.id_curso = id_curso;
    }
    public String getFecha_asistencia() {
        return fecha_asistencia;
    }
    public void setFecha_asistencia(String fecha_asistencia) {
        this.fecha_asistencia = fecha_asistencia;
    }
}

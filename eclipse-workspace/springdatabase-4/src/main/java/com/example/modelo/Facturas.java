package com.example.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Facturas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_factura;

    private String id_alumno;
    private String importe;
    private String pagado;


    // Getters y Setters

    public Integer getId_factura() {
        return id_factura;
    }

    public void setId_factura(Integer id_factura) {
        this.id_factura = id_factura;
    }

    public String getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(String id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getImporte() {
        return importe;
    }

    public void setImporte(String importe) {
        this.importe = importe;
    }

    public String getPagado() {
        return pagado;
    }

    public void setPagado(String pagado) {
        this.pagado = pagado;
    }
}

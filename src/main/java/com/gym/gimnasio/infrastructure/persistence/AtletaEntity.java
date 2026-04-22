package com.gym.gimnasio.infrastructure.persistence;
import jakarta.persistence.*;

@Entity
@Table(name = "Atletas")    
public class AtletaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String fechaNacimiento;
    private double pesoActual;
    public AtletaEntity() {}

    public AtletaEntity(Long id, String nombre, String fechaNacimiento, double pesoActual) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.pesoActual = pesoActual;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    } 

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

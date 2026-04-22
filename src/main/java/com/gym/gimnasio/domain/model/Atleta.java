package com.gym.gimnasio.domain.model;
import java.time.LocalDate;

public class Atleta {
    
    private Long id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private double pesoActual;

        public Atleta() {}

        public Atleta(Long id, String nombre, LocalDate fechaNacimiento, double pesoActual) {
            this.id = id;
            this.nombre = nombre;
            this.fechaNacimiento = fechaNacimiento;
            this.pesoActual = pesoActual;
        }

        public boolean puedeRegistrarPeso(double nuevoPeso, LocalDate fechaUltimoPesaje) {
            return nuevoPeso > 0 && nuevoPeso < 500 && fechaUltimoPesaje.isBefore(LocalDate.now().minusDays(1));
        }

        public Long getId() {
            return id;
        }

        //getters y setters

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        
        public LocalDate getFechaNacimiento() {
            return fechaNacimiento;
        }

        public void setFechaNacimiento(LocalDate fechaNacimiento) {
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

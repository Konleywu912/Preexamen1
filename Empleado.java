/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paracticarrato;

import java.io.Serializable;

/**
 *
 * @author leyma
 */
public class Empleado implements Serializable {
     private String nombre;
    private String cedula;
    private String puesto;
    private String departamento;
    private double salario;
    private String fechaIngreso;

    // Constructor
    public Empleado (String nombre, String cedula, String puesto, String departamento, double salario, String fechaIngreso) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.puesto = puesto;
        this.departamento = departamento;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getCedula() { return cedula; }
    public String getPuesto() { return puesto; }
    public String getDepartamento() { return departamento; }
    public double getSalario() { return salario; }
    public String getFechaIngreso() { return fechaIngreso; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCedula(String cedula) { this.cedula = cedula; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }
    public void setSalario(double salario) { this.salario = salario; }
    public void setFechaIngreso(String fechaIngreso) { this.fechaIngreso = fechaIngreso; }

    // Método para calcular el aguinaldo
    public double calcularAguinaldo() {
        return salario * 12;
    }
    
}

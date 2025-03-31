package edu.comillas.icai.gitt.pat.spring.mvc;


import jakarta.persistence.*;

@Entity
public class Motocicleta {
    @Id
    @GeneratedValue
    private Long id;

    private String marca;
    private String modelo;
    private int cilindrada;
    private double precio;

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getCilindrada() { return cilindrada; }
    public void setCilindrada(int cilindrada) { this.cilindrada = cilindrada; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
}


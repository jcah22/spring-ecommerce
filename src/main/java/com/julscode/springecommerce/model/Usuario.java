package com.julscode.springecommerce.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    private String username;

    private String email;

    private String direccion;

    private String trelefono;

    private String tipo;

    private String password;

    @OneToMany(mappedBy = "usuario")
    private List<Producto> productos;

    @OneToMany(mappedBy = "usuario")
    private List<Orden> ordenes;


    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String username, String email, String direccion, String trelefono,
            String tipo, String password, List<Producto> productos) {
        this.id = id;
        this.nombre = nombre;
        this.username = username;
        this.email = email;
        this.direccion = direccion;
        this.trelefono = trelefono;
        this.tipo = tipo;
        this.password = password;
        this.productos = productos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTrelefono() {
        return trelefono;
    }

    public void setTrelefono(String trelefono) {
        this.trelefono = trelefono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario [direccion=" + direccion + ", email=" + email + ", id=" + id + ", nombre=" + nombre
                + ", password=" + password + ", productos=" + productos + ", tipo=" + tipo + ", trelefono=" + trelefono
                + ", username=" + username + "]";
    }

}

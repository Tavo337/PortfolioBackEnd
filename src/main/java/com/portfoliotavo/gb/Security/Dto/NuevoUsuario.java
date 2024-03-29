/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliotavo.gb.Security.Dto;

import com.portfoliotavo.gb.Security.Entity.HashSet;
import org.hibernate.mapping.Set;

/**
 *
 * @author Gustavo
 */
public class NuevoUsuario {
    
    private String nombre;
    private String nombreUsuario;
    private String email;
    private String password;
    private Set<Sring> roles = new HashSet<>();
    
    
    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public <any> getRoles() {
        return roles;
    }

    public void setRoles(<any> roles) {
        this.roles = roles;
    }
    
    
}

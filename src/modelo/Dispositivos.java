/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author Jeronimo
 */
public class Dispositivos {
    private String nombre;
    private String correo;
    private String tipo;
    

    public Dispositivos(String tipo, String nombre, String correo) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.correo = correo;
        
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

//    @Override
//    public int hashCode() {
//        int hash = 5;
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Dispositivos other = (Dispositivos) obj;
//        if (!Objects.equals(this.correo, other.correo)) {
//            return false;
//        }
//        if (!Objects.equals(this.nombre, other.nombre)) {
//            return false;
//        }
//        return true;
//    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Jeronimo
 */
public class Comp_Portatil extends Dispositivos {

    private boolean estado;
    private boolean visible;

    public Comp_Portatil(String tipo, String nombre, String correo,boolean estado, boolean visible) {
        super(tipo, nombre, correo);
        this.estado = estado;
        this.visible = visible;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    

}

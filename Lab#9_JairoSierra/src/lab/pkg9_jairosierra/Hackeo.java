/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9_jairosierra;

import java.io.Serializable;

/**
 *
 * @author Jairo Sierra
 */
public class Hackeo implements Serializable{
    private String codigo;
    private String nivel;
    private static final long SerialVersionUID=777L;
    public Hackeo(String codigo, String nivel) {
        this.codigo = codigo;
        this.nivel = nivel;
    }

    public Hackeo() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Hackeo{" + "codigo=" + codigo + ", nivel=" + nivel + '}';
    }
    
}

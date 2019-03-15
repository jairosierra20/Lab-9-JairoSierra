/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9_jairosierra;

/**
 *
 * @author Jairo Sierra
 */
public class Super extends Hackeo{
    private int fallidos;
    private String tipo;

    public Super(int fallidos, String codigo, String nivel) {
        super(codigo, nivel);
        this.fallidos = fallidos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getFallidos() {
        return fallidos;
    }

    public void setFallidos(int fallidos) {
        this.fallidos = fallidos;
    }

    @Override
    public String toString() {
        return super.toString()+"Super{" + "fallidos=" + fallidos + '}';
    }
    
}

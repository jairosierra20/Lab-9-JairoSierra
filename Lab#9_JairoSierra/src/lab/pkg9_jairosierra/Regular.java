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
public class Regular extends Hackeo{
    private int exitosos;
    private String tipo;
    public Regular(int exitosos, String codigo, String nivel) {
        super(codigo, nivel);
        this.exitosos = exitosos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getExitosos() {
        return exitosos;
    }

    public void setExitosos(int exitosos) {
        this.exitosos = exitosos;
    }

    @Override
    public String toString() {
        return super.toString()+"Regular{" + "exitosos=" + exitosos + '}';
    }
    
    
}

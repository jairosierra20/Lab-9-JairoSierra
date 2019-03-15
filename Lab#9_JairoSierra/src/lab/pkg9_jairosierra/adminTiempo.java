/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9_jairosierra;

import javax.swing.JProgressBar;

/**
 *
 * @author Jairo Sierra
 */
public class adminTiempo extends Thread{
     private JProgressBar progBar;
     private int numero;
     private Hackeo tem;
    private boolean avanzar;
    private boolean vive;

    public Hackeo getTem() {
        return tem;
    }

    public void setTem(Hackeo tem) {
        this.tem = tem;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public adminTiempo(JProgressBar progBar, int numero, Hackeo tem) {
        this.progBar = progBar;
        this.numero = numero;
        this.tem = tem;
        vive = true;
        avanzar = true;
    }

    

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVida(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        int tiempo=0;
        while (vive) {
            if (avanzar) {
                if(tem.getClass().toString().contains("Super")){
                    tiempo = 1000*numero;
                    progBar.setMaximum(numero);
                    progBar.setValue(progBar.getValue()+1);
                }
                if(tem.getClass().toString().contains("Regular")){
                    tiempo = 2000*numero;
                    progBar.setValue(progBar.getValue()+1);
                }
                progBar.setValue(progBar.getValue() + 1);

            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }

    }
}

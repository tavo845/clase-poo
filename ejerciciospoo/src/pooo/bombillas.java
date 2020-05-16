/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooo;

import java.util.Random;

/**
 *
 * @author Gustavo
 */
public class bombillas {

    private boolean bombilla1;
    private boolean bombilla2;
    private boolean bombilla3;
    private boolean bombilla4;

    public bombillas() {

    }

    public boolean isBombilla1() {
        return bombilla1;
    }

    public void setBombilla1(boolean bombilla1) {
        this.bombilla1 = bombilla1;
    }

    public boolean isBombilla2() {
        return bombilla2;
    }

    public void setBombilla2(boolean bombilla2) {
        this.bombilla2 = bombilla2;
    }

    public boolean isBombilla3() {
        return bombilla3;
    }

    public void setBombilla3(boolean bombilla3) {
        this.bombilla3 = bombilla3;
    }

    public boolean isBombilla4() {
        return bombilla4;
    }

    public void setBombilla4(boolean bombilla4) {
        this.bombilla4 = bombilla4;
    }

    @Override
    public String toString() {
        return "bombillas{" + "bombilla1=" + bombilla1 + ", bombilla2=" + bombilla2 + ", bombilla3=" + bombilla3 + ", bombilla4=" + bombilla4 + '}';
    }

    public void apagar() {
        if (bombilla1 && bombilla2 && bombilla3 && bombilla4) {
            this.bombilla1 = false;
            this.bombilla2 = false;
            this.bombilla3 = false;
            this.bombilla4 = false;
            System.out.println("LAS BOMBILLAS SE ACABAN DE APAGAR");
            System.out.println(toString());

        } else {
            System.out.println("LAS BOMBILLAS ESTAN APAGADAS");
        }
    }

    public void encender() {
        if (bombilla1 && bombilla2 && bombilla3 && bombilla4) {
            System.out.println("LAS BOMBILLAS ESTAN ENCENDIDAS");
        } else {
            this.bombilla1 = true;
            this.bombilla2 = true;
            this.bombilla3 = true;
            this.bombilla4 = true;
            System.out.println("LAS BOMBILLAS SE ACABAN DE ENCENDER");
            System.out.println(toString());
        }
    }

    public void encenderdos(boolean bom1, boolean bom2) {
        if (bom1 == false && bom2 == false) {
            this.bombilla1 = true;
            this.bombilla2 = true;

        } else {
            System.out.println("ya estan encendidas");
        }
    }
}
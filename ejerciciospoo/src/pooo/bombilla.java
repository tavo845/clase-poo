/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooo;

/**
 *
 * @author Gustavo
 */
public class bombilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bombillas _clscuarto = new bombillas();
        _clscuarto.apagar();
        _clscuarto.encender();
        _clscuarto.apagar();
        
        _clscuarto.encenderdos(_clscuarto.isBombilla1(), _clscuarto.isBombilla2());
    
        
    }
    
}

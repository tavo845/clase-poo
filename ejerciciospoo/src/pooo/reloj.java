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
public class reloj {
    
    protected String encender = "" ;

    public reloj() {
    }

    public String getEncender() {
        return encender;
    }

    public void setEncender(String encender) {
        this.encender = encender;
    }
    

    public void iniciar() throws InterruptedException {
        int dias, horas, minutos, segundos;
         horas = 0;
         minutos = 0;
         segundos = 0;
         dias = 0;
        while(true){
            Thread.sleep(1000);
            segundos = segundos + 1;
            if(segundos>59){
                segundos = 00;
                minutos = minutos + 1;
            }
            if(minutos>59){
                minutos = 000;
                horas = horas + 1;
            }
            if(horas>23){
                horas = 00;
                dias = dias + 1;
            }
                            System.out.println(dias +":" + horas + ":" + minutos + ":" + segundos + ":" );
                        }
                    }

    void getEncender(String el_reloj_esta_funcionando) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

                }

            
        
   


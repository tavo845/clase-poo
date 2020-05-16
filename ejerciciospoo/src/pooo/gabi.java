/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooo;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class gabi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      gabinete _gabine = new gabinete();
      Scanner _scanner = new Scanner(System.in);
      int op;
      String _object;
      
      do{
          System.out.println("1 - ingresar a gabinete 1");
          System.out.println("2 - ingresar a gabinete 2");
          System.out.println("3 - ingresar a gabinete 3");
          System.out.println("4 - salir");
          op = _scanner.nextInt();
          switch(op){
              case 1:
                  System.out.println("Porfavor ingresar un objecto");
                   _object = _scanner.next();
                  _gabine.setLinkedList1(_object);
                  System.out.println("Gab1");
                  break;
              case 2:
                  _object = _scanner.next();
                  System.out.println("Gab2");
                  _gabine.setLinkedList1(_object);
                  break;
              case 3:
                   _object = _scanner.next();
                  System.out.println("Gab4");
                   _gabine.setLinkedList1(_object);
                   break;
              default:
                    
          }
          }while (op != 4);
        System.out.println(_gabine.toString());
      }
              
}
              
              
      

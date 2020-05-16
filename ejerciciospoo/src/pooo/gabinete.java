/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooo;

import java.util.LinkedList;

/**
 *
 * @author Gustavo
 */
public class gabinete {
   protected LinkedList<Object>_LinkedList1 = new LinkedList<>();
   protected LinkedList<Object>_LinkedList2 = new LinkedList<>();
   protected LinkedList<Object>_LinkedList3 = new LinkedList<>();

    public LinkedList<Object> getLinkedList1() {
        return _LinkedList1;
    }

    public void setLinkedList1(Object _LinkedList1) {
        this._LinkedList1.add(_LinkedList1);
    }

    public LinkedList<Object> getLinkedList2() {
        return _LinkedList2;
    }

    public void setLinkedList2(Object _LinkedList2) {
        this._LinkedList2.add(_LinkedList2);
    }

    public LinkedList<Object> getLinkedList3() {
        return _LinkedList3;
    }

    public void setLinkedList3(Object _LinkedList3) {
        this._LinkedList3.add(_LinkedList3);
    }

    public gabinete() {
    }

    @Override
    public String toString() {
        return "gabinete{" + "_LinkedList1=" + _LinkedList1 + ", _LinkedList2=" + _LinkedList2 + ", _LinkedList3=" + _LinkedList3 + '}';
    }
    
    
}

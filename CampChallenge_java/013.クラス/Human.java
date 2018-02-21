package blackjackPackage;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest1Day
 */
abstract class Human {

    abstract public int open();

    abstract public void setCard(ArrayList<Integer> hand);
    
    abstract public boolean checkSum();
    
    ArrayList<Integer>myCards=new ArrayList<Integer>();

}

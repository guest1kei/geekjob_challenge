/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackPackage;

import java.util.ArrayList;

/**
 *
 * @author guest1Day
 */
public class User extends Human{

    @Override
    public int open() {
         int total = 0;
        for (int j = 0; j < myCards.size(); j++) {

            total = total + myCards.get(j);
        } //To change body of generated methods, choose Tools | Templates.
    return total;
     }
   
    @Override
    public void setCard(ArrayList<Integer> hand) {
           for (int i = 0; i < hand.size(); i++) {
            myCards.add(hand.get(i));
        } //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkSum() {
       if (open() <21) {
            return true;
        } else { //To change body of generated methods, choose Tools | Templates.
            return false;
        } //To change body of generated methods, choose Tools | Templates.
    }

}





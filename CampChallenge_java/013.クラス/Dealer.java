package blackjackPackage;

import static java.io.FileDescriptor.out;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guest1Day
 */
public class Dealer extends Human {

    ArrayList<Integer> cards = new ArrayList<Integer>();
    ArrayList<Integer> data = new ArrayList<Integer>();

    @Override
    public int open() {
        int total = 0;
        for (int j = 0; j < myCards.size(); j++) {

            total = total + myCards.get(j);
        }
        return total; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCard(ArrayList<Integer> hand) {
        for (int i = 0; i < hand.size(); i++) {
            myCards.add(hand.get(i));
        }
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkSum() {
        if (open() < 17) {//17 を含まないから＝いらない
            return true;
        } else { //To change body of generated methods, choose Tools | Templates.
            return false;
        }
    }
    

    public Dealer() {
        for (int a = 1; a <=4; a++) {
            for (int b = 1; b <= 13; b++) {
                if (b <= 10) {
                    cards.add(b);
                } else {
                    cards.add(10);
                }
            }
        }
    }

    public ArrayList<Integer> deal() {
        ArrayList<Integer> dealcard = new ArrayList<Integer>();
        Random rand = new Random();
        Collections.shuffle(cards);
        for (int i = 0; i < 2; i++) {

            // いま : 52
            // 理想 : 山札の枚数（ArrayList の要素数）を、メソッドを使って取得したもの 
            int randomnumber = rand.nextInt(cards.size());

            // いま : get メソッドで取得
            // 理想 : remove メソッドで取得
            // 　　　 → get と remove の違いを調べてみる
            Integer card = cards.remove(randomnumber);
            dealcard.add(card);
        }
        return dealcard;
    }

    public ArrayList<Integer> hit() {
        ArrayList<Integer> hitcard = new ArrayList<Integer>();
        Random rand = new Random();
        Collections.shuffle(cards);
        int randomnumber = rand.nextInt(cards.size());
        Integer card = cards.remove(randomnumber);
        hitcard.add(card);
        return hitcard;
    }

}

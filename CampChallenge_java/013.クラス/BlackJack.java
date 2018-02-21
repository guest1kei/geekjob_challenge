/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackPackage;

import static java.lang.System.out;

/**
 *
 * @author guest1Day
 */
public class BlackJack {

    public static void main(String[] args) {
        try {
            System.out.println("これからブラックジャックを開始します");

            Dealer dealer = new Dealer();
            User user = new User();

            System.out.println("山札から二枚引いてください");

            dealer.setCard(dealer.deal());
            user.setCard(dealer.deal());

            dealer.open();
            user.open();

            while (dealer.checkSum()) {
                dealer.setCard(dealer.hit());
            }
            System.out.println("dealerはこれ以上引きません");

            while (user.checkSum()) {
                user.setCard(dealer.hit());
            }
            System.out.println("userがスタンドしました");

            System.out.println("それでは判定を行います");

            System.out.println("dealerの手札は" + dealer.myCards + "です");
            System.out.println("userの手札は" + user.myCards + "です");

            if (dealer.open() <= 21 && dealer.open() > user.open()) {
                System.out.println("userの手札" + user.open() + "より" + "dealerの手札" + dealer.open() + "の方が21に近いためdealerの勝利");
            } else if (user.open() <= 21 && user.open() > dealer.open()) {
                System.out.println("dealerの手札" + dealer.open() + "より" + "userの手札" + user.open() + "の方が21に近いためuserの勝利");
            }

            if (dealer.open() <= 21 && user.open() > dealer.open()) {
                System.out.println("userの手札は" + user.open() + "です" + "対してdealerの手札は" + dealer.open() + "です " + "よってdealerの勝利");
            } else if (user.open() <= 21 && dealer.open() > user.open()) {
                System.out.println("dealerの手札は" + dealer.open() + "です" + "対してuserの手札は" + user.open() + "です" + "よってuserの勝利");
            } else {
                System.out.println("userの手札" + user.open() + "とdealerの手札" + dealer.open() + "引き分け");
            }
        } catch (Exception e) {
            System.out.print("エラー：" + e.toString());
        }
    }
}

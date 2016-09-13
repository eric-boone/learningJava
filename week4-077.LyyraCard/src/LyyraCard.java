/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dad
 */
public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        balance = balanceAtStart;
    }

    public String toString() {
        return "The card has " + balance + " euros";
    }

    public void payEconomical() {
        double economicalAmount = 2.50;

        if (balance < economicalAmount) {
            return;
        } else {
            balance -= economicalAmount;
        }
    }

    public void payGourmet() {
        double gourmetAmount = 4.00;

        if (balance < gourmetAmount) {
            return;
        } else {
            balance -= gourmetAmount;
        }
    }

    public void loadMoney(double amount) {
        double maxBalance = 150.00;
        if (amount > 0) {
            if ((balance + amount) < maxBalance) {
                balance += amount;
            } else if ((balance + amount) > maxBalance) {
                balance = 150.00;
            }
        }
    }
}

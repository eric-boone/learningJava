/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dad
 */
public class Counter {

    private int number;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.number = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this.number = startingValue;
        this.check = false;
    }

    public Counter(boolean check) {
        this.number = 0;
        if (check) {
            this.check = true;
        }
    }

    public Counter() {
        this.number = 0;
        this.check = false;
    }

    public int value() {
        return this.number;
    }

    public void increase() {
        increase(1);
    }

    public void decrease() {
        decrease(1);
    }

    public void increase(int increaseAmount) {
        if (increaseAmount < 0) {
            return;
        }
        this.number += increaseAmount;
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount < 0) {
            return;
        } else {
            if (this.check) {
                if (this.number - decreaseAmount < 0) {
                    this.number = 0;
                } else {
                    this.number -= decreaseAmount;
                }
            } else {
                this.number -= decreaseAmount;
            }
        }
    }
}

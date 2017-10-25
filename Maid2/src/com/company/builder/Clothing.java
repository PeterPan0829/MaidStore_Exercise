package com.company.builder;

/**
 * Created by mycena100 on 2017/4/18.
 */
public class Clothing {
    private String head;
    private String hand;

    public Clothing(){}

    @Override
    public String toString() {
        return "頭戴 = " + head + ", 手戴 = " + hand +"\n";
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }
}

/*
Scott Cromling
COMP167
LAB 6
 */
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck implements Cloneable {
    List<Card> cards = new ArrayList<Card>(108);
    public Deck() {
        this.cards.add(new Card(Color.green, "0"));
        this.cards.add(new Card(Color.red, "0"));
        this.cards.add(new Card(Color.blue, "0"));
        this.cards.add(new Card(Color.yellow, "0"));
        for (int j = 0; j < 1; j++) {
            this.cards.add(new Card(Color.green, j + ""));
            this.cards.add(new Card(Color.red, j + ""));
            this.cards.add(new Card(Color.blue, j + ""));
            this.cards.add(new Card(Color.yellow, j + ""));
        }
        for (int q = 0; q < 2; q++) {
            for (int i = 1; i <= 9; i++) {
                this.cards.add(new Card(Color.green, i + ""));
                this.cards.add(new Card(Color.red, i + ""));
                this.cards.add(new Card(Color.blue, i + ""));
                this.cards.add(new Card(Color.yellow, i + ""));
            }
        }
    }
    public void shuffle() {
        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < 76; i++) {
                int randomNum = (int) (Math.random() * 75);
                Card temp = this.cards.get(randomNum);
                this.cards.set(randomNum, this.cards.get(i));
                this.cards.set(i, temp);
            }
        }
    }
    @Override
    public Object clone() {
        Deck deck = new Deck();
        deck.cards = new ArrayList<Card>(this.cards);
        return deck;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 76; i++) {
            sb.append(this.cards.get(i).toString() + "|");
            if (((i + 1) % 15) == 0) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
    public void sort() {
        Collections.sort(this.cards);
    }

}


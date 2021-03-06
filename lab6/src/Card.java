/*
Scott Cromling
COMP167
LAB 6
 */


import java.awt.Color;
import java.util.Collections;

public class Card implements Comparable<Card> {
    private Color color;
    private String value;
    public Card(Color color, String value) {
        super();
        this.color = color;
        this.value = value;
    }
    public Card() {
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "Card [color=" + getColorName() + ", value=" + value + "]";
    }
    @Override
    public int compareTo(Card o) {
        int result = 0;
        if (o.getValue() != null && this.getValue() != null) {
            result = Integer.compare(Integer.parseInt(o.getValue()), Integer.parseInt(this.getValue()));
            if(result == 0){
                return this.getColorName().compareTo(o.getColorName());

            }
        }
        return result;
    }

    public String getColorName(){
        if(Color.green == this.color){
            return "green";
        }else if(Color.yellow == this.color){
            return "yellow";
        }else if(Color.blue == this.color){
            return "blue";
        }else{
            return "red";
        }
    }
}


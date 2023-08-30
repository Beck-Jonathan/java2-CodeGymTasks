package en.codegym.task.pro.task10.task1010;

import java.util.Objects;

/* 
Two iPhones
*/

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override public boolean equals(Object o){
        if (o == null){
            return false;
        }
        Iphone test = (Iphone) o;
        return((test.model == (this.model)) && (test.color == (this.color)) && (test.price==(this.price)));



    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}

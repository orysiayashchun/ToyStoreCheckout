package Posterity;

import Base.Toy;

import java.util.Date;

public class Designer extends Toy {
    private int numberOfElements;

    public Designer(String name, float price, Date deliveryDate,int numberOfElements) {
        super(name, price,deliveryDate);
        this.numberOfElements=numberOfElements;
    }

    public Designer(String article, int price, Boolean speak) {
        super();
    }



    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    @Override
    public String toString() {
        return "Designer: "+"numberOfElements=" + numberOfElements+'\''+", "
                + super.toString();
    }
}

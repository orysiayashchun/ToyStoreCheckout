package Posterity;

import Base.Toy;

public class Designer extends Toy {
    private int numberOfElements;

    public Designer(String name, float price, int numberOfElements) {
        super(name, price);
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
        return "numberOfElements=" + numberOfElements+'\''+", "
                + super.toString();
    }
}

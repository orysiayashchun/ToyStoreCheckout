package Posterity;

import Base.Toy;
import java.util.Date;
public class Puzzle extends Toy {
    private int numberOfPuzzles;

    public Puzzle(String name, float price,Date deliveryDate,int numberOfPuzzles) {
        super(name, price,deliveryDate);
        this.numberOfPuzzles=numberOfPuzzles;
    }

    public int getNumberOfPuzzles() {
        return numberOfPuzzles;
    }

    public void setNumberOfPuzzles(int numberOfPuzzles) {
        this.numberOfPuzzles = numberOfPuzzles;
    }

    @Override
    public String toString() {
        return  "Puzzle: "+"numberOfPuzzles=" + numberOfPuzzles+'\''+", "
                + super.toString();
    }
}

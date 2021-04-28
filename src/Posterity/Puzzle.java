package Posterity;

import Base.Toy;

public class Puzzle extends Toy {
    private int numberOfPuzzles;

    public Puzzle(String name, float price,int numberOfPuzzles) {
        super(name, price);
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
        return  "numberOfPuzzles=" + numberOfPuzzles+'\''+", "
                + super.toString();
    }
}

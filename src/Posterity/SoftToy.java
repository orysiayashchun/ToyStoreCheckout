package Posterity;

import Base.Toy;

public class SoftToy extends Toy {
    private boolean isSpeaking;

    public SoftToy(String name, float price, boolean isSpeaking) {
        super(name, price);
        this.isSpeaking=isSpeaking;
    }

    public boolean isSpeaking() {
        return isSpeaking;
    }

    public void setSpeaking(boolean speaking) {
        isSpeaking = speaking;
    }

    @Override
    public String toString() {
        return  "isSpeaking=" + isSpeaking+ '\''+", "
                + super.toString();
    }
}

package Posterity;

import Base.Toy;
import java.util.Date;
public class SoftToy extends Toy {
    private boolean isSpeaking;

    public SoftToy(String name, float price, Date deliveryDate,boolean isSpeaking) {
        super(name, price,deliveryDate);
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
        return  "SoftToy: "+"isSpeaking=" + isSpeaking+ '\''+", "
                + super.toString();
    }
}

package Check;

import Posterity.SoftToy;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Check {
    private long number;
    public ArrayList<Object> purchases=new ArrayList<Object>();
    private float sum;
    public Date date;

    public Check(long number,float sum) {
        this.number=number;
        this.sum=sum;
        this.date=new Date();
    }

    public Check(long number){
        this.number=number;
    }

    public ArrayList<Object> getPurchases() {
        return purchases;
    }

    public void setPurchases(Object purchase) {
        this.purchases.add(purchase);
    }

    public float getSum() {
        return sum;
    }

    public  void setSum(float sum) {
        this.sum += sum;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

}


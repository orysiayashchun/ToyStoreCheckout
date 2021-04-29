package Base;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Toy {
    protected String article;
    protected float price;
    Date deliveryDate;

    public Toy(String article,float price, Date deliveryDate) {
        this.price = price;
        this.article=article;
        this.deliveryDate=deliveryDate;
    }

    public Toy (){

    }
    public void setArticle(String article) {
        this.article = article;
    }

    public String getArticle() {
        return article;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "article=" + article + '\'' +
                ", price=" + price+ ", deliveryDate= "+deliveryDate;
    }
}

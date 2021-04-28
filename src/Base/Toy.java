package Base;

public abstract class Toy {
    protected String article;
    protected float price;

    public Toy(String article,float price) {
        this.price = price;
        this.article=article;
    }

    public Toy() {

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

    @Override
    public String toString() {
        return "article=" + article + '\'' +
                ", price=" + price;
    }
}

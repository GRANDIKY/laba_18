

interface MenClothes {
    public void dressMen();
}

interface WomenClothes {
    public void dressWomen();
}

public abstract class Clothes {
    ClothesSize size;
    int price;
    String color;

    public Clothes(ClothesSize size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public ClothesSize getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}


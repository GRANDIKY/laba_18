

public class Tshirt extends Clothes implements MenClothes, WomenClothes {

    public Tshirt(ClothesSize size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMen() {

    }

    @Override
    public void dressWomen() {

    }
}


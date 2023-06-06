

public class Pants extends Clothes implements MenClothes, WomenClothes{

    public Pants(ClothesSize size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMen() {

    }

    @Override
    public void dressWomen() {

    }
}


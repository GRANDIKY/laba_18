

public class Atelier {


    public static void dressMen(Clothes[] arrayClothes) {
        System.out.println("Мужская одежда:");
        Clothes clothes_i;
        for (int i = 0; i < arrayClothes.length; i++) {
            clothes_i = arrayClothes[i];
            if (arrayClothes[i] instanceof MenClothes){
                System.out.println(clothes_i.getClass().getSimpleName() + " " + clothes_i.getSize().getDescription()
                        + " " + clothes_i.getPrice() + " " + clothes_i.getColor());
            }
        }
    }

    public static void dressWomen(Clothes[] arrayClothes) {
        System.out.println("Женская одежда:");
        Clothes clothes_i;
        for (int i = 0; i < arrayClothes.length; i++) {
            clothes_i = arrayClothes[i];
            if (arrayClothes[i] instanceof WomenClothes){
                System.out.println(clothes_i.getClass().getSimpleName() + " " + clothes_i.getSize().getDescription()
                        + " " + clothes_i.getPrice()+ " " + clothes_i.getColor());
            }
        }
    }
}

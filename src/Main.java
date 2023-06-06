
public class Main {

    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt(ClothesSize.M, 1200, "red");
        Pants pants = new Pants(ClothesSize.L, 2000, "blue");
        Skirt skirt = new Skirt(ClothesSize.XXS, 2500, "green");
        Tie tie = new Tie(ClothesSize.XS, 3000, "black");
        Clothes[] clothes = new Clothes[]{tshirt, pants, skirt, tie};
        Atelier.dressMen(clothes);
        Atelier.dressWomen(clothes);
    }
}

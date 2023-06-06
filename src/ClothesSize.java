

public enum ClothesSize {
    XXS(32) {
        public String getDescription() {
            return "Детский размер";
        }
    },
    XS(34), S(36), M(38), L(40);
    private int euroSize;

    ClothesSize(int size) {
        euroSize = size;
    }

    public String getDescription() {
        return "Взрослый размер";
    }
}

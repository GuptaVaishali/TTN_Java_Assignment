package Ques9_Enum;

public enum HousePrice {
    BEACHVILLA(10),
    VILLA(50),
    FLAT(100),
    BUNGLOW(500),
    PENTHOUSE(1000);

    private final int price;

    HousePrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}



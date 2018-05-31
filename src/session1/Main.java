package session1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int price = 270;
        int discountPercentage = 15;
        float productPriceAfterDiscount = price - price * (discountPercentage / 100.0f);
        System.out.println(productPriceAfterDiscount);
        System.out.println("Hello");
    }
}

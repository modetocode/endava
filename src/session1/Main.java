package session1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int productPrice = 250;
        int discountPercentage = 15;
        float productPriceAfterDiscount = productPrice - productPrice * (discountPercentage / 100.0f);
        System.out.println(productPriceAfterDiscount);
        System.out.println("Hello");
    }
}

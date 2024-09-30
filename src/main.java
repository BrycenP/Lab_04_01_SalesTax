public class main {
    public static void main(String[] args) {
        final double TAX_RATE = 0.05;
        double salesTax = 0;
        int itemCost = 5;

        salesTax = itemCost * TAX_RATE;

        System.out.println("THe sales tax on the purchase price of " + itemCost + " dollars is " + salesTax + " dollars");

    }
}

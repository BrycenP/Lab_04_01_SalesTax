public class main {
    public static void main(String[] args) {
        double TAX_RATE = 0.05;
        double salesTax = 0;
        int itemCost = 5; //this would be the input
        System.out.println("What is the cost of your purchase? (for the sake of this lab lets say your subtotal is 5 dollars)"); //User inputs cost here
        salesTax = itemCost * TAX_RATE;
        System.out.println("You are paying " + salesTax + " dollars in sales tax");
    }
}

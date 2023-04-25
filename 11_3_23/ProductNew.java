import java.util.Scanner;
public class ProductNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numProducts = scanner.nextInt();

        String[] productIds = new String[numProducts];
        String[] productNames = new String[numProducts];
        double[] unitPrices = new double[numProducts];
        int[] quantities = new int[numProducts];
        int[] stocks = new int[numProducts];

        for (int i = 0; i < numProducts; i++) {
            System.out.println("Enter details for product " + (i+1) + ":");
            System.out.print("Product ID: ");
            productIds[i] = scanner.next();
            System.out.print("Product Name: ");
            productNames[i] = scanner.next();
            System.out.print("Unit Price: ");
            unitPrices[i] = scanner.nextDouble();
            System.out.print("Quantity: ");
            quantities[i] = scanner.nextInt();
            System.out.print("Stocks: ");
            stocks[i] = scanner.nextInt();
        }

        double totalCost = 0.0;
        System.out.println("Details of the products:");
        for (int i = 0; i < numProducts; i++) {
            double cost = unitPrices[i] * quantities[i];
            totalCost += cost;
            System.out.println("Product ID: " + productIds[i]);
            System.out.println("Product Name: " + productNames[i]);
            System.out.println("Unit Price: " + unitPrices[i]);
            System.out.println("Quantity: " + quantities[i]);
            System.out.println("Stocks: " + stocks[i]);
            if (quantities[i] > stocks[i]) {
                System.out.println("Out of Stock");
            } else {
                System.out.println("Total Cost: " + cost);
                System.out.println("Remaining Stocks: " + (stocks[i] - quantities[i]));
            }
            System.out.println("--------------------------");
        }
        System.out.println("Total Cost of all products: " + totalCost);
    }
}


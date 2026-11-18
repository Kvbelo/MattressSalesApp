import java.util.Scanner;

public class Product implements IProduct {
    
    private int[][] salesData = new int[3][3];
    private String[] productNames = {
        "Cozy Nights Monarch", 
        "Restonic Barbados", 
        "Sealy Phuket"
    };

    public void captureSalesData() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < productNames.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + productNames[i] + " mattress: ");
                salesData[i][j] = scanner.nextInt();
            }
            System.out.println(); 
        }
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                total += salesData[i][j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        return (double) GetTotalProductsSold() / productNames.length;
    }

    @Override
    public String GetMostPopularProduct() {
        int maxSales = 0;
        String popularProduct = "";
        for (int i = 0; i < salesData.length; i++) {
            int productTotal = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                productTotal += salesData[i][j];
            }
            if (productTotal > maxSales) {
                maxSales = productTotal;
                popularProduct = productNames[i] + "(" + maxSales + ")";
            }
        }
        return popularProduct;
    }

    public void printReport() {
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println();
        System.out.println("*************************************");
        System.out.println("TOTAL PRODUCT SALES: " + GetTotalProductsSold());
        System.out.println("AVERAGE PRODUCT SALES: " + Math.round(GetAverageProductSold()));
        System.out.println("MOST POPULAR PRODUCT: " + GetMostPopularProduct());
    }
}
public class SalesReportApp {
    public static void main(String[] args) {
        // Create the Product object
        Product report = new Product();
        
        // 1. Capture the data (This will ask for the 9 inputs)
        report.captureSalesData();
        
        // 2. Print the formatted report
        report.printReport();
    }
}
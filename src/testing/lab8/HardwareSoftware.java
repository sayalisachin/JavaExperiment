package testing.lab8;

// Interface for both Hardware and Software items
interface MarketItem {
    double calculateSales();
}

// Hardware class implementing MarketItem interface
class Hardware implements MarketItem {
    private String category;
    private String manufacturer;
    private double sales;

    public Hardware(String category, String manufacturer, double sales) {
        this.category = category;
        this.manufacturer = manufacturer;
        this.sales = sales;
    }

    public double calculateSales() {
        return sales;
    }
}

// Software class implementing MarketItem interface
class Software implements MarketItem {
    private String type;
    private String operatingSystem;
    private double sales;

    public Software(String type, String operatingSystem, double sales) {
        this.type = type;
        this.operatingSystem = operatingSystem;
        this.sales = sales;
    }

    public double calculateSales() {
        return sales;
    }
}

public class HardwareSoftware {
    public static void main(String[] args) {
        // Creating hardware and software items
        Hardware hardware1 = new Hardware("Laptops", "Dell", 10000.0);
        Hardware hardware2 = new Hardware("Printers", "HP", 5000.0);

        Software software1 = new Software("Antivirus", "Windows", 2000.0);
        Software software2 = new Software("Office Suite", "Windows", 3000.0);

        // Calculating total sales
        MarketItem[] items = { hardware1, hardware2, software1, software2 };
        double totalSales = 0;

        for (MarketItem item : items) {
            totalSales += item.calculateSales();
        }

        System.out.println("Total sales for all items: " + totalSales);
    }
}

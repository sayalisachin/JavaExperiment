// Define the MarketItem interface
interface MarketItem {
    double calculateSales(); // Calculate total sales
    void displayItemInfo(); // Display item information
}

// Create a Hardware class implementing the MarketItem interface
class Hardware implements MarketItem {
    private String category;
    private String manufacturer;
    private int unitsSold;
    private double pricePerUnit;
    private boolean licensed;
    private String dateSold;

    public Hardware(String category, String manufacturer, int unitsSold, double pricePerUnit, boolean licensed, String dateSold) {
        this.category = category;
        this.manufacturer = manufacturer;
        this.unitsSold = unitsSold;
        this.pricePerUnit = pricePerUnit;
        this.licensed = licensed;
        this.dateSold = dateSold;
    }

    @Override
    public double calculateSales() {
        return unitsSold * pricePerUnit;
    }

    @Override
    public void displayItemInfo() {
        System.out.println("Category: " + category);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Units Sold: " + unitsSold);
        System.out.println("Price per Unit: $" + pricePerUnit);
        System.out.println("Licensed: " + (licensed ? "Yes" : "No"));
        System.out.println("Date Sold: " + dateSold);
    }
}

// Create a Software class implementing the MarketItem interface
class Software implements MarketItem {
    private String type;
    private String operatingSystem;
    private int unitsSold;
    private double pricePerLicense;
    private String dateSold;

    public Software(String type, String operatingSystem, int unitsSold, double pricePerLicense, String dateSold) {
        this.type = type;
        this.operatingSystem = operatingSystem;
        this.unitsSold = unitsSold;
        this.pricePerLicense = pricePerLicense;
        this.dateSold = dateSold;
    }

    @Override
    public double calculateSales() {
        return unitsSold * pricePerLicense;
    }

    @Override
    public void displayItemInfo() {
        System.out.println("Type of Software: " + type);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Units Sold: " + unitsSold);
        System.out.println("Price per License: $" + pricePerLicense);
        System.out.println("Date Sold: " + dateSold);
    }
}

public class MarketAnalysis {
    public static void main(String[] args) {
        // Create instances of hardware and software items for the last 3 months
        Hardware hardwareItem = new Hardware("Laptop", "Dell", 50, 800.0, true, "2023-10-01");
        Software softwareItem = new Software("Antivirus", "Windows", 100, 30.0, "2023-10-15");

        // Calculate total sales for hardware and software items
        double totalHardwareSales = hardwareItem.calculateSales();
        double totalSoftwareSales = softwareItem.calculateSales();

        // Display item information and total sales
        System.out.println("Hardware Item Information:");
        hardwareItem.displayItemInfo();
        System.out.println("Total Hardware Sales for the Last 3 Months: $" + totalHardwareSales);

        System.out.println("\nSoftware Item Information:");
        softwareItem.displayItemInfo();
        System.out.println("Total Software Sales for the Last 3 Months: $" + totalSoftwareSales);
    }
}

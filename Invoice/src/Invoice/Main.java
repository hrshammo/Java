package Invoice;
/*
Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at 
the store. An Invoice should include four pieces of information as instance variables—a part number 
(type String), a part description (type String), a quantity of the item being purchased (type int) and a 
price per item (double). Your class should have a constructor that initializes the four instance variables. 
Provide a set and a get method for each instance variable. In addition, provide a method named 
getInvoiceAmount that calculates the invoice amount (i.e., multiplies the quantity by the price per 
item), then returns the amount as a double value. If the quantity is not positive, it should be set to 0. If 
the price per item is not positive, it should be set to 0.0. Write a test application named InvoiceTest that 
demonstrates class Invoice’s capabilities.
*/
class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantityOfPurchased;
    private double pricePreItem;

    public Invoice(String partNumber, String partDescription, int quantityOfPurchased, double pricePreItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantityOfPurchased = quantityOfPurchased;
        this.pricePreItem = pricePreItem;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setQuantityOfPurchased(int quantityOfPurchased) {
        if (quantityOfPurchased > 0) {
            this.quantityOfPurchased = quantityOfPurchased;
        } else {
            this.quantityOfPurchased = 0;
        }
    }

    public int getQuantityOfPurchased() {
        return quantityOfPurchased;
    }

    public void setPricePreItem(double pricePreItem) {
        if (pricePreItem > 0) {
            this.pricePreItem = pricePreItem;
        } else {
            this.pricePreItem = 0;
        }
    }

    public double getPricePreItem() {
        return pricePreItem;
    }

    public double getInvoiceAmount() {
        return pricePreItem * quantityOfPurchased;
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Invoice one = new Invoice("69FE", "GUN", 10, 1.9);
        System.out.println("Part number: " + one.getPartNumber() + "; Part description: " + one.getPartDescription() +
                "; Sold: " + one.getQuantityOfPurchased() + "; Price: " + one.getPricePreItem() + "; Invoice amount: " +
                one.getInvoiceAmount());
        one.setPartNumber("0x000");
        one.setPartDescription("IBM");
        one.setQuantityOfPurchased(1000);
        one.setPricePreItem(1500.99);
        System.out.println("After changing:");
        System.out.println("Part number: " + one.getPartNumber() + "; Part description: " + one.getPartDescription() +
                "; Sold: " + one.getQuantityOfPurchased() + "; Price: " + one.getPricePreItem() + "; Invoice amount: " +
                one.getInvoiceAmount());
    }
}

package Principal;
import ImplementacionInterfaces.Payable;

public class Invoice implements Payable {

    private String partNumber;
    private String partDescription;
    private int quality;
    double pricePerItem;

    @Override
    public double getPaymentAmount() {
        return getQuality() * getPricePerItem();
    }

    public Invoice(String partNumber, String partDescription, int quality, int pricePerItem){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quality = quality;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public int getQuality() {
        return quality;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "partNumber='" + partNumber + '\'' +
                ", partDescription='" + partDescription + '\'' +
                ", quality=" + quality +
                ", pricePerItem=" + pricePerItem +
                '}';
    }
}

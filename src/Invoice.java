public class Invoice {
    public String PartNumber,Description;
    public int Quantity;
    public Double Price;
    public Invoice(String PartNumber,String Description,int Quantity,Double Price)
    {
        this.PartNumber=PartNumber;
        this.Description=Description;
        this.Quantity=Quantity;
        this.Price=Price;
    }
    public String getPartNumber()
    {
        return PartNumber;
    }
    public void setPartNumber(String PartNumber)
    {
        this.PartNumber = PartNumber;
    }
    public String getDescription()
    {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        this.Quantity = quantity;
    }

    public Double getPrice()
    {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }
}

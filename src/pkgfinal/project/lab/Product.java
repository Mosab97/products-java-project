
package pkgfinal.project.lab;
public abstract class Product {
    
    
    private int Id;
    private String Name;
    private String Description;
    private double price;
    
    
    public abstract double calcPay();

    @Override
    public String toString() {
        return "Product{" + "Id=" + Id + ", Name=" + Name + ", Description=" + Description + ", price=" + price + '}';
    }

    public Product(int Id, String Name, String Description, double price) {
        this.Id = Id;
        this.Name = Name;
        this.Description = Description;
        this.price = price;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

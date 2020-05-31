package pkgfinal.project.lab;

public class Dimensional extends Product {

    private int width;
    private int length;

    public Dimensional( int Id,String Name, String Description, int width, int length, int price) {
        super(Id, Name, Description, price);
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Product{" + "id = " + this.getId() + ", name = " + this.getName() + ", description = " + this.getDescription() + ", price = " + this.getPrice() + ", width=" + width + ", length=" + length + "}";
    }
    
        public String toStringFile() {
        return  this.getId() + "," + this.getName() + "," + this.getDescription() + "," + this.getPrice() + "," + width + "," + length + ",D";
    }

    @Override
    public int calcPay() {
        return this.getLength() * this.getWidth() * this.getPrice();
    }

}

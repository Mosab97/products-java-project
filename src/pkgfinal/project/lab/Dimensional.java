package pkgfinal.project.lab;

public class Dimensional extends Product {

    private double width;
    private double length;

    public Dimensional(double width, double length, int Id, String Name, String Description, double price) {
        super(Id, Name, Description, price);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Dimensional{" + "width=" + width + ", length=" + length + '}';
    }

    @Override
    public double calcPay() {
        return this.getLength() * this.getWidth() * this.getPrice();
    }

}

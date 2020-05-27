package pkgfinal.project.lab;

public class Dimensional extends Product {

    private int width;
    private int length;

    public Dimensional(int width, int length, int Id, String Name, String Description, int price) {
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
        return "Dimensional{" + "width=" + width + ", length=" + length + '}';
    }

    @Override
    public int calcPay() {
        return this.getLength() * this.getWidth() * this.getPrice();
    }

}

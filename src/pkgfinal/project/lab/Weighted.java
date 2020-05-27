package pkgfinal.project.lab;

public class Weighted extends Product {

    private double weight;

    public Weighted(double weight, int Id, String Name, String Description, double price) {
        super(Id, Name, Description, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Weighted{" + "weight=" + weight + '}';
    }

    @Override
    public double calcPay() {
        return this.getPrice() * this.getWeight();

    }

}

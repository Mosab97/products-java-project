package pkgfinal.project.lab;

public class Weighted extends Product {

    private int weight;

    public Weighted(int weight, int Id, String Name, String Description, int price) {
        super(Id, Name, Description, price);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Weighted{" + "weight=" + weight + '}';
    }

    @Override
    public int calcPay() {
        return this.getPrice() * this.getWeight();

    }

}

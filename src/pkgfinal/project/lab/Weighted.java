package pkgfinal.project.lab;

public class Weighted extends Product {

    private int weight;

    public Weighted(int Id, String Name, String Description,int weight,  int price) {
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
                return "Product{" + "id = " + this.getId() + ", name = " + this.getName() + ", description = " + this.getDescription() + ", price = " + this.getPrice() + ", Weight = " + this.getWeight()  + "}";

    }
    
        public String toStringFile() {
        return  this.getId() + "," + this.getName() + "," + this.getDescription() + "," + this.getPrice() + "," + weight + ",W";
    }

    @Override
    public int calcPay() {
        return this.getPrice() * this.getWeight();

    }

}

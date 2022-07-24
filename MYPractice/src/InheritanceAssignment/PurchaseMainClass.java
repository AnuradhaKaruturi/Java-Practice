package InheritanceAssignment;
class PurchaseItem{
    private String name;
    private double unitprice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    

    public PurchaseItem(){
     this.name = "Anu";
     this.unitprice = 20.0;
    }

    public double getprice(){
        return unitprice;
    }

}
class  WeighedItem extends PurchaseItem {

    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public WeighedItem(double weight) {
        this.weight = weight;
    }
    public double getprice(){
        return weight*super.getprice();
    }
}
class CountedItem extends PurchaseItem{

     private int quantity;

    public CountedItem(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getprice(){
        return quantity*super.getprice();
    }
}
public class PurchaseMainClass {
    public static void main(String[] args) {
      
        WeighedItem obj = new WeighedItem(20);
        obj.getWeight();
        obj.getUnitprice();
        obj.getprice();
        System.out.println( "weight : " + obj.getWeight() );
        System.out.println("Unit price : " + obj.getUnitprice());
        System.out.println(" price : " + obj.getprice());
               

        CountedItem obj1 = new CountedItem(2);
        obj1.getQuantity();
        obj1.getprice();
        obj1.getUnitprice();
        System.out.println( "weight : " + obj1.getQuantity() );
        System.out.println("Unit price : " + obj1.getUnitprice());
        System.out.println(" price : " + obj1.getprice());
               
  
    }
}

package assessment;

public abstract class Employee extends Customer implements Discount{

    private final double DISCOUNT = 0.10;
    public Employee(String name){
        super(name);
    }

    public abstract void printEmployeePriceAfterDiscount(Clothing clothing);

    public double getDISCOUNT() {
        return DISCOUNT;
    }

    public Employee(String personName, Size size, Clothing[] clothingItems) {
        super(personName, size, clothingItems);
    }
}

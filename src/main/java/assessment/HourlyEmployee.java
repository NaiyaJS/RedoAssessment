package assessment;

public class HourlyEmployee extends Employee {

    public HourlyEmployee(String name) {
        super(name);
    }

    @Override
    public void printEmployeePriceAfterDiscount(Clothing clothing) {
        double finalDiscount =  getDISCOUNT();
        double calculateDiscount = clothing.getPrice() * finalDiscount;
        double finalPrice = clothing.getPrice() - calculateDiscount;
        System.out.println(finalPrice);

    }

    public HourlyEmployee(String personName, Size size, Clothing[] clothingItems) {
        super(personName, size, clothingItems);
    }

    @Override
    public double calculateDiscount() {
        return 0;
    }
}

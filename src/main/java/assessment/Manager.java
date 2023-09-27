package assessment;

import java.util.Arrays;

public class Manager extends Employee{

    private final double MANAGER_DISCOUNT = 0.05;
    public Manager(String name){
        super(name);
    }

    public Manager(String personName, Size size, Clothing[] clothingItems) {
        super(personName, size, clothingItems);
    }

    @Override
    public void printEmployeePriceAfterDiscount(Clothing clothing) {

        double finalDiscount = MANAGER_DISCOUNT + getDISCOUNT();
        double calculateDiscount = clothing.getPrice() * finalDiscount;
        double finalPrice = clothing.getPrice() - calculateDiscount;
            System.out.println(finalPrice);

        }



}

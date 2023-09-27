package assessment;

import java.util.Arrays;

public abstract class Customer extends Person {


    public Customer(String personName, Size size, Clothing[] clothingItems) {
        super(personName, size, clothingItems);
    }

    public Customer(String personName) {
        super(personName);

    }

    public static void printCustomerName(Customer customer) {
        System.out.println("The customer's name is " + customer.getPersonName());
    }



    @Override
    public String toString() {
        return "Customer{" +
                "personName='" + getPersonName() + '\'' +
                ", size=" + getSize() +
                ", clothingItems=" + Arrays.toString(getClothingItems()) +
                '}';
    }
}

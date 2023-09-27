package assessment;

import java.util.Arrays;

public abstract class Person {
    private String personName;

    private Size size;
    private Clothing[] clothingItems;

    public Person(String personName){
        this.personName = personName;
    }

    public Person(String personName, Size size, Clothing[] clothingItems) {
        this.personName = personName;
        this.size = size;
        this.clothingItems = clothingItems;
    }


    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Clothing[] getClothingItems() {
        return clothingItems;
    }

    public void setClothingItems(Clothing[] clothingItems) {
        this.clothingItems = clothingItems;
    }



    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", size=" + size +
                ", clothingItems=" + Arrays.toString(clothingItems) +
                '}';
    }
}

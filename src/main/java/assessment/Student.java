package assessment;

public class Student extends Customer implements Discount{
    private long studentID;

    private final double  DISCOUNT = 0.5;

    public Student(String personName, Size size, Clothing[] clothingItems, long studentID) {
        super(personName, size, clothingItems);
        this.studentID = studentID;
    }

    public Student(String personName, long studentID) {
        super(personName);
        this.studentID = studentID;
    }

    @Override
    public double calculateDiscount() {
        return 0;
    }
}

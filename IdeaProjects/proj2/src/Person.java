
import java.util.ArrayList;
import java.util.List;

public class Person implements Nameable {
    int id;
    String name="unkown";
    int age;
    boolean parent_Permission=true;


    public Person( String name, int age, boolean parent_Permission) {
        this.name = name;
        this.age = age;
        this.parent_Permission = parent_Permission;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private boolean isOf_Age() {
        return age >= 20;
    }

    public boolean canUseServices() {
        return isOf_Age() || parent_Permission;
    }
    @Override
    public String getCorrectName() {
        return name;
    }
    private List<Rental> rentals;

    public Person(String name) {
        this.name = name;
        this.rentals = new ArrayList<>();
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }
}
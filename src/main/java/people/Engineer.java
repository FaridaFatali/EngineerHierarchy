package people;

public class Engineer extends Person {
    protected String branch;

    public Engineer(String name, int age, String branch) {
        super(name, age);
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Engineer information: " +
                "name - " + name +
                ", age - " + age +
                ", branch - " + branch;
    }
}

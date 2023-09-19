package people.ability;

import people.Engineer;


// PBJ - Parent, Blogger, JavaEnthusiast
public class EngineerPBJ extends Engineer implements Parent, Blogger, JavaEnthusiast {

    public EngineerPBJ(String name, int age, String branch) {
        super(name, age, branch);
    }

    @Override
    public void writeBlog() {
        System.out.println("* wrote a blog about parenthood.");
    }

    @Override
    public void readAboutJava(String book) {
        System.out.println("* studies Java and reads books about it: " + book);
    }

    @Override
    public void giveSomeMoney() {
        System.out.println("* gave money to his children for theatre.");
    }
}

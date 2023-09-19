package people.ability;

import people.Engineer;

// PB - Parent, Blogger
public class EngineerPB extends Engineer implements Parent, Blogger {

    public EngineerPB(String name, int age, String branch) {
        super(name, age, branch);
    }

    @Override
    public void writeBlog() {
        System.out.println("* wrote a blog about Engineering.");
    }

    @Override
    public void giveSomeMoney() {
        System.out.println("* gave money to his children for the school.");
    }
}

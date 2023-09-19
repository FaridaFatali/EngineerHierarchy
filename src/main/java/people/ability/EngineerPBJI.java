package people.ability;

import people.Engineer;

// PBJI - Parent, Blogger, JavaEnthusiast, InstrumentPlayer
public class EngineerPBJI extends Engineer implements Parent, Blogger, JavaEnthusiast, InstrumentPlayer {

    public EngineerPBJI(String name, int age, String branch) {
        super(name, age, branch);
    }

    @Override
    public void writeBlog() {
        System.out.println("* wrote a blog about music instruments.");
    }

    @Override
    public void play(String instrument) {
        System.out.println("* plays the " + instrument);
    }

    @Override
    public void readAboutJava(String book) {
        System.out.println("* reads the 3rd book about Java: " + book);
    }

    @Override
    public void giveSomeMoney() {
        System.out.println("* gives money to his children for the cinema.");
    }
}

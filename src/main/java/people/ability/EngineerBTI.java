package people.ability;

import people.Engineer;

// BTI - Blogger, TeamFan, InstrumentPlayer
public class EngineerBTI extends Engineer implements Blogger, TeamFan, InstrumentPlayer {
    public EngineerBTI(String name, int age, String branch) {
        super(name, age, branch);
    }

    @Override
    public void writeBlog() {
        System.out.println("* wrote a blog about his favorite team.");
    }

    @Override
    public void play(String instrument) {
        System.out.println("* plays the " + instrument);
    }

    @Override
    public void support(String team) {
        System.out.println("* supports the " + team);
    }

}

package people.ability;

public interface Parent {
    default void loveKids() {
        System.out.println("* loves kids.");
    }

    default void showCompassion() {
        System.out.println("* shows compassion to children.");
    }

    void giveSomeMoney();
}

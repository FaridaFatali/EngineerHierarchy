package people;

import people.ability.*;

/**
 * Practice for Abstraction and Interface in Java
 * @author Farida Fatali
 * Engineers are divided into parents, bloggers, Java enthusiasts, instrument players, and team fans.
 * We build a hierarchy by implementing them from the corresponding interfaces and extending the classes.
 */

public class Main {
    public static void main(String[] args) {
        EngineerPBJI engineerPBJI = new EngineerPBJI("John Jonathan", 32, "Civil Engineering");
        System.out.println(engineerPBJI);
        System.out.println("\nThe engineer:");
        engineerPBJI.codeJava();
        engineerPBJI.readAboutJava("Java for beginners");
        engineerPBJI.loveKids();
        engineerPBJI.showCompassion();
        engineerPBJI.giveSomeMoney();
        engineerPBJI.play("Guitar");
        engineerPBJI.writeBlog();

        System.out.println("\n-------------------------------\n");

        EngineerPBJ engineerPBJ = new EngineerPBJ("Steven Stevenson", 40, "Electrical Engineering");
        System.out.println(engineerPBJ);
        System.out.println("\nThe engineer:");
        engineerPBJ.codeJava();
        engineerPBJ.readAboutJava("Java documentation");
        engineerPBJ.loveKids();
        engineerPBJ.showCompassion();
        engineerPBJ.giveSomeMoney();
        engineerPBJ.writeBlog();

        System.out.println("\n-------------------------------\n");

        EngineerPB engineerPB = new EngineerPB("Brad Robinson", 45, "Mechanical Engineering");
        System.out.println(engineerPB);
        System.out.println("\nThe engineer:");
        engineerPB.loveKids();
        engineerPB.showCompassion();
        engineerPB.giveSomeMoney();
        engineerPB.writeBlog();

        System.out.println("\n-------------------------------\n");

        EngineerBTI engineerBTI = new EngineerBTI("Dan Davis", 28, "Industrial Engineering");
        System.out.println(engineerBTI);
        System.out.println("\nThe engineer:");
        engineerBTI.play("Piano");
        engineerBTI.writeBlog();
        engineerBTI.support("Barcelona football team.");
    }
}
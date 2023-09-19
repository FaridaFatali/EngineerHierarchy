package people.ability;

public interface JavaEnthusiast {
    void readAboutJava(String book);

    public default void codeJava() {
        System.out.println("* writes code in Java.");
    }
}

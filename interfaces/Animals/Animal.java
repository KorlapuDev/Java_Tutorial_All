package interfaces.Animals;

public interface Animal {

    public static final int MAX_AGE = 150;
    public abstract void eat();
    void sleep();

    public static void info(){
        System.out.println("This is animal interface");
    }
    public default void run(){
        System.out.println("The Animal interface is running");
    }
}

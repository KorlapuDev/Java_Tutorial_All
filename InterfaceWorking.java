import interfaces.Animals.Animal;
import interfaces.Animals.DogIterfaceClass;

public class InterfaceWorking {
    public static void main(String[] args){
        DogIterfaceClass rocky = new DogIterfaceClass();
        rocky.eat();

        //You can access that variable from class which impelements the interface and also from direct that interface
        //and always we have to access it from interfaces and not from implemention of that interface.
        System.out.println(DogIterfaceClass.MAX_AGE);
        System.out.println(Animal.MAX_AGE);

        Animal.info(); //This info method is static method inside the Animal interface
        rocky.run(); // This run method is default method inside hte Animal interface
        // default method can be accessed only from impelemented class of interface But the static cannot be accessed

    }
}

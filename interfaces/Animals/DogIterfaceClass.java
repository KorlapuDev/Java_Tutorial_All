package interfaces.Animals;

public class DogIterfaceClass implements Animal {
        @Override
        public void eat() {
            System.out.println("Dog in interface is eating.");
        }

        @Override
        public void sleep() {
            System.out.println("Dog in interface is sleeping.");

    }
}

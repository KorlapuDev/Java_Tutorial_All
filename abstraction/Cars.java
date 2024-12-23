package abstraction;

// first we have to declear abstract class
// There is no particularity that abstract class should have the abstract method only it can consist of concreet method also
public abstract class Cars {

    //Abstract method
    public abstract void revEngine();

    //Conceret method
    public void startEngine(){
        System.out.println("zzzz....wrooom.....");
    }

}

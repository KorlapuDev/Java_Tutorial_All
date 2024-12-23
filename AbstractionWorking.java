import abstraction.CarSwift;
import abstraction.Cars;

public class AbstractionWorking {
    public static void main (String[] args){
        CarSwift swift1 = new CarSwift();
        swift1.startEngine();
        swift1.revEngine();
 
        Cars swift2 = new CarSwift();
        //we can create like this but we donot ***Cars swift2 = new Cars();*** because it is not implementable because it is Abstract class
        swift1.startEngine();
        swift1.revEngine();
    }
}

public class BasicCore {
    public static void main(String[] args){
        System.out.println("Hello - World");
        //this is th basic template of the project

        System.out.println("-------------------Data types and some methods--------------------------------");
        //Lets get to the data types numerical and boolean values
        int num1 = 1;
        float num2 = 5.5F;
        double num3 = 7.5;
        boolean num4 = true;
        //byte and short are smaller version of int data type
        //long datatype has more range then bo
        System.out.println("integer(int)--> " + num1 + " float ---> " + num2 + " double--> " + num3 + " Boolean---> " + num4);

        //By usiing minvalu and max value u can check the range of data type
        System.out.println("int min value--> "+ Integer.MIN_VALUE + " int max value--> "+Integer.MAX_VALUE);

        //Lets get to some chracter

        char myLetter = 'A'; //Char is declread using the single quotes
        String myText = "Hello";

        System.out.println("Character(char)---->  "+ myLetter);
        System.out.println("String (str)---->  "+ myText);

        // lets go for arthmetic operators
        System.out.println("-------------------------Arthematic opreators in java--------------------------");
        System.out.println("-->"+5+11);
        System.out.println("Addition operator----->>>>>"+num1 + num2);

        int addInt = num1+5;

        System.out.println("Addition operator----->>>>>"+addInt );

    }
}

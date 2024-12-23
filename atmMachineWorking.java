import java.util.Scanner;
public class atmMachineWorking {
    public static void main(String[] args){
        System.out.println("ATM machine started");

        System.out.println("Enter your account number: ");
        Scanner accNumber = new Scanner(System.in);

        String userAccountNumber = accNumber.nextLine();
//        System.out.println("User account number is : " + userAccountNumber);

        System.out.println("Enter account holder name: ");
        Scanner accholderName = new Scanner(System.in);

        String userAccountHolderName = accholderName.nextLine();
//        System.out.println("Account Holder Name  is : " + userAccountHolderName);

        System.out.println("Verfying wait");


    }
}

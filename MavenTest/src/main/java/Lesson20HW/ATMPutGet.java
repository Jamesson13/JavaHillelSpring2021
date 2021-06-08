package Lesson20HW;

public class ATMPutGet {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void putMoney(int value){
        System.out.println(ANSI_GREEN+ "Put on the your bank account "+ ANSI_GREEN + value + " grn.");
        Customer.bankAccount += value;
        System.out.println("Your bank account balance is " + Customer.bankAccount + " grn.");
        System.out.println("____________________________");
    }
    public static void getMoney(int value){
        if(Customer.bankAccount > value){
            Customer.bankAccount -= value;
            System.out.println("Transaction  from your bank account " + value + " grn.\nYour bank account balance is " + Customer.bankAccount + " grn.");
        }
        else{
            System.out.println(ANSI_RED + "Sorry, your balance less that " + value + ANSI_RED + "\nBank account balance is " + Customer.bankAccount + " grn.");
        }
    }
}

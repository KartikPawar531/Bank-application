import java.util.Scanner;

class BankAccount{
    int Balance;
    int PreviousTransaction;
    String CustomerName;
    String CustomerId;

    public BankAccount(String cName, String cId) {
        CustomerName = cName;
        CustomerId = cId;
    }

    void deposit(int amount){
        if(amount!=0){
            Balance = Balance + amount;
            PreviousTransaction = Balance;
        }
    }

    void withdraw(int amount){
        if(amount!= 0){
            Balance = Balance - amount;
            PreviousTransaction = Balance;
        }
    }
    void getPreviousTransaction(){
        if(PreviousTransaction > 0){
            System.out.println("Deposited: "+ PreviousTransaction);
        }
        else if(PreviousTransaction < 0){
            System.out.println("withdrawal: "+Math.abs(PreviousTransaction));
        }
        else{
            System.out.println("no transaction is occur..");
        }
    }

    void showMenu(){
        char option = '\0';
        Scanner sc=new Scanner(System.in);

        System.out.println(" Welcome "+CustomerName);
        System.out.println("Your id is:"+CustomerId);
        System.out.println();
        System.out.println("A. Check Balance");
        System.out.println("B. deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        do{
            System.out.println("***********************************");
            System.out.println("Enter your option");
            System.out.println("***********************************");
            option = sc.next().charAt(0);
//            Character.toUpperCase(option);

            switch(option){
                case 'A' :
                    System.out.println("***********************************");
                    System.out.println("Balance is :"+ Balance);
                    System.out.println("***********************************");
                    break;

                case 'B' :
                    System.out.println("***********************************");
                    System.out.println("Enter the amount to deposit :");
                    System.out.println("***********************************");
                    int amount=sc.nextInt();
                    deposit(amount);
                    System.out.println();
                    break;

                case 'C' :
                    System.out.println("***********************************");
                    System.out.println("Enter the amount to withdraw :");
                    System.out.println("***********************************");
                    int amt= sc.nextInt();
                    withdraw(amt);
                    System.out.println();
                    break;

                case 'D'  :
                    System.out.println("***********************************");
                    getPreviousTransaction();
                    System.out.println("***********************************");
                    break;

                case 'E'  :
                    System.out.println("***********************************");
                    break;

                default:
                    System.out.println("Invalid option! Please Try again....");
                    break;
            }
        }while( option != 'E');
    }
}
public class BankingApplication {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BankAccount b1 = new BankAccount("ABC","131197");
        b1.showMenu();
    }
}


/*
Java Lab Assigment 2:
Create an abstract class Accounts with the following details:
Data Members:
(a) Balance (b) accountNumber (c) accountHoldersName (d) address
Methods:
(a) withdrawl()- abstract
(b) deposit()- abstract
(c) display() to show the balance of the account number


Create a subclass of this class SavingsAccount and add the following details:
Data Members:
(a) rateOfInterest
Methods:
(a) calculateAmount()

*/

import java.util.Scanner;

abstract class Accounts{

    int Balance ;
    int accountNumber;
    String accountHoldersName ;
    String address;
    
    abstract void withdrawl(int paisa);
    abstract void deposit(int paisa);
    abstract void display();
}

public class SavingsAccount extends Accounts{

    double rateOfInterest = 4;

    public void setAccountNumber(int accNum){
        accountNumber = accNum;
    }

    public void setaccountHoldersName(String name) {
        accountHoldersName = name;
    }

    public void setAdrress(String add){
        address = add;
    }

    public void  withdrawl(int paisa) {
        if(paisa>Balance)
        {
            System.out.println("Not sufficient Balance");
            return;
        }
        Balance -=  paisa;
    }

    public void deposit(int paisa) {
        Balance +=  paisa;
    }

    public void display(){
        System.out.println("Balance = " + Balance);
    }

    public double calculateAmount(int time) {
        double interest = (Balance *  rateOfInterest * time ) /100;
        double paisa = Balance +  interest;
        return paisa;
    }

    //Main 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);      
        SavingsAccount SavingAcc = new SavingsAccount();

        SavingAcc.deposit( (int)(Math.random() * ((4500) + 1)) + 500 );
        SavingAcc.setAccountNumber(172214);
        SavingAcc.setaccountHoldersName("ABC");
        SavingAcc.setAdrress("XYZ City, India");
        

            while(true){
            System.out.println("\n______________________________");
            System.out.println("Welcome to DhanDhan Bank ;) ");
            System.out.println("Do you Want to :");
            System.out.println("______________________________");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Deposite Money");
            System.out.println("3. Calculate Amount");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            int option  = input.nextInt();

            if(option==5) break;

            switch(option){
                case 1: 
                    System.out.println("Enter Amount: ");
                    int withdrawlAmount = input.nextInt();
                    SavingAcc.withdrawl(withdrawlAmount);
                    break;

                case 2:
                    System.out.println("Enter Amount: ");
                    int depositAmount = input.nextInt();
                    SavingAcc.deposit(depositAmount);
                    break;
                
                case 3:
                    System.out.println("Enter Time (in years) :");
                    int time = input.nextInt();
                    System.out.println("Amount in "+time+" year is "+ SavingAcc.calculateAmount(time));
                    break;
                
                case 4:
                    SavingAcc.display();
                    break;
                
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
            input.close();
    }
    
}

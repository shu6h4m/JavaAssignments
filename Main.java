//Lab Assignment : To impliment a simple calculator using interface.

import java.util.Scanner;
interface Calculator {
    public int add(int i, int j);
    public int subtract(int i, int j);
    public int multiply(int i, int j);
    public float division(float i, float j);
    }


class NewCal implements Calculator{
    public int add(int i, int j){
        return i+j;
    }

    public int subtract(int i, int j){
        return i-j;
    }

    public int multiply(int i, int j){
        return i*j;
    }

    public float division(float i, float j){
        if(i==0){
            return 0;
        }
        return i/j;
    }
}


class Main{
    public static void main(String[] args){
        NewCal obj = new NewCal();
        
        while(true){
            int i; int j;
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println("\n--------------------Calculator Menu--------------------");
            System.out.println("1). Addition.\n2). Subtraction. \n3). Multiplication. \n4). Division.");
            System.out.println("-------------------------------------------------------");
            System.out.print("Enter the choice : ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter 1st Number : ");
                    i = sc.nextInt();
                    System.out.print("Enter 2nd Number : ");
                    j = sc.nextInt();
                    
                    System.out.println("\nResult of Addition : "+obj.add(i,j));
                    break;
                
                case 2:
                    System.out.print("Enter the Number : ");
                    i = sc.nextInt();
                    System.out.print("Enter the Number to be subtracted from 1st Number : ");
                    j = sc.nextInt();
                
                    System.out.println("\nResult of Subtraction : "+obj.subtract(i,j));
                    break;

                case 3:
                    System.out.print("Enter 1st Number : ");
                    i = sc.nextInt();
                    System.out.print("Enter 2nd Number : ");
                    j = sc.nextInt();
                
                    System.out.println("\nResult of Multiplication : "+obj.multiply(i,j));
                    break;

                case 4:
                    System.out.print("Enter Devidend : ");
                    i = sc.nextInt();
                    System.out.print("Enter Divisor : ");
                    j = sc.nextInt();
                
                    System.out.println("\nResult of Division : "+obj.division(i,j));
                    break;

                default:
                    System.out.println("Oops! Wrong Choice Please Choose Again.");
                    break;
            }
        }
    }
}


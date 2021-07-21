import java.util.Scanner;
public class H_Pattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int n=sc.nextInt();
        if(n%2==0) n+=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==n/2 || j==n-1 || j==0){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

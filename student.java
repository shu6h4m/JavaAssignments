import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class student {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        //Taking input from user:
        System.out.print("Enter Name : \n");
        String Name = br.readLine();
        System.out.print("Enter Subject : \n");
        String Subject = br.readLine() ;
        System.out.print("Enter Marks : \n");
        String marksInString = br.readLine();
        int Marks = Integer.parseInt(marksInString);

        // Printing the result on screen:
        System.out.println("____________________________\n");
        System.out.println("Name : "+ Name);
        System.out.println("Subject : "+ Subject);
        System.out.println("Marks : "+Marks);
        //Exceptional handling
        try {
            
            if (Marks<40)
                throw new PassExecption();
           
            System.out.println("\nPassed !");
        } catch (PassExecption pe) {
            System.out.println("Not Passed !");
        }
        System.out.println("____________________________\n");        
    }
}

class PassExecption extends Exception{
    PassExecption()
    {
        super("Not Passed !");
    }
}
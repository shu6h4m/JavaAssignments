import java.io.File;

public class file {
    public static void main(String[] args) {
        File f = null;
        String nameFile, pathFile , locationFile ;
        long modifiedFile , sizeFile;
        
        try {
            f = new File("E:\\newFile.txt");    // create new files
            nameFile = f.getName();             // get file name 
            pathFile = f.getPath();             // get the path of file
            modifiedFile = f.lastModified();    // get last modified time
            sizeFile = f.length();              // get sizeFile of file
            locationFile = f.getAbsolutePath(); // get absolute path
            f.setExecutable(true);              // set permisssion 
            f.setReadable(true);
            if(f.createNewFile()) {
            
                // if file exists then prints
                System.out.println("--------------------------------");
                System.out.println("File is created\n");
                System.out.println("File Name is : "+ nameFile);
                System.out.println("File Path is : "+ pathFile);
                System.out.println("File Last Modified : "+ modifiedFile);
                System.out.println("Size of File: " + sizeFile + "kb" );
                System.out.println("Location of File: "+ locationFile);
                //check permission
                System.out.println("Checking Permissions...");
                System.out.println("Is File Executable: " + f.canExecute());
                System.out.println("Is File Readable: " + f.canRead());
                f.delete();
                System.out.println("File is deleted");
            }   
        } catch(Exception e) {
            // if any error occurs
            e.printStackTrace();
        }
    }   
}

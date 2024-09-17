import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class docfilevanban {
    public static void main(String[] args) {
        try{
            File myfile = new File("DATA.in");
            Scanner sc = new Scanner(myfile);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        }catch (FileNotFoundException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }

    }
}

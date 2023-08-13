import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ApplicationCounter {
    private static int registeredUsers = 0;

    private static int allViewers = 0;

    //getters get data from files
    public static int getRegisteredUsers() {

        String filePath = "./text_files/users.txt";
        File file = new File(filePath);

        try(Scanner scanner = new Scanner(file)){

            while (scanner.hasNextLine()){

            }

        }catch (IOException exception){
            exception.printStackTrace();
        }



        return registeredUsers;
    }

    public static int getAllViewers() {
        return allViewers;
    }

    //increments
    public static void incrementRegisteredUsers(){
        registeredUsers++;
    }

    public static void incrementAllViewers(){
        allViewers++;
    }
}

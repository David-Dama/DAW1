

import java.util.Scanner;

public class login {

    public static void main(String[] args) {
       
        final String NAME = "unknown.boxer", PASSWORD = "abc123";
        String name, password;
        Scanner input = new Scanner(System.in);
        int attempts = 0, attemptsLeft;




        while (attempts <3){
           
            System.out.print("Username: ");
            name = input.next();
            System.out.print("Password: ");
            password = input.next();


            if (name.equals(NAME)){
                if (password.equals(PASSWORD)){
                    System.out.println("Login succesful");
                    break;
                }
                else {
                    System.out.println("Wrong password");
                }
            }
            else {
                System.out.println("Wrong username");
            }


            attempts++;
            attemptsLeft = 3 - attempts;
           
            System.out.println("Try again");
            System.out.println("You have "+attemptsLeft+" attempts left.");
           
        }
        if (attempts ==3){
                System.out.println("Account blocked, try later");
            }


        input.close();
    }
}

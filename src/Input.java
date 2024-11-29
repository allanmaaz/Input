import java.util.Scanner;
public class Input {
    public static void main(String[]args){

        Scanner scanner =new Scanner(System.in);
        System.out.print("ENTER your name: ");
        String name=scanner.nextLine();
        System.out.print("Enter your Age: ");
        int age=scanner.nextInt();
        System.out.println("Hellow "+name);
        System.out.println("Your Age is "+age);
    }
}

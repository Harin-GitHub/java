import java.util.Scanner;


public class Name {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name (first middle last): ");
        String name = scan.nextLine();

        String[] nameParts = name.split(" ");

        if (nameParts.length == 3) {
            System.out.println(nameParts[2] + ", " + nameParts[0] + " " + nameParts[1].charAt(0));
        } else {
            System.out.println("Invalid name");
        }
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        run();


    }
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(menuHeader());
        System.out.println(leadText());
        System.out.println(menuItems());

        int choice = scanner.nextInt();



        switch (choice) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                enterNewFriend();
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            case 7:
                System.out.println("7");
                break;
            case 8:
                System.out.println("8");
                break;
            case 9:
                System.exit(0);
                break;
            default:
                System.out.println("Ugyldigt Valg! Prøv igen");
        }
        scanner.close();
    }


   static ArrayList<Person> personList = new ArrayList<>();


    public void addPerson(Person person) {
        personList.add(person);
    }

    public static void enterNewFriend(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the name of your friend?");
        String friendsName = scanner.nextLine();
        System.out.println("What is the phone number of your friend?");
        String friendsPhone = scanner.nextLine();
        System.out.println("What is the Email of your friend?");
        String friendsEmail = scanner.nextLine();
        personList.add(new Friend(friendsName, friendsPhone, friendsEmail));
    }


    public static String menuHeader(){
        return "Menu";
    }
    public static String leadText() {
        return "Choose option:";
    }
    public static String menuItems() {
        return "1. Show list of persons\n" +
                "2. Enter new friend\n" +
                "3. Enter new family member\n" +
                "4. Delete person\n" +
                "5. save list\n" +
                "6. Load list\n" +
                "9. Quit\n";
    }
}

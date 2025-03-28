import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Attr
    public ArrayList arraylist;

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);

        boolean y = true;
        while (y) {
            System.out.println(menuHeader());
            System.out.println(leadText());
            System.out.println(menuItems());

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayFriendList();
                    break;
                case 2:
                    enterNewFriend();
                    break;
                case 3:
                    enterNewFamilyMember();
                    break;
                case 4:
                    deletePerson();
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
                    y = false;
                    break;
                default:
                    System.out.println("\nUgyldigt Valg! Prøv Igen\n");
            }
        }
    }

    static ArrayList<Person> personList = new ArrayList<Person>();

    public ArrayList<Person> getList(){
        return this.arraylist;
    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    public static void enterNewFriend() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the name of your friend?");
        String friendsName = scanner.nextLine();
        System.out.println("What is the phone number of your friend?");
        String friendsPhone = scanner.nextLine();
        System.out.println("What is the Email of your friend?");
        String friendsEmail = scanner.nextLine();
        personList.add(new Friend(friendsName, friendsPhone, friendsEmail));
    }

    public static void enterNewFamilyMember() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the name of your family member?");
        String familyMemberName = scanner.nextLine();
        System.out.println("What is the phone number of your family member?");
        String familyMemberPhone = scanner.nextLine();
        System.out.println("What is the Email of your family member?");
        String familyMemberEmail = scanner.nextLine();
        System.out.println("What is your relation to this family member?");
        String familyMemberRelation = scanner.nextLine();
        personList.add(new FamilyMember(familyMemberName, familyMemberPhone, familyMemberEmail, familyMemberRelation));
    }

    public static void deletePerson(){
        Scanner scanner = new Scanner (System.in);
        System.out.println(personList);
        System.out.println("Enter the name of the person you want to delete");
        String removeName = scanner.nextLine();
        if (personList.remove(removeName)) {
            System.out.println("Person \"" + removeName + "\" removed successfully.");
        } else {
            System.out.println("Person \"" + removeName + "\" not found in the list.");
        }
    }


    public static String menuHeader() {
        return "\n\nMENU";
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

    public static void displayFriendList() {
        System.out.printf("%-15s%-20s%-20s\n", "Name", "Number", "Email");

        for (Person personList : personList) {
            System.out.println(personList);
        }
    }
}

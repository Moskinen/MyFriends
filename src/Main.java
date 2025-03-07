public class Main {

    public static void main(String[] args) {

        System.out.println(menuHeader());
        System.out.println(leadText());
        System.out.println(menuItems());


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

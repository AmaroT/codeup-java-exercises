import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       boolean again = true;//should we continue or not?
        do {
            System.out.print("Type @ Bob: ");
            String userInput = sc.nextLine();//either a string, or an empty string

            if (userInput.isEmpty()) {
                System.out.println("Fine, be that way.");
            } else {
                char lastChar = userInput.charAt(userInput.length() - 1);
                switch (lastChar) {
                    case '?':
                        System.out.println("Sure");
                        break;
                    case '!':
                        System.out.println("Whoa, chill out!");
                        break;
                    default:
                        System.out.println("Whatever");
                        break;
                }
                //ask the user if they would like to continue
                System.out.println("DM Bob again? [Y/N]: ");
                String response = sc.nextLine();
                if (!response.trim().equalsIgnoreCase("y")) {
                    again = false;
                }
            }

        } while (again) ;
        //user has clicked something other than y/Y, so exit with a message
        System.out.println("OK, bye");

    }
}


import java.util.Random;
import java.util.*;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = {"Adaptable", "Charming", "Communicative", "Fair-minded", "Energetic","Hard-working", "Helpful","Easygoing", "Focused", "Ambitious"};
        int idx1 = new Random().nextInt(adjectives.length);
        String[] nouns = {"Whale", "Tiger", "Cat", "Elephant","Human","Coffee", "Flag", "Fish", "Heart", "Body"};
        int idx2 = new Random().nextInt(nouns.length);
        String randomName = (adjectives[idx1] +"-" + nouns[idx2]);
        System.out.println("Here is your Server Name: " + randomName);
    }

}

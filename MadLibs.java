import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String madLib1 = new String(
                "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.");
        String madLib2 = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
        String madLib3 = "I was late to school today because my <noun> <adverb> stole my <noun>.";

        System.out.println("Original story of MadLib 1: " + madLib1);
        System.out.println("Enter a noun: ");
        String nounInput = scanner.nextLine();
        System.out.println("Enter a plural noun: ");
        String pluralNounInput = scanner.nextLine();
        System.out.println("Enter a number: ");
        String numberInput = scanner.nextLine();

        /*
         * System.out.println("Original story of MadLib 2: " + madLib2);
         * System.out.println("Original story of MadLib 3: " + madLib3);
         */
    }
}
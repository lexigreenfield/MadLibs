import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String madLib1 = new String(
                "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.");
        String madLib2 = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
        String madLib3 = "I was late to school today because my <noun> <adverb> stole my <another_noun>.";

        System.out.println("Original story of MadLib 1: " + madLib1);
        System.out.println("Enter a noun: ");
        String nounInput = scanner.nextLine();
        System.out.println("Enter a plural noun: ");
        String pluralNounInput = scanner.nextLine();
        System.out.println("Enter a number: ");
        String numberInput = scanner.nextLine();
        int nounIndex = madLib1.indexOf("<noun>");
        int pluralNounIndex = madLib1.indexOf("<plural_noun>");
        int numberIndex = madLib1.indexOf("<number>");
        int nounIndex2 = madLib1.indexOf(", the");
        int pluralNounIndex2 = madLib1.indexOf(" and the");
        int numberIndex2 = madLib1.indexOf(" beasts");
        System.out.println(madLib1.substring(0, nounIndex) + nounInput + madLib1.substring(nounIndex2, pluralNounIndex)
                + pluralNounInput + madLib1.substring(pluralNounIndex2, numberIndex) + numberInput
                + madLib1.substring(numberIndex2));

        System.out.println("Original story of MadLib 2: " + madLib2);
        System.out.println("Enter an adjective: ");
        nounInput = scanner.nextLine();
        System.out.println("Enter a noun: ");
        pluralNounInput = scanner.nextLine();
        System.out.println("Enter an adverb: ");
        numberInput = scanner.nextLine();
        nounIndex = madLib2.indexOf("<adjective>");
        pluralNounIndex = madLib2.indexOf("<noun>");
        numberIndex = madLib2.indexOf("<adverb>");
        nounIndex2 = madLib2.indexOf(" land");
        pluralNounIndex2 = madLib2.indexOf(" <adverb>");
        numberIndex2 = madLib2.indexOf(" grew");
        System.out.println(madLib2.substring(0, nounIndex) + nounInput + madLib2.substring(nounIndex2, pluralNounIndex)
                + pluralNounInput + madLib2.substring(pluralNounIndex2, numberIndex) + numberInput
                + madLib2.substring(numberIndex2));

        System.out.println("Original story of MadLib 3: " + madLib3);
        System.out.println("Enter a noun: ");
        nounInput = scanner.nextLine();
        System.out.println("Enter an adverb: ");
        pluralNounInput = scanner.nextLine();
        System.out.println("Enter another noun: ");
        numberInput = scanner.nextLine();
        nounIndex = madLib3.indexOf("<noun>");
        pluralNounIndex = madLib3.indexOf("<adverb>");
        numberIndex = madLib3.indexOf("<another_noun>");
        nounIndex2 = madLib3.indexOf(" <adverb>");
        pluralNounIndex2 = madLib3.indexOf(" stole");
        numberIndex2 = madLib3.indexOf(".");
        System.out.println(madLib3.substring(0, nounIndex) + nounInput + madLib3.substring(nounIndex2, pluralNounIndex)
                + pluralNounInput + madLib3.substring(pluralNounIndex2, numberIndex) + numberInput
                + madLib3.substring(numberIndex2));
    }
}
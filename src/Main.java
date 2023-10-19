import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] wordList = new String[]{"logo", "mama", "coco", "yes"};
        SecondClass hw06 = new SecondClass();
        Map<Character, Integer> amountOfAppearingOfEachSymbolInSArray = hw06.symbolCounterInArray(wordList);
        System.out.println(amountOfAppearingOfEachSymbolInSArray);
        Map<String, Integer> amountOfUniqueSymbolsInEachString = hw06.uniqueSymbolsForEachArrayElements(wordList);
        System.out.println(amountOfUniqueSymbolsInEachString);

    }
}

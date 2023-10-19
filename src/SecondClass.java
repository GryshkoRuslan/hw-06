import java.util.HashMap;
import java.util.Map;

public class SecondClass {


    // эта функция возвращает Map где ключ это символ а значение это количество появления этого символа во
    // всем массиве
    public Map<Character, Integer> symbolCounterInArray(String[] arr) {
        Map<Character, Integer> symbolsAndTheirAmount = new HashMap<>();
        for (String elem : arr) {
            for (Character symbol : elem.toCharArray()) {
                if (!symbolsAndTheirAmount.containsKey(symbol)) {
                    symbolsAndTheirAmount.put(symbol, 0);
                }
                if (symbolsAndTheirAmount.containsKey(symbol)) {
                    symbolsAndTheirAmount.put(symbol, symbolsAndTheirAmount.get(symbol) + 1);
                }
            }
        }
        return symbolsAndTheirAmount;
    }


    // Эта функция возвращает Map где ключ это строка из массива а значение это количество уникальных символов
    // которые встречаются в строке только один раз
    public Map<String, Integer> uniqueSymbolsForEachArrayElements(String[] arr) {
        Map<String, Integer> stringsAndTheirUniqueSymbolsCount = new HashMap<>();
        for (String elem : arr) {
            int uniqueValuesCounter = 0;
            Map<Character, Integer> symbolsAndTheirAmount = new HashMap<>();
            for (Character symbol : elem.toCharArray()) {
                if (!symbolsAndTheirAmount.containsKey(symbol)) {
                    symbolsAndTheirAmount.put(symbol, 0);
                }
                if (symbolsAndTheirAmount.containsKey(symbol)) {
                    symbolsAndTheirAmount.put(symbol, symbolsAndTheirAmount.get(symbol) + 1);
                }
            }
            for (Character key : symbolsAndTheirAmount.keySet()) {

                if (symbolsAndTheirAmount.get(key) == 1) {
                    ++uniqueValuesCounter;
                }
            }
            stringsAndTheirUniqueSymbolsCount.put(elem, uniqueValuesCounter);
        }
        return stringsAndTheirUniqueSymbolsCount;
    }
}


package vowelcounter;

public class VowelCounter {

    public static int vowelCount(String originalString){
        String stringWithoutConsonant = originalString.replaceAll("(?i)[^aeiouy]", "");
        return stringWithoutConsonant.length();
    }
}

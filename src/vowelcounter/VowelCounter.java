
package vowelcounter;

public class VowelCounter {

    public static int vowelCount(String originalString){
        if(originalString == null){
            return 0;
        }
        
        String stringWithoutConsonant = originalString.replaceAll("(?i)[^aeiouy]", "");
        return stringWithoutConsonant.length();
    }
}

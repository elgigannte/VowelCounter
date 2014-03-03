
package vowelcounter;

public class VowelCounter {

    public static int vowelCount(String originalString){
        String stringWithoutConsonant = originalString.replaceAll("(?i)[^a,e,i,o,u,y]", "");
        return stringWithoutConsonant.length();
    }
}

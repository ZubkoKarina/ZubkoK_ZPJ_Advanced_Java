import java.util.stream.IntStream;

public class zubko_zadanie_6 {
    public static void main(String[] args) {
        System.out.println(isAlphabetic("test"));
        System.out.println(isJavaIdentifier("test_2"));
    }
    private static boolean isAlphabetic(String str) {
        return str.codePoints().allMatch(Character::isAlphabetic);
    }
    private static boolean isJavaIdentifier(String str) {
        if (str.isEmpty() || !Character.isJavaIdentifierStart(str.codePointAt(0))) {
            return false;
        }
        return str.codePoints().skip(1).allMatch(Character::isJavaIdentifierPart);
    }
}

public class Task6 {
    public boolean isWord(String input) {
        return input.codePoints().allMatch(Character::isAlphabetic);
    }

    public boolean isValidJavaIdentifier(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        int firstChar = input.codePointAt(0);
        if (!Character.isJavaIdentifierStart(firstChar)) {
            return false;
        }

        return input.codePoints().skip(1).allMatch(Character::isJavaIdentifierPart);
    }

    public static void main(String[] args) {
        Task6 task = new Task6();
        System.out.println(task.isWord("HelloWorld"));
        System.out.println(task.isValidJavaIdentifier("HelloWorld"));
    }
}


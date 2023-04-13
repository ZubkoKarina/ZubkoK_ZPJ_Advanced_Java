List<String> words = Files.readAllLines(Paths.get("words"));
Set<String> vowels = Set.of("a", "e", "i", "o", "u");

List<String> wordsWithFiveVowels = words.stream()
    .filter(word -> word.toLowerCase().chars()
        .filter(Character::isAlphabetic)
        .mapToObj(c -> String.valueOf((char) c))
        .filter(vowels::contains)
        .distinct()
        .count() == 5)
    .collect(Collectors.toList());


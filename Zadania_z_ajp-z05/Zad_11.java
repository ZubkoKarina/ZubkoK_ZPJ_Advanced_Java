Stream<String> stringStream = ...; 

OptionalInt maxLength = stringStream.mapToInt(String::length).max();

stringStream = ...; 

List<String> longestStrings = stringStream.filter(s -> s.length() == maxLength.getAsInt()).collect(Collectors.toList());


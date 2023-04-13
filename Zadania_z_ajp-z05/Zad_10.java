Stream<String> stringStream = ...; 

DoubleSummaryStatistics statistics = stringStream.mapToInt(String::length).summaryStatistics();
double averageLength = statistics.getAverage();


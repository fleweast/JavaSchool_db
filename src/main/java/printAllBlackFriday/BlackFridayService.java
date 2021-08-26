package printAllBlackFriday;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BlackFridayService {

    public static void printBlackFridayPerYearSorted(int startYear, int endYear) {

        Stream.iterate(LocalDate.of(startYear, 1, 13),
                        date -> date.getYear() <= endYear, date -> date.plusMonths(1))
                .filter(date -> date.getDayOfWeek() == DayOfWeek.FRIDAY)
                .collect(Collectors.groupingBy(LocalDate::getYear, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue(Long::compare).reversed())
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        printBlackFridayPerYearSorted(2001, 2009);
    }
}

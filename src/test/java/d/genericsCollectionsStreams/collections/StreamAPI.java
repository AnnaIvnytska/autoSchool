package d.genericsCollectionsStreams.collections;

//Создайте список List<String> не короче 50 элементов разной длинны (наполнение не важно).
//Добавьте вручную несколько пустых элементов ""
//С помощью stream() выведите на консоль:
//    -длинну каждого из элементов списка.
//    -не пустые элементы списка не содержащие символ d
//    -элементы списка в алфавитном порядке.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        Collections.addAll(cities,
                "Alexander City", "Andalusia", "Anniston", "Athens", "Atmore", "Auburn", "Bessemer",
                "Birmingham", "Chickasaw", "Clanton", "Cullman", "Decatur", "Demopolis", "Amana Colonies",
                "Ames", "Boone", "", "Burlington", "Cedar Falls", "Cedar Rapids", "Charles City", "Cherokee",
                "Clinton", "Council Bluffs", "", "Shepherdstown", "South Charleston", "Summersville", "Weirton",
                "Welch", "Wellsburg", "Weston", "Wheeling", "White Sulphur Springs", "Williamson", "New Windsor",
                "New York City", "", "Newburgh", "Niagara Falls", "North Hempstead", "Nyack", "Ogdensburg", "Olean",
                "Oneida", "Oneonta", "Ossining", "", "Oswego", "Oyster Bay", "Palmyra", "Peekskill", "Plattsburgh",
                "Port Washington", "");

        System.out.println("Length of each element in list: ");
        cities.forEach(i -> System.out.println(i + ": " + i.length()));

        List<String> filteredByD = cities.stream()
                .filter(s -> !s.contains("d") && s != (""))
                .collect(Collectors.toList());

        System.out.println("List without 'd' letter and empty values: ");
        for (String s : filteredByD) {
            System.out.println(s);
        }

        List<String> sortedByAlphabet = cities.stream()
                .filter(s -> s != (""))
                .sorted(Comparator.comparing(n -> n)).collect(Collectors.toList());

        System.out.println("List sorted in alphabetical order: ");
        for (String s : sortedByAlphabet) {
            System.out.println(s);
        }
    }
}

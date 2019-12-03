package d.genericsCollectionsStreams.collections;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class SetMapTest {
    public static void main(String[] args) {
        SetMapTest setMapTest = new SetMapTest();
        setMapTest.runTask12();
        setMapTest.runTask13();
        setMapTest.runTask14();
        setMapTest.runTask15();
        setMapTest.runTask16();
        setMapTest.runTask17();
    }

    //Создать множество строк (Set<String>), занести в него 20 слов на букву «Л»
    public void runTask12() {
        System.out.println("Task 12: ");
        Set<String> set = new HashSet<>();
        set.add("лабаз");
        set.add("лабазник");
        set.add("лабазный");
        set.add("лабардан");
        set.add("лабиализация");
        set.add("лабиализировать");
        set.add("лабиализироваться");
        set.add("лабиализоваться");
        set.add("лабиальный");
        set.add("лабильность");
        set.add("лабильный");
        set.add("лабиодентальный");
        set.add("лабиринт");
        set.add("лабиринтный");
        set.add("лабиринтодонт");
        set.add("лаборант");
        set.add("лаборантка");
        set.add("лаборантский");
        set.add("лаборатория");
        set.add("лабораторный");

        for (String text : set) {
            System.out.println(text);
        }
    }

    //Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
    //Удалить из множества все числа больше 10.
    public void runTask13() {
        System.out.println("Task 13: ");
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(0 + (int) (Math.random() * 50));
        }
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 10) iterator.remove();
        }
        for (int number : set)
            System.out.println(number);
    }

    //Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
    //Проверить сколько людей имеют совпадающие с заданным имя или фамилию
    public void runTask14() {
        System.out.println("Task 14: ");
        String name = "Jacqueline";
        String surname = "Taylor";
        Map<String, String> map = new HashMap<>();
        map.put("Oliver", "Taylor");
        map.put("Jodi", "Delgado");
        map.put("Jacqueline", "Lopez");
        map.put("Cornelius", "Harrison");
        map.put("Angelica", "Stewart");
        map.put("Herman", "Kennedy");
        map.put("Dewey", "Taylor");
        map.put("Dave", "Ramos");
        map.put("Dustin", "Ramos");
        map.put("Sheri", "Taylor");

        map.containsKey("Oliver");
        int surnameCount = 0;
        int nameCount = 0;

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            if (key == name) {
                nameCount++;
            }
            String value = pair.getValue();
            if (value == surname) {
                surnameCount++;
            }
        }
        System.out.println("Name " + name + ": " + nameCount + ", surname " + surname + ": " + surnameCount);
    }

    //Создать словарь (Map<String, LocalDate>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
    // Удалить из словаря всех людей, родившихся летом.
    public void runTask15() {
        System.out.println("Task 15: ");
        Map<String, LocalDate> map = new HashMap<>();
        map.put("Taylor", LocalDate.of(1993, 4, 11));
        map.put("Delgado", LocalDate.of(1992, 5, 11));
        map.put("Ramos", LocalDate.of(1991, 6, 11));
        map.put("Kennedy", LocalDate.of(1990, 7, 11));
        map.put("Harrison", LocalDate.of(1989, 8, 11));
        map.put("Stewart", LocalDate.of(1988, 9, 11));
        map.put("Lopez", LocalDate.of(1987, 10, 11));
        map.put("Dave", LocalDate.of(1986, 11, 11));
        map.put("Sheri", LocalDate.of(1985, 12, 11));
        map.put("Cornelius", LocalDate.of(1984, 1, 11));

        Iterator<Map.Entry<String, LocalDate>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, LocalDate> pair = iterator.next();
            LocalDate value = pair.getValue();
            Month localDate = value.getMonth();
            if (localDate == Month.JUNE || localDate == Month.JULY || localDate == Month.AUGUST)
                iterator.remove();
        }

        for (Map.Entry<String, LocalDate> pair : map.entrySet()) {
            String key = pair.getKey();
            LocalDate value = pair.getValue();
            System.out.println(key + ":" + value);
        }
    }

    //Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
    // Удалить людей, имеющих одинаковые имена.
    public void runTask16() {
        System.out.println("Task 16: ");
        Map<String, String> map = new HashMap<>();
        map.put("Oliver", "Taylor");
        map.put("Jodi", "Delgado");
        map.put("Jacqueline", "Lopez");
        map.put("Cornelius", "Harrison");
        map.put("Angelica", "Stewart");
        map.put("Herman", "Kennedy");
        map.put("Dewey", "Taylor");
        map.put("Dave", "Ramos");
        map.put("Dustin", "Ramos");
        map.put("Sheri", "Taylor");

        ArrayList<String> values = new ArrayList<>(map.values());
        for (String a : values) {
            int count = 0;
            for (int i = 0; i < values.size(); i++) {
                if (a.equals(values.get(i))) {
                    count++;
                }
                if (count > 1) {
                    HashMap<String, String> map2 = new HashMap<>(map);
                    for (Map.Entry<String, String> pair : map2.entrySet()) {
                        if (pair.getValue().equals(a))
                            map.remove(pair.getKey());
                    }
                }
            }
        }
        System.out.println(map);
    }

    //1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
    //2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
    //3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями. Обратить внимание на количество записей в получившейся коллекции.
    //4. Вывести содержимое Map на экран.
    public void runTask17() {
        System.out.println("Task 17: ");
        Map<String, String> map = new HashMap<>();
        map.put("Oliver", "Taylor");
        map.put("Jodi", "Delgado");
        map.put("Oliver", "Lopez");
        map.put("Cornelius", "Taylor");
        map.put("Oliver", "Stewart");
        map.put("Herman", "Kennedy");
        map.put("Oliver", "Taylor");
        map.put("Dave", "Taylor");
        map.put("Oliver", "Ramos");
        map.put("Sheri", "Taylor");

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
package d.genericsCollectionsStreams.collections;

import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {
        HashSetTest hashSetTest = new HashSetTest();
        hashSetTest.runTask1();
        hashSetTest.runTask2();
        hashSetTest.runTask3();
        hashSetTest.runTask4();
        hashSetTest.runTask5();
        hashSetTest.runTask6();
    }

    //Task 1
    //Создать коллекцию HashSet с типом элементов String.
    //Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
    //Вывести содержимое коллекции на экран, каждый элемент с новой строки.
    //Посмотреть, как изменился порядок добавленных элементов.
    public void runTask1() {
        System.out.println("Task 1: ");
        Set<String> set = new HashSet<>();
        set.add("Watermelon");
        set.add("Banana");
        set.add("Chery");
        set.add("Pear");
        set.add("Melon");
        set.add("Blackberry");
        set.add("Ginseng");
        set.add("Wild strawberries");
        set.add("Iris");
        set.add("Potato");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String text = iterator.next();
            System.out.println(text);
        }
    }

    //Task 2
    //Создать коллекцию HashMap<String, String>, занести туда 10 пар строк: арбуз – ягода, банан – трава, вишня – ягода,
    //груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень, земляника – ягода, ирис – цветок, картофель – клубень.
    //Вывести содержимое коллекции на экран, каждый элемент с новой строки.
    public void runTask2() {
        System.out.println("Task 2: ");
        Map<String, String> map = new HashMap<>();
        map.put("watermelon", "berry");
        map.put("banana", "grass");
        map.put("chery", "berry");
        map.put("pear", "fruit");
        map.put("melon", "vegetable");
        map.put("blackberry", "bush");
        map.put("ginseng", "root");
        map.put("wild strawberries", "berry");
        map.put("iris", "flower");
        map.put("potato", "tuber");

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }

    //Task 3
    //Есть класс Cat, с полем имя (name, String).
    //Создать коллекцию HashMap<String, Cat>.
    //Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
    //Вывести результат на экран, каждый элемент с новой строки.
    public void runTask3() {
        System.out.println("Task 3: ");
        Map<String, Cat> catMap = new HashMap<>();
        String[] cats = new String[]{"Cat1", "Cat2", "Cat3", "Cat4", "Cat5", "Cat6", "Cat7", "Cat8", "Cat9", "Cat10"};
        for (String cat : cats) {
            catMap.put(cat, new Cat(cat));
        }

        for (Map.Entry<String, Cat> pair : catMap.entrySet()) {
            String key = pair.getKey();
            Cat value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }

    //Task 4
    //Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
    //Вывести на экран список ключей, каждый элемент с новой строки.
    public void runTask4() {
        System.out.println("Task 4: ");
        Map<String, String> map = new HashMap<>();
        String[] arrayStr = new String[]{"str1", "str2", "str3", "str4", "str5", "str6", "str7", "str8", "str9", "str10"};
        for (String str : arrayStr) {
            map.put("key: " + str, "value: " + str);
        }

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            System.out.println(key);
        }
    }

    //Task 5
    //Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
    //Вывести на экран список значений, каждый элемент с новой строки.
    public void runTask5() {
        System.out.println("Task 5: ");
        Map<String, String> map = new HashMap<>();
        String[] arrayStr = new String[]{"str1", "str2", "str3", "str4", "str5", "str6", "str7", "str8", "str9", "str10"};
        for (String str : arrayStr) {
            map.put("key: " + str, "value: " + str);
        }

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String value = pair.getValue();
            System.out.println(value);
        }
    }

    //Task 6
    //Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
    //Вывести содержимое коллекции на экран, каждый элемент с новой строки.
    public void runTask6() {
        System.out.println("Task 6: ");
        HashMap<String, Object> map = new HashMap<>();
        map.put("Key1", "Value");
        map.put("Key2", 3);
        map.put("Key3", true);
        map.put("Key4", (float) 555);
        map.put("Key5", null);
        map.put("Key6", 3.5);
        map.put("Key7", new Long(458));
        map.put("Key8", '6');
        map.put("Key9", false);
        map.put("Key10", new Double(56.6));

        for (Map.Entry<String, Object> pair : map.entrySet()) {
            String key = pair.getKey();
            Object value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}

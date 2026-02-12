package list;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Object> l = new LinkedList<>();

        l.add(100);
        l.add("welcome");
        l.add(15.5);
        l.add('A');
        l.add(true);

        System.out.println(l);
        System.out.println("Number of elements in Linked List: " + l.size());

        l.remove(1);
        System.out.println("After removing element from Linked List: " + l);

        l.add(2, "Python");
        System.out.println("After insertion: " + l);

        System.out.println(l.get(2));

        l.set(2, "C#");
        System.out.println("After replacing element: " + l);

        System.out.println(l.contains("C#"));
        System.out.println(l.contains("C++"));

        System.out.println(l.isEmpty());

        System.out.println("Reading elements using for loop......");
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }
}

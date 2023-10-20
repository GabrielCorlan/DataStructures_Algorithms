package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Example1 {

    public static void main(String[] args) {

        LinkedList<String> namesLinkedList = new LinkedList<>();

        namesLinkedList.add("John");
        namesLinkedList.add("Alex");
        namesLinkedList.add("Mary");
        namesLinkedList.add("Mike");
        namesLinkedList.add(1, "Jerry");

        System.out.println(namesLinkedList);
        System.out.println(namesLinkedList.get(2));

        ArrayList<String> namesArrayList = new ArrayList<>();

        namesArrayList.add("John");
        namesArrayList.add("Alex");
        namesArrayList.add("Mary");
        namesArrayList.add("Mike");
        namesArrayList.add(1, "Jerry");

        System.out.println(namesArrayList);
        System.out.println(namesArrayList.get(2));
    }
}

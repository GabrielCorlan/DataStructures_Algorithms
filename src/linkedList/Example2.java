package linkedList;

import java.util.LinkedList;

public class Example2 {
    public static void main(String[] args) {

        LinkedList<String> letters1 = new LinkedList<>();

        letters1.push("A");
        letters1.push("B");
        letters1.push("C");
        letters1.push("D");
        letters1.push("F");
        letters1.pop();

        System.out.println(letters1);


        LinkedList<String> letters2 = new LinkedList<>();

        letters2.offer("A");
        letters2.offer("B");
        letters2.offer("C");
        letters2.offer("D");
        letters2.offer("F");
        letters2.poll();

        System.out.println(letters2);
        System.out.println(letters2.peekFirst());
        System.out.println(letters2.peekLast());
        letters2.addFirst("0");
        letters2.addLast("1");
        letters2.removeFirst();
        letters2.removeLast();
        System.out.println(letters2);

    }
}

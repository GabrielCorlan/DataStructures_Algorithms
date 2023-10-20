package linkedList.box;

public class Example3 {
    public static void main(String[] args) {

        Box head = new Box("Green");
        Box box2 = new Box("Yellow");
        Box box3 = new Box("White");
        Box box4 = new Box("Blue");
        Box box5 = new Box("Black");

        head.nextAddress = box2;
        box2.nextAddress = box3;
        box3.nextAddress = box4;
        box4.nextAddress = box5;
    }

    public static int countNodes(Box head) {
        int count = 1;
        if (head != null) {

            Box current = head;

            while (current.nextAddress != null) {
                current = current.nextAddress;
                count++;
            }
        }
        return count;
    }
}


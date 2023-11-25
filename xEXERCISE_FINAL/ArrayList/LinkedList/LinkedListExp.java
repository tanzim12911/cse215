package xEXERCISE_FINAL.ArrayList.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExp {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println(arrayList);

        LinkedList<Object> linkedList = new LinkedList<>(arrayList);

        linkedList.addFirst("red");
        linkedList.removeLast();

        ListIterator<Object> listIterator = linkedList.listIterator();

        System.out.println("Forward: ");

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next() + " ");
        }

        System.out.println("Backward: ");

        listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.hasPrevious() + " ");
        }
        
    }
}

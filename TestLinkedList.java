import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Random;

public class TestLinkedList {

    public static void main(String[] args){

        // create a linked list
        LinkedList<Integer> ll = new LinkedList<>();
        // add elements into the linked list
        ll.add(1);
        ll.add(3);
        ll.add(5);
        ll.add(7);
        ll.add(9);
        ll.add(11);
        // IntLinkedList class
        IntLinkedList linkedList = new IntLinkedList(ll);
        // print out the original elements in the linked list
        System.out.println("Elements in Linked List (Before): " + ll);

        /* -- Question 1 -- */
        // sort elements in linked list by calling addAndSort method in IntLinkedList class
        LinkedList<Integer> sortedList = linkedList.addAndSort(ll, 2);
        // print out the elements in the linked list
        System.out.println("Elements in sorted Linked List (After): " + sortedList);

        /* -- Question 2 -- */
        // swap elements in linked list by calling swapValues method in IntLinkedList class
        LinkedList<Integer> swappedList = linkedList.swapValues(ll, 1, 5);
        // print out the elements in the linked list
        System.out.println("Elements in swapped Linked List (After): " + swappedList);

        /* -- Question 3 -- */
        // create a new linked list
        LinkedList<Integer> randomLL = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 500; i++){
            // range: 9000, minimum: 1000, maximum: 9999
            int value = random.nextInt(9000) + 1000;
            randomLL.add(value);
        }
        // generate a random value range from 1000 to 9999
        int value = random.nextInt(9000) + 1000;
        System.out.println("Random value generated: " + value);
        // find element in linked list by calling findValue method in IntLinkedList class
        int valueFound = linkedList.findValue(randomLL, value);
        System.out.println("Position of number found in Linked List: " + valueFound);


        // create a linked hashmap
        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();
        // add elements into the linked hashmap
        lhm.put(0, 1);
        lhm.put(1, 3);
        lhm.put(2, 5);
        lhm.put(3, 7);
        lhm.put(4, 9);
        lhm.put(5, 11);
        // IntLinkedList class
        IntLinkedList linkedHashMap = new IntLinkedList(lhm);
        // print out the original elements in the linked hashmap
        System.out.println("\nElements in Linked Hashmap (Before): " + lhm);

        /* -- Question 4 -- */
        // sort elements in linked hashmap by calling addAndSort method in IntLinkedList class
        LinkedHashMap<Integer, Integer> sortedHashMap = linkedHashMap.addAndSort(lhm, 2);
        // print out the elements in the linked hashmap
        System.out.println("Elements in sorted Linked Hashmap (After): " + sortedHashMap);

        /* -- Question 5 -- */
        // swap elements in linked hashmap by calling swapValues method in IntLinkedList class
        LinkedHashMap<Integer, Integer> swappedHashMap = linkedHashMap.swapValues(lhm, 1, 5);
        // print out the elements in the linked hashmap
        System.out.println("Elements in swapped Linked Hashmap (After): " + swappedHashMap);

        /* -- Question 6 -- */
        // create a new linked hashmap
        LinkedHashMap<Integer, Integer> randomLHM = new LinkedHashMap<>();
        for (int i = 0; i < 500; i++){
            // range: 9000, minimum: 1000, maximum: 9999
            int number = random.nextInt(9000) + 1000;
            randomLHM.put(i, number);
        }
        // generate a random value range from 1000 to 9999
        int number = random.nextInt(9000) + 1000;
        System.out.println("Random value generated: " + number);
        // find element in linked list by calling findValue method in IntLinkedList class
        int numberFound = linkedHashMap.findValue(randomLHM, number);
        System.out.println("Position of number found in Linked Hashmap: " + numberFound);
    }

}

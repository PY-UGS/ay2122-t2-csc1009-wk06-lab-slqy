import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Set;

public class IntLinkedList {

    LinkedList<Integer> ll;
    LinkedHashMap<Integer, Integer> lhm;

    public IntLinkedList(LinkedList<Integer> ll){
        this.ll = ll;
    }

    public IntLinkedList(LinkedHashMap<Integer, Integer> lhm){
        this.lhm = lhm;
    }

    /* -- Question 1 -- */
    public LinkedList<Integer> addAndSort(LinkedList<Integer> list, int value){
        // loop through the linked list and add the value in the correct position
        for (int element: list){
            if (value < element){
                int indexElement = list.indexOf(element);
                list.add(indexElement, value);
                break;
            }
        }
        return list;
    }

    /* -- Question 2 -- */
    public LinkedList<Integer> swapValues(LinkedList<Integer> list, int indexOne, int indexTwo){
        // swap the elements given two index positions
        int elementOne = list.get(indexOne);
        int elementTwo = list.get(indexTwo);
        list.set(indexOne, elementTwo);
        list.set(indexTwo, elementOne);
        return list;
    }

    /* -- Question 3 -- */
    public int findValue(LinkedList<Integer> list, int searchVal){
        // return the position of the element if found, else return -1
        if (list.contains(searchVal)){
            return list.indexOf(searchVal);
        }
        else{
            return -1;
        }
    }

    /* -- Question 4 -- */
    public LinkedHashMap<Integer, Integer> addAndSort(LinkedHashMap<Integer, Integer> list, int value){
        // loop through the linked hashmap and add the value in the correct position
        Set<Integer> keys = list.keySet();
        list.put(keys.size(), value);
        int temp = 0;
        for (Integer key : keys){
            if (value < list.get(key)){
                temp = list.get(key);
                list.put(key, value);
                value = temp;
            }
        }
        list.put(keys.size() - 1, temp);
        return list;
    }

    /* -- Question 5 -- */
    public LinkedHashMap<Integer, Integer> swapValues(LinkedHashMap<Integer, Integer> list, int indexOne, int indexTwo){
        // swap the elements given two index positions
        Set<Integer> keys = list.keySet();
        int elementOne = list.get(indexOne);
        int elementTwo = list.get(indexTwo);
        for (Integer key : keys){
            if (key == indexOne){
                list.put(indexOne, elementTwo);
                list.put(indexTwo, elementOne);
            }
        }
        return list;
    }

    /* -- Question 6 -- */
    public int findValue(LinkedHashMap<Integer, Integer> list, int searchVal){
        // return the position of the element if found, else return -1
        Set<Integer> keys = list.keySet();
        for (Integer key : keys){
            if (searchVal == list.get(key)){
                return key;
            }
        }
        return -1;
    }

}

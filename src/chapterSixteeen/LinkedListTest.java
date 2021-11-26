package chapterSixteeen;

import java.util.*;

public class LinkedListTest {
    public static void main(String[] args) {
      String[] colors = {"black", "yelllow", "green", "blue", "violet", "silver"};
      List<String> list1 = new LinkedList<>();

      for (String color : colors) {
          list1.add(color);
      }
        String[] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};
        List<String> list2 = new LinkedList<>();

        for (String color : colors2)
            list2.add(color);

        list1.addAll(list2);
        printList(list1);

        convertToUpperCaseString(list1);
        printList(list1);

        System.out.printf("%nDeleting elements 4 to 6...");
        removeItem(list1, 4, 7);
        printList(list1);
        printReversesList(list1);
    }

    private static void printList(List<String> list) {
        System.out.print("list\n");
        for(String color : list)
            System.out.print(color + " ");
        System.out.println();
    }

    private static void convertToUpperCaseString(List<String> list) {
        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
    }

    private static void removeItem(List<String> list, int start, int end) {
        list.subList(start, end).clear();
    }

    private static void printReversesList(List<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());
        System.out.println("\nReversed List:\n");

        while(iterator.hasPrevious()){
            System.out.print(iterator.previous() + " ");
        }
    }
}

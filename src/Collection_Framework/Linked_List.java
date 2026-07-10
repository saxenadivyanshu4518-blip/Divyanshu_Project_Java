package Collection_Framework;

 import java.util.*;

 public class Linked_List {
     static void main() {

         LinkedList<Integer> t1 = new LinkedList<>();
         LinkedList<Integer> t2 = new LinkedList<>();

         t2.add(12);
         t2.add(19);
         t2.add(21);

         t1.add(6);
         t1.add(7);
         t1.add(4);
         t1.add(6);

         t1.addFirst(542);
         t1.addLast(754);

         t1.add(0, 5);
         t1.add(0, 1);

         t1.addAll(0, t2);

         // t1.clear();

         System.out.println(t1.contains(9));

         System.out.println(t1.indexOf(6));
         System.out.println(t1.lastIndexOf(6));

         for (int i = 0; i < t1.size(); i++) {

             System.out.print(t1.get(i));
             System.out.print(", ");

         }
     }
 }
package Collection_Framework;

import java.util.ArrayDeque;

public class Array_Deque {
    static void main() {

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();

//        ad1.add(432);
//        ad1.add(621);
//        ad1.add(123);

        ad1.addLast(6);
        ad1.addLast(4);
        ad1.addLast(2);
        ad1.addLast(5);

//        ad1.addFirst(55);
//        ad1.addFirst(49);


//        System.out.println(ad1.getFirst());
//        System.out.println(ad1.getLast());

            System.out.println("First in line: " + ad1.peekFirst());

        }
    }

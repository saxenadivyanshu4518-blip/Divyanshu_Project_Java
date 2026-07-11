package Collection_Framework;


import java.util.HashSet;

public class Hash_Set {
    static void main() {

        HashSet<Integer> myHashmap = new HashSet<>(6,8.5f);

        myHashmap.add(6);
        myHashmap.add(8);
        myHashmap.add(3);
        myHashmap.add(11);
        myHashmap.add(11);

        System.out.println(myHashmap);

    }
}

package Array_Data_Structure;

public class Passing_Array1 {
    public static void change (int x){

        x = 7;
    }

    static void main() {
        int x = 5;
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}

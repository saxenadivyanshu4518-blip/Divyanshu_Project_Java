package Array_Data_Structure;

public class SecondNum_Max_InArray {
    static void main() {

        int [] arr = {-4,-5,-2,-67,-3};

        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i<arr.length ; i++) {
            if (arr[i] > max) max = arr[i];

        }

        int smax = Integer.MIN_VALUE;
        for (int i = 0 ; i<arr.length ; i++){
            if (arr[i]>smax && arr[i]!=max)   smax = arr[i];

        }

        System.out.println(max);
        System.out.println(smax);

    }
}
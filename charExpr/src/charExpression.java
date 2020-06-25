import java.util.Arrays;

public class charExpression {
    public static void main(String[] args) {
        int[] a1 = new int[] {1, 2, 3};
        int[] a2 = new int[] {3, 3, 6};
        System.out.println(mergeArrays(a1, a2));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] new_arr = new int[a1.length + a2.length];
        for (int i=0;i< a1.length;i++) {
            new_arr[i] = a1[i];
        }
        for (int j=0;j< a2.length;j++) {
            new_arr[a1.length + j] = a2[j];
        }
        Arrays.sort(new_arr);
        return new_arr;
    }
}

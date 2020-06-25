import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        int val = 0;
        while (scanner.hasNextInt()) {
            if ((val = scanner.nextInt()) > 0) {
                arr.add(scanner.nextInt());
            }
            else {
                break;
            }
        }
        Collections.reverse(arr);
        for (Object element : arr.toArray()) {
            System.out.print(element.toString() + " ");
        }

    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {

        Set<T> newSet1 = new HashSet<>();
        Set<T> newSet2 = new HashSet<>();

        newSet1.addAll(set1);
        newSet2.addAll(set2);

        newSet1.removeAll(set2);
        newSet2.removeAll(set1);

        newSet1.addAll(newSet2);

        return newSet1;
    }
}

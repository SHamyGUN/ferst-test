import java.util.Arrays;

public class CycleFor {
    public static void main(String[] args) {
        int[] array = {5, 24, 3, 66, 38, 16, 27}; // 3 5 16 24 27 38
        Arrays.sort(array);
        System.out.println(array[2]);
    }
}

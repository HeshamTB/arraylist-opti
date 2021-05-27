import java.util.ArrayList;

public class Program {

    static final int DATA_SIZE = 9000000;
    static int dataSet[] = new int[DATA_SIZE];

    public static void main(String[] args) {
        initDataset();
        long startTime1 = System.nanoTime();
        boolean run1 = withoutCap();
        long endTime1 = System.nanoTime();
        long startTime2 = System.nanoTime();
        boolean run2 = withCap();
        long endTime2 = System.nanoTime();

        System.out.printf("Without cap: %d\n", (int) ((endTime1 - startTime1) / Math.pow(10, 6)));
        System.out.printf("With cap:    %d\n", (int) ((endTime2 - startTime2) / Math.pow(10, 6)));
    }

    static boolean withCap() {
        ArrayList<Integer> list = new ArrayList<>(DATA_SIZE);
        copy(list);
        return true;
    }

    static boolean withoutCap() {
        ArrayList<Integer> list = new ArrayList<>();
        copy(list);
        return true;
    }

    static void copy(ArrayList<Integer> list) {
        for (int i = 0; i < DATA_SIZE; i++) {
            list.add(dataSet[i]);
        }
    }

    static void initDataset() {
        for (int i = 0; i < DATA_SIZE; i++) {
            dataSet[i] = i;
        }
    }
}

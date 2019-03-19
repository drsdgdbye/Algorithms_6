import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyTreeMap<Integer, Integer> tree = new MyTreeMap<>();
        int min = -100;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 6; j++) {
                tree.put(j, random.nextInt(diff + 1));
            }
            System.out.println(tree.isBalanced());
        }
    }
}

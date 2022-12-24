import java.util.*;

public class HomeWork6 {

    static SetTreeMap setTreeMap = new SetTreeMap();
    static Set<Integer> setTree = new TreeSet<Integer>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });

    public static void main(String[] args) {

        System.out.print("Исходное множество: [ ");
        for (int i = 1; i <= 10; i++) {
            int random = new Random().nextInt(-100, 101);
            System.out.print(random + " ");
            setTreeMap.addTreeMap(random);
            setTree.add(random);
        }
        System.out.println("]");

        System.out.print("Отсортированное множество: [");
        setTree.forEach(n -> System.out.print(n + " "));
        System.out.println("]");
    }
}

package homework3;

public class Test {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>(5);
        list.add(0, 5);
        list.add(10);
        list.add(35);
        System.out.println(list.get(1));
        list.add(63);
        list.add(15);
        list.remove(1);
        System.out.println(list.get(1));
    }
}

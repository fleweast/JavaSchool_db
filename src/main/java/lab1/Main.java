package lab1;

public class Main {

    public static void main(String[] args) {
        MySuperIntegerList list = new MySuperIntegerList();
        list.add(5);
        list.add(7);
        list.add(1);
        list.printAll();
        list.removeByValue(7);
        list.printAll();
        list.removeByValue(0);
        list.printAll();
        list.add(3);
        list.removeByIndex(1);
        list.printAll();
        int a = list.get(1);
        System.out.println(a);
    }
}

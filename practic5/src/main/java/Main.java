import java.util.ArrayList;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) throws Exception {
        LinkedList<Account> linkedList = new LinkedList<>();
        ListOperator listOperator = new ListOperator();

        linkedList.add(new Account(100));
        linkedList.add(new Account(200));
        linkedList.add(new Account(200));
        linkedList.add(new Account(400));
        linkedList.add(new Account(900));

        System.out.println("linkedList:\n");
        for (Account object : linkedList) {
            System.out.println(object.toString() + "\n");
        }
        Account accountMax = listOperator.max(linkedList, 0, 4);
        System.out.println("max elenment in Linked list is " + accountMax + "\n");
        listOperator.changeElementsPosition(linkedList, 0, 1);
        System.out.println("linkedList after swaps element with index 0 and element with index 1:" + '\n');
        for (Account object : linkedList) {
            System.out.println(object.toString() + "\n");
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(500);
        arrayList.add(200);
        arrayList.add(25);
        System.out.println("arrayList:\n");
        for (int object : arrayList) {
            System.out.println(object + "\n");
        }
        int intMax = listOperator.max(arrayList, 1, 2);
        System.out.println("max element in arrayList from 1 to 2 = " + intMax + "\n");
        listOperator.changeElementsPosition(arrayList, 0, 2);
        System.out.println("arrayList after swap first and last elements:\n");
        for (int object : arrayList) {
            System.out.println(object + "\n");
        }
        ThreadExecutor threadExecutor = new ThreadExecutor();
        threadExecutor.showAccountFilling(200);

    }
}


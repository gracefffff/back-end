import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ListOperatorException{
        ArrayList<Account> list = new ArrayList<Account>();
        list.add(new Account(100));
        list.add(new Account(200));
        list.add(new Account(200));
        list.add(new Account(400));
        list.add(new Account(200));
        ListOperator listOperator = new ListOperator();

      Account max =   listOperator.max(list, 0 ,4);

        listOperator.changeElementsPosition(list,0, 1);
        System.out.println(max);

        }
    }


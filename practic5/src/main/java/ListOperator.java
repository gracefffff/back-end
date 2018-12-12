
import java.util.List;

public class ListOperator  {

    public ListOperator() {
    }



    public <E extends Comparable<E>> E max(List<E> list, int firstIndex, int lastIndex) throws ListOperatorException {
        try {


            E maxValue = list.get(firstIndex);
            for (int i = firstIndex+1; i <= lastIndex; i++) {
                if (list.get(i).compareTo(maxValue) >= 0) {
                    maxValue = list.get(i);
                }
            }

        return maxValue;
        } catch(IndexOutOfBoundsException ex) {
            throw new ListOperatorException("index out of range");
        }
    }

    public <E> void changeElementsPosition(List<E> list, int firstIndex, int secondIndex) throws ListOperatorException {
        try {
            E temp;
            temp = list.get(firstIndex);
            list.set(firstIndex, list.get(secondIndex));
            list.set(secondIndex, temp);
        } catch(IndexOutOfBoundsException ex) {
            throw new ListOperatorException("index out of range");
        }
    }
}

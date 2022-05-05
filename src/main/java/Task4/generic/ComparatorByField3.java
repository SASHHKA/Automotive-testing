package Task4.generic;

import Task4.reflection.CustomClass;
import java.util.Comparator;

public class ComparatorByField3 implements Comparator<CustomClass>{
    public int compare(CustomClass o1, CustomClass o2) {
        return o1.getField3().compareTo(o2.getField3());
    }
}

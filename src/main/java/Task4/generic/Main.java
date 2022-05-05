package Task4.generic;

import Task4.reflection.CustomClass;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<CustomClass> list= new ArrayList<>(Arrays.asList(
                new CustomClass("asdf",1199),
                new CustomClass("sdfsdfd",2),
                new CustomClass("sdfsdf",0)
        ));

        System.out.println(list);
        System.out.println(max(list,new ComparatorByField2()));
    }
    private static CustomClass max(List<CustomClass> list, Comparator<CustomClass> personComparatorByField2) {
        return Collections.max(list, personComparatorByField2);
    }
}

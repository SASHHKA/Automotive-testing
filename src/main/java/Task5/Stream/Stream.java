package Task5.Stream;

import Task4.generic.ComparatorByField3;
import Task4.reflection.CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(args));
        ////Make simple model
        ////generate some list with those Model objects
        ////use stream with custom comparator
        ////collect it to String list using some field
        List<CustomClass> list= new ArrayList<>(Arrays.asList(
                new CustomClass("asdf",1199,88),
                new CustomClass("55",2,888),
                new CustomClass("sdfsdf",0,666)
        ));

        System.out.println(list);
        List<String> resultList= list.stream().sorted(new ComparatorByField3())
                .map(CustomClass::getField1).collect(Collectors.toList());
        System.out.println(resultList);

        List<String> resultList2= list.stream()
                .sorted(Comparator.comparing(CustomClass::getField1))
                .map(CustomClass::getField1).collect(Collectors.toList());
        System.out.println(resultList2);
    }
}

package Task4.reflection;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        CustomClass customClass = new CustomClass("asdf", 1199);

        System.out.println(get(customClass, "field1"));
    }

    private static Object get(Object object, String fieldName) {
        Class myClass = object.getClass();
        try {

            Field f = myClass.getDeclaredField(fieldName);

            f.setAccessible(true);

            return f.get(object);

        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
        return null;
    }
}

package Task5.JsonWrapper;

import com.fasterxml.jackson.xml.XmlMapper;
import net.bytebuddy.matcher.StringMatcher;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

public class XML {
    public static void main(String[] args) throws JAXBException, IOException {


        JAXBContext jaxbContext = JAXBContext.newInstance(Car.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Car car = (Car) unmarshaller.unmarshal(new File("src/main/java/Task5/JsonWrapper/car.xml"));
        System.out.println(car);

        changeField(car,"brand", "Audi");
        changeField(car,"model","RS6");
        XmlMapper xmlMapper = new XmlMapper();
        String str = xmlMapper.writeValueAsString(car);
        System.out.println(str);
    }
    private static void changeField(Object object, String fieldName,Object value) {
        Class modelClass=object.getClass();
        try {
            Field field = modelClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(object,value); ;
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}

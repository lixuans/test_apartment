import java.io.FileInputStream;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws Exception {
        Properties property = new Properties();
        property.load(new FileInputStream("C:\\Users\\LX\\Desktop\\test_apartment\\test_provider\\src\\main\\java\\db.properties"));
        String value = property.getProperty("jdbc.driver");
        System.out.println(value);
    }
}

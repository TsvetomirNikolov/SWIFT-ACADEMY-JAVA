
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;

public class XMLDumpExample {

    private static String url = "jdbc:mysql://localhost:3306/softunijson";
    private static String username = "root";
    private static String password = "1234567j";
    private static MySQL sql = new MySQL(url, username, password);

    public static void main(String[] args) throws JAXBException, FileNotFoundException, IOException, SQLException {

        String fileName = "E:\\PDF and VIDEOS\\IT\\JAVA\\Hibernate and Maven, Spring Data\\XML\\09. DB-Advanced-Hibernate-XML-Processing-Exercises\\users";
        XMLDumpExample xm = new XMLDumpExample();
        toXml(fileName);
        xm.parseXml(fileName);
    }

    private static void toXml(String fileName) throws PropertyException, JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(Person.class);
        Marshaller marshaller = context.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        Person person = new Person("15", "Pesho", new Date(96, 1, 22),
                new int[]{5, 4, 5, 6}, "secretPa$$");

        try (FileOutputStream stream = new FileOutputStream(fileName)) {
            marshaller.marshal(person, stream);
        }
    }

    private void parseXml(String fileName) throws JAXBException, SQLException {
        JAXBContext context = JAXBContext.newInstance(Users.class);
        InputStream inputStream = getClass().getResourceAsStream(fileName);
        BufferedReader bfr = new BufferedReader(new InputStreamReader(inputStream));
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Users parsed = (Users) unmarshaller.unmarshal(bfr);
        sql.toDataBase(parsed);
    }
}

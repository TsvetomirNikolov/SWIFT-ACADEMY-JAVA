
import java.time.LocalDate;
import java.util.Date;
import javax.xml.bind.annotation.*;

@XmlRootElement
class Person {

    @XmlAttribute
    String id;

    @XmlElement
    String name;

    @XmlElement
    Date dateOfBirth;

    @XmlElementWrapper
    @XmlElement(name = "grade")
    int[] grades;

    String password;

    Person() {

    }

    public Person(String id, String name, Date dateOfBirth, int[] grades, String password) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.grades = grades;
        this.password = password;
    }
}

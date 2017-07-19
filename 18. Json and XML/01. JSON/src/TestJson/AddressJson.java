package TestJson;

import com.google.gson.annotations.Expose;
import java.io.Serializable;

public class AddressJson implements Serializable {

    @Expose
    private String first_name;
    @Expose
    private String last_name;
    @Expose
    private int age;

    public AddressJson(String first_name, String last_name, int age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getAge() {
        return age;
    }

}

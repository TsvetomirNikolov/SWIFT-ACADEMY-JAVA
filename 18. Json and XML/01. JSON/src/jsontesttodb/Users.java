package jsontesttodb;

import com.google.gson.annotations.Expose;
import java.io.Serializable;

public class Users implements Serializable {

    @Expose
    private String first_name;
    @Expose
    private String last_name;
    @Expose
    private int age;


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

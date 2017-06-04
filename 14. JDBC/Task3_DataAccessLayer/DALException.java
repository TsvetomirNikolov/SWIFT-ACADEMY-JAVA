package Task3_DataAccessLayer;

import java.sql.SQLException;

public class DALException extends SQLException {

    public DALException(String message) {
        super(message);
    }

    public DALException(String message, Throwable cause) {
        super(message, cause);
    }
}

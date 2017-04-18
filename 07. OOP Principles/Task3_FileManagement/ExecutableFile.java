package Task3_FileManagement;

import java.time.LocalDate;

public class ExecutableFile extends File {

    private LocalDate _lastExecutionDate;
    private String[] _requiredResources;

    ExecutableFile(String name, String location, String[] requiredResources) {
        super(name, location);
    }
}

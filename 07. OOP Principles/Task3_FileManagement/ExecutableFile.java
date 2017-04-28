package Task3_FileManagement;

import java.time.LocalDate;
import java.util.ArrayList;

public class ExecutableFile extends File {

    private LocalDate _lastExecutionDate;
    private ArrayList<File> _requiredResources;

    ExecutableFile(String name, String location, ArrayList<File> requiredResources) {
        super(name, location);
    }

    public LocalDate getLastExecutionDate() {
        return _lastExecutionDate;
    }

    public ArrayList<File> getRequiredResources() {
        return _requiredResources;
    }

    @Override
    public String toString() {
        String endResult = super.toString()
                + (_lastExecutionDate == null ? "Last execution date: N/A" : "\nLast execution date: " + _lastExecutionDate);
        endResult += "\nRequired resources:";
        for (File f : _requiredResources) {
            endResult += "\n       " + f.getName();
        }
        return endResult;
    }
}

package Task1_FileStructure;

import java.io.IOException;
import java.nio.file.FileSystemException;

public class FileSystemObject {

    private FileSystemObject _parent;
    private String _name;

    public FileSystemObject(FileSystemObject parent, String name) {
        this._name = name;
        this._parent = parent;
    }

    public FileSystemObject getParent() {
        return _parent;
    }

    public String getName() {
        return _name;
    }
}

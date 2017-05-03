package Task1_FileStructure;

import java.util.ArrayList;

public class FolderObject extends FileSystemObject {

    private ArrayList<FileSystemObject> _children;

    public FolderObject(String name, FileSystemObject parent, ArrayList<FileSystemObject> children) {
        super(parent,name);
        this._children = children;
    }

    public void addChildren(FileSystemObject fileObject) {
        _children.add(fileObject);
    }

    public ArrayList<FileSystemObject> getChildren() {
        return _children;
    }
}

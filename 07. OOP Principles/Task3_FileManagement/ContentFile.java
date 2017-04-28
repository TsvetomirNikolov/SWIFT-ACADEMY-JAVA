package Task3_FileManagement;

import java.time.LocalDate;

public class ContentFile extends File {

    private String _content;
    private LocalDate _lastModifiedDate;

    ContentFile(String name, String location, String content) {
        super(name, location);
        this._content = content;
        this._lastModifiedDate = LocalDate.now();
    }

    public String getContent() {
        return _content;
    }

    public LocalDate getLastModifiedDate() {
        return _lastModifiedDate;
    }

    public void modify(String content) {
        this._content = content;
    }

    @Override
    public String toString() {
        String result;
        return result = super.toString() + "\nLast modification date: " + _lastModifiedDate;
    }
}

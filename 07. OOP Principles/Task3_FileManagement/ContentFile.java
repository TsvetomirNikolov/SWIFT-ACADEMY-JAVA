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
}

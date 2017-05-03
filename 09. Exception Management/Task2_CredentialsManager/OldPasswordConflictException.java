package Task2_CredentialsManager;

public class OldPasswordConflictException extends Exception {

    private String _message;
    private int _index;

    public OldPasswordConflictException(String password, int index) {
        this._message = password;
        this._index = index;
    }

    public void getPasswordConflictIndex() {
        System.out.printf("%s [Password matches a recently used one: %d]\n", this._message, this._index);
    }
}

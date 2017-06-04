package Task0_Sakila;

public class Actors {

    private String firstName;
    private String lastName;
    private int actorId;
    private int filmId;

    public Actors(String firstName, String lastName, int actorId, int filmId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.actorId = actorId;
        this.filmId = filmId;
    }
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }
}

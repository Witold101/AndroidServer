package pl.pionwit.android.server.db.security;


public class Statuses {
    private long id;
    private String name;
    private String opis;

    public Statuses() {
    }

    public Statuses(long id, String name, String opis) {
        this.id = id;
        this.name = name;
        this.opis = opis;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}

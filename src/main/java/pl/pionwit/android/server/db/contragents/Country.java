package pl.pionwit.android.server.db.contragents;


public class Country {
    private long id;
    private int namber;
    private String simvol;
    private String title;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNamber() {
        return namber;
    }

    public void setNamber(int namber) {
        this.namber = namber;
    }

    public String getSimvol() {
        return simvol;
    }

    public void setSimvol(String simvol) {
        this.simvol = simvol;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

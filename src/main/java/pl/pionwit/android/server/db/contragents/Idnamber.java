package pl.pionwit.android.server.db.contragents;


import java.util.Calendar;
import java.util.Date;

public class Idnamber {
    private long id;
    private Date date_reg;
    private Date date_last;
    private String namber;
    private String opis;
    private long contragent_id;
    private Contragent contragent;

    public Idnamber() {
        contragent = new Contragent();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate_reg() {
        return date_reg;
    }

    public void setDate_reg(Date date_reg) {
        this.date_reg = date_reg;
    }

    public Date getDate_last() {
        return date_last;
    }

    public void setDate_last(Date date_last) {
        this.date_last = date_last;
    }

    public String getNamber() {
        return namber;
    }

    public void setNamber(String namber) {
        this.namber = namber;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public long getContragent_id() {
        return contragent_id;
    }

    public void setContragent_id(long contragent_id) {
        this.contragent_id = contragent_id;
    }

    public Contragent getContragent() {
        return contragent;
    }

    public void setContragent(Contragent contragent) {
        this.contragent = contragent;
    }
}

package pl.pionwit.android.server.db.contragents;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Contragent {
    private long id;
    private Date date_reg;
    private Date date_last;
    private String name;
    private String name_full;
    private List<Idnamber> idnambers; //Список ИНН или ОГРЛ
    private List<Address> addresses; //Список адресов

    public Contragent() {
        idnambers = new ArrayList<Idnamber>();
        addresses = new ArrayList<Address>();
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_full() {
        return name_full;
    }

    public void setName_full(String name_full) {
        this.name_full = name_full;
    }

    public List<Idnamber> getIdnambers() {
        return idnambers;
    }

    public void setIdnambers(List<Idnamber> idnambers) {
        this.idnambers = idnambers;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}

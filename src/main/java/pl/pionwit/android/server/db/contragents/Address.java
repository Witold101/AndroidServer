package pl.pionwit.android.server.db.contragents;

import java.util.Date;

public class Address {
    private long id;
    private Date date_reg;
    private Date date_last;
    private String street_haus;
    private String city;
    private String post_kod;
    private long country_id;
    private Country country;
    private long vidaddress_id;
    private Vidaddress vidaddress;
    private long contragent_id;
    private Contragent contragent;

    public Address() {
        country = new Country();
        vidaddress = new Vidaddress();
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

    public String getStreet_haus() {
        return street_haus;
    }

    public void setStreet_haus(String street_haus) {
        this.street_haus = street_haus;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPost_kod() {
        return post_kod;
    }

    public void setPost_kod(String post_kod) {
        this.post_kod = post_kod;
    }

    public long getCountry_id() {
        return country_id;
    }

    public void setCountry_id(long country_id) {
        this.country_id = country_id;
    }

    public long getVidaddress_id() {
        return vidaddress_id;
    }

    public void setVidaddress_id(long vidaddress_id) {
        this.vidaddress_id = vidaddress_id;
    }

    public long getContragent_id() {
        return contragent_id;
    }

    public void setContragent_id(long contragent_id) {
        this.contragent_id = contragent_id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Vidaddress getVidaddress() {
        return vidaddress;
    }

    public void setVidaddress(Vidaddress vidaddress) {
        this.vidaddress = vidaddress;
    }

    public Contragent getContragent() {
        return contragent;
    }

    public void setContragent(Contragent contragent) {
        this.contragent = contragent;
    }
}

package pl.pionwit.android.server.db.security;


import java.sql.Date;

public class User {
    private long id;
    private String name;
    private String email;
    private String password;
    private Date date_reg;
    private Date date_last;
    private long status_id;
    private Statuses status;

    public User() {
        status = new Statuses();
    }

    public User(long id, String name, String email, String password, Date date_reg, Date date_last, long status_id, Statuses status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.date_reg = date_reg;
        this.date_last = date_last;
        this.status_id = status_id;
        this.status = status;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Statuses getStatus() {
        return status;
    }

    public void setStatus(Statuses status) {
        this.status = status;
    }

    public long getStatus_id() {
        return status_id;
    }

    public void setStatus_id(long status_id) {
        this.status_id = status_id;
    }
}

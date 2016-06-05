package pl.pionwit.android.server.db;


public class DBQuery {
    public final static String QUERY_ID_NAMBERS = "SELECT * FROM pionwit_db.idnamber;";

    public final static String QUERY_ID_NAMBERS_TO_CONTRAGENT = "SELECT * FROM pionwit_db.idnamber where contragent_id=";

    public final static String QUERY_COUNTRYS = "SELECT * FROM pionwit_db.countrys;";

    public final static String QUERY_COUNTRYS_TO_ID = "SELECT * FROM pionwit_db.countrys where id=";

    public final static String QUERY_ADDRESSES = "SELECT * FROM pionwit_db.addresses";

    public final static String QUERY_ADDRESSES_TO_CONTRAGENT = "SELECT * FROM pionwit_db.addresses where contragent_id=";

    public final static String QUERY_VID_ADDRESSES = "SELECT * FROM pionwit_db.vidaddresses;";

    public final static String QUERY_VID_ADDRESS_TO_ID = "SELECT * FROM pionwit_db.vidaddresses where id=";

    public final static String QUERY_CONTRAGENTS = "SELECT * FROM pionwit_db.contragents;";

    public final static String QUERY_STATUSES = "SELECT * FROM pionwit_db.statuses;";

    public final static String QUERY_STATUSES_TO_ID = "SELECT * FROM pionwit_db.statuses where id=";

    public final static String QUERY_USERS = "SELECT * FROM pionwit_db.users;";

    public final static String QUERY_INSERT_STATUSES = "INSERT INTO pionwit_db.statuses (name, opis) value (?,?);";

    public final static String QUERY_INSERT_USER = "INSERT INTO pionwit_db.users (name,email,password," +
            "date_reg,date_last,statuses_id) value (?,?,?,?,?,?);";

    public final static String QUERY_DELETE_BY_ID = "DELETE FROM pionwit_db.";

    public final static String QUERY_DELETE_STATUS_BY_ID = "DELETE FROM pionwit_db.statuses where id=";

    public final static String QUERY_UPDATE_USER_BY_ID = "UPDATE pionwit_db.users SET NAME = ?, EMAIL = ?, " +
           "PASSWORD = ?, DATE_REG = ?, DATE_LAST = ?, STATUSES_ID = ? WHERE ID = ?;";

    public final static String QUERY_UPDATE_STATUSES_BY_ID = "UPDATE pionwit_db.statuses " +
            "SET NAME = ?, OPIS = ? WHERE ID = ?;";

}

package pl.pionwit.android.server;


import pl.pionwit.android.server.db.DBQuery;
import pl.pionwit.android.server.db.contragents.*;
import pl.pionwit.android.server.db.security.Statuses;
import pl.pionwit.android.server.db.security.User;
import pl.pionwit.android.server.interfaces.UsersDB;
import pl.pionwit.android.server.interfaces.impls.GetDBImpl;
import pl.pionwit.android.server.interfaces.impls.UserDBImpl;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        GetDBImpl getDB = new GetDBImpl();
        UsersDB getUser = new UserDBImpl();

        //getUser.addStatus(new Statuses("Test","Main"));

        List<Address> addresses = getDB.getAddresses(DBQuery.QUERY_ADDRESSES);
        List<Country> countrys = getDB.getCountrys(DBQuery.QUERY_COUNTRYS);
        List<Vidaddress> vidaddress = getDB.getVidaddresses(DBQuery.QUERY_VID_ADDRESSES);
        List<Idnamber> idnamber = getDB.getIdnambers(DBQuery.QUERY_ID_NAMBERS);
        List<Contragent> contragents = getDB.getContragents(DBQuery.QUERY_CONTRAGENTS);

        List<Statuses> statuses = getUser.getStatuses(DBQuery.QUERY_STATUSES);
        Statuses statuses2 = getUser.getStatuses(DBQuery.QUERY_STATUSES_TO_ID + 2 + ";").get(0);

        List<User> users = getUser.getUsers(DBQuery.QUERY_USERS);
        //boolean flag = getUser.dellLine("statuses",6);

        getUser.updateUser(new User(5,"Witold","g@mail","rrrrrrrr",new Date(Calendar.YEAR,11,11),new Date(2016,01,01),1,null));
        getUser.updateStatus(new Statuses(5,"Main-Main","Supper user"));

    }
}

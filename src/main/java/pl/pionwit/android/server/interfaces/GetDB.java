package pl.pionwit.android.server.interfaces;


import pl.pionwit.android.server.db.contragents.*;

import java.util.List;

public interface GetDB {
    List<Address> getAddresses(String query);
    List<Contragent> getContragents(String query);
    List<Country> getCountrys(String query);
    List<Idnamber> getIdnambers(String query);
    List<Vidaddress> getVidaddresses(String query);

}

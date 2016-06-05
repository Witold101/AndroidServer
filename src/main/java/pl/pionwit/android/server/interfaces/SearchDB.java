package pl.pionwit.android.server.interfaces;


import pl.pionwit.android.server.db.contragents.Contragent;

import java.awt.*;

public interface SearchDB {
    Contragent SearchContragent (long id);
}

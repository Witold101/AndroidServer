package pl.pionwit.android.server.interfaces;

import pl.pionwit.android.server.db.security.Statuses;
import pl.pionwit.android.server.db.security.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface UsersDB {

    void addUser(User user);
    List<User> getUsers(String query);
    boolean updateUser(User user);
    boolean dellLine(String table, long id);
    boolean isUser(String login);

    List<Statuses> getStatuses(String query);
    void addStatus(Statuses status);
    boolean updateStatus(Statuses status);
}

package pl.pionwit.android.server.interfaces.impls;

import pl.pionwit.android.server.db.DBConfig;
import pl.pionwit.android.server.db.security.Statuses;
import pl.pionwit.android.server.db.security.User;
import pl.pionwit.android.server.interfaces.UsersDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static pl.pionwit.android.server.db.DBQuery.*;


public class UserDBImpl implements UsersDB {


    public void addUser(User user) {
        Connection conn = null;
        PreparedStatement prepStatInsert;

        try {
            conn = DBConfig.init();
            prepStatInsert = conn.prepareStatement(QUERY_INSERT_USER);
            prepStatInsert.setString(1, user.getName());
            prepStatInsert.setString(2, user.getEmail());
            prepStatInsert.setString(3, user.getPassword());
            prepStatInsert.setDate(4, user.getDate_reg());
            prepStatInsert.setDate(5, user.getDate_last());
            prepStatInsert.setLong(6, user.getStatus_id());
            prepStatInsert.execute();
            prepStatInsert.close();
        } catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (InstantiationException e){
            e.printStackTrace();
        } catch (IllegalAccessException e){
            e.printStackTrace();
        } finally{
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public List<User> getUsers(String query) {
        List<User> users = new ArrayList<User>();
        Connection conn = null;

        try {
            conn = DBConfig.init();
            Statement stat = conn.createStatement();
            ResultSet rez = stat.executeQuery(query);

            while (rez.next()) {
                User table = new User();
                table.setId(rez.getLong(1));
                table.setName(rez.getString(2));
                table.setEmail(rez.getString(3));
                table.setPassword(rez.getString(4));
                table.setDate_reg(rez.getDate(5));
                table.setDate_last(rez.getDate(6));
                table.setStatus_id(rez.getLong(7));

                table.setStatus(getStatuses(QUERY_STATUSES_TO_ID + table.getStatus_id() + ";").get(0));
                users.add(table);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return users;
    }

    public boolean updateUser(User user) {
        Connection conn = null;
        PreparedStatement prepStatInsert;

        try {
            conn = DBConfig.init();
            prepStatInsert = conn.prepareStatement(QUERY_UPDATE_USER_BY_ID);
            prepStatInsert.setString(1, user.getName());
            prepStatInsert.setString(2, user.getEmail());
            prepStatInsert.setString(3, user.getPassword());
            prepStatInsert.setDate(4, user.getDate_reg());
            prepStatInsert.setDate(5, user.getDate_last());
            prepStatInsert.setLong(6, user.getStatus_id());
            prepStatInsert.setLong(7, user.getId());
            prepStatInsert.execute();
            prepStatInsert.close();
            return true;
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        } catch (ClassNotFoundException e){
            e.printStackTrace();
            return false;
        } catch (InstantiationException e){
            e.printStackTrace();
            return false;
        } catch (IllegalAccessException e){
            e.printStackTrace();
            return false;
        } finally{
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean dellLine(String table, long id) {
        Connection conn = null;

        try {
            conn = DBConfig.init();
            Statement stat = conn.createStatement();
            stat.execute(QUERY_DELETE_BY_ID+table+" where id="+id+";");
            return true;
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        } catch (ClassNotFoundException e){
            e.printStackTrace();
            return false;
        } catch (InstantiationException e){
            e.printStackTrace();
            return false;
        } catch (IllegalAccessException e){
            e.printStackTrace();
            return false;
        } finally{
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    public boolean isUser(String login) {
        return false;
    }


    public List<Statuses> getStatuses(String query) {

        List<Statuses> statuses = new ArrayList<Statuses>();
        Connection conn = null;

        try {
            conn = DBConfig.init();
            Statement stat = conn.createStatement();
            ResultSet rez = stat.executeQuery(query);

            while (rez.next()) {
                Statuses table = new Statuses();
                table.setId(rez.getLong(1));
                table.setName(rez.getString(2));
                table.setOpis(rez.getString(3));
                statuses.add(table);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return statuses;
    }

    public void addStatus(Statuses status) {
        Connection conn = null;
        PreparedStatement prepStatInsert;

        try {
            conn = DBConfig.init();
            prepStatInsert = conn.prepareStatement(QUERY_INSERT_STATUSES);
            prepStatInsert.setString(1, status.getName());
            prepStatInsert.setString(2, status.getOpis());
            prepStatInsert.execute();
            prepStatInsert.close();
        } catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (InstantiationException e){
            e.printStackTrace();
        } catch (IllegalAccessException e){
            e.printStackTrace();
        } finally{
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public boolean updateStatus(Statuses status) {
        Connection conn = null;
        PreparedStatement prepStatInsert;

        try {
            conn = DBConfig.init();
            prepStatInsert = conn.prepareStatement(QUERY_UPDATE_STATUSES_BY_ID);
            prepStatInsert.setString(1, status.getName());
            prepStatInsert.setString(2, status.getOpis());
            prepStatInsert.setLong(3, status.getId());
            prepStatInsert.execute();
            prepStatInsert.close();
            return true;
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        } catch (ClassNotFoundException e){
            e.printStackTrace();
            return false;
        } catch (InstantiationException e){
            e.printStackTrace();
            return false;
        } catch (IllegalAccessException e){
            e.printStackTrace();
            return false;
        } finally{
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}

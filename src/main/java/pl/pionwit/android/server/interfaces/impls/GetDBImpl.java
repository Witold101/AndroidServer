package pl.pionwit.android.server.interfaces.impls;

import pl.pionwit.android.server.db.DBConfig;
import pl.pionwit.android.server.db.contragents.*;
import pl.pionwit.android.server.interfaces.GetDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static pl.pionwit.android.server.db.DBQuery.*;

public class GetDBImpl implements GetDB {

    public List<Address> getAddresses(String query) {
        List<Address> addresses = new ArrayList<Address>();
        Connection conn = null;

        try {
            conn = DBConfig.init();
            Statement stat = conn.createStatement();
            ResultSet rez = stat.executeQuery(query);

            while (rez.next()) {
                Address table = new Address();
                table.setId(rez.getLong(1));
                table.setDate_reg(rez.getDate(2));
                table.setDate_last(rez.getDate(3));
                table.setStreet_haus(rez.getString(4));
                table.setCity(rez.getString(5));
                table.setPost_kod(rez.getString(6));
                table.setCountry_id(rez.getLong(7));
                table.setVidaddress_id(rez.getLong(8));
                table.setContragent_id(rez.getLong(9));

                table.setCountry(getCountrys(QUERY_COUNTRYS_TO_ID+table.getCountry_id()+";").get(0));
                table.setVidaddress(getVidaddresses(QUERY_VID_ADDRESS_TO_ID+table.getVidaddress_id()+";").get(0));

                addresses.add(table);
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
        return addresses;
    }

    public List<Contragent> getContragents(String query) {
        List<Contragent> contragents = new ArrayList<Contragent>();
        Connection conn = null;

        try {
            conn = DBConfig.init();
            Statement stat = conn.createStatement();
            ResultSet rez = stat.executeQuery(query);

            while (rez.next()) {
                Contragent table = new Contragent();
                table.setId(rez.getLong(1));
                table.setDate_reg(rez.getDate(4));
                table.setDate_last(rez.getDate(5));
                table.setName(rez.getString(2));
                table.setName_full(rez.getString(3));
                table.setIdnambers(getIdnambers(QUERY_ID_NAMBERS_TO_CONTRAGENT + table.getId() + ";"));
                table.setAddresses(getAddresses(QUERY_ADDRESSES_TO_CONTRAGENT+ table.getId() + ";"));

                contragents.add(table);
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
        return contragents;
    }

    public List<Country> getCountrys(String query) {
        List<Country> countries = new ArrayList<Country>();
        Connection conn = null;

        try {

            conn = DBConfig.init();
            Statement stat = conn.createStatement();
            ResultSet rez = stat.executeQuery(query);

            while (rez.next()) {
                Country country = new Country();
                country.setId(rez.getLong(1));
                country.setNamber(rez.getInt(2));
                country.setSimvol(rez.getString(3));
                country.setTitle(rez.getString(4));
                countries.add(country);
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
        return countries;
    }

    public List<Idnamber> getIdnambers(String query) {
        List<Idnamber> idnambers = new ArrayList<Idnamber>();
        Connection conn = null;

        try {

            conn = DBConfig.init();
            Statement stat = conn.createStatement();
            ResultSet rez = stat.executeQuery(query);

            while (rez.next()) {
                Idnamber idnamber = new Idnamber();
                idnamber.setId(rez.getLong(1));
                idnamber.setDate_reg(rez.getDate(2));
                idnamber.setDate_last(rez.getDate(3));
                idnamber.setNamber(rez.getString(4));
                idnamber.setOpis(rez.getString(5));
                idnamber.setContragent_id(rez.getLong(6));
                idnambers.add(idnamber);
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
        return idnambers;
    }

    public List<Vidaddress> getVidaddresses(String query) {
        List<Vidaddress> vides = new ArrayList<Vidaddress>();
        Connection conn = null;

        try {

            conn = DBConfig.init();
            Statement stat = conn.createStatement();
            ResultSet rez = stat.executeQuery(query);

            while (rez.next()) {
                Vidaddress vid = new Vidaddress();
                vid.setId(rez.getLong(1));
                vid.setName(rez.getString(2));
                vides.add(vid);
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
        return vides;
    }

}

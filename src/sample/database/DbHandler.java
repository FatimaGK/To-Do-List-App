package sample.database;

import sun.security.krb5.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbHandler extends Configs {

    Connection dbConnection;

    public Connection getDbconnetion() throws ClassNotFoundException, SQLException {

        String connectionString = "" + dbHost + "" +
                dbPort + "" +
                dbName;
        Class.forName("");
        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);

        return dbConnection;
    }

    //Write
    public void signUpUser(String name, String surname, String email, String password, String gender) {
        //pass Strings and save to databse

        String insert = String.format("INSERT INTO USER(%s,%s,%s,%s,%s)VALUES (?,?,?,?)", Constance.USER_NAME, Constance.USER_SURNAME, Constance.USER_EMAIL, Constance.USER_PASSWORD, Constance.USER_GENDER);

        //String query = " insert into users (first_name, last_name, date_created, is_admin, num_points)"
        //        + " values (?, ?, ?, ?, ?)";

        //CONSTRUCTING OUR SQL QUERY THAT WILL INSERT NEW USER TO OUR user
        try {
            PreparedStatement preparedStatement = getDbconnetion().prepareStatement(insert);
            preparedStatement.setString(1, name);
            preparedStatement.setString(1, surname);
            preparedStatement.setString(1, email);
            preparedStatement.setString(1, password);
            preparedStatement.setString(1, gender);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    //Read
}
package itse1905.airlinetickets.repository;

import itse1905.airlinetickets.model.Ticket;
import itse1905.airlinetickets.model.UserAL;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public class UserRepo{
//    private SessionFactory sessionFactory;
//
//    @Resource(name = "sessionFactory")
//    public void setSessionFactory(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
//
//    public SessionFactory getSessionFactory() {
//        return sessionFactory;
//    }


    private static final String db_driver = "org.postgresql.Driver";
    private static final String jdbc_url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String user = "postgres";
    private  static final String def="kodzuken";
    private Statement statement=null;
    private Connection connection=null;
    public UserRepo() throws SQLException, ClassNotFoundException{
        Class.forName(db_driver);
        System.out.println("Connecting to a database");
        connection= DriverManager.getConnection(jdbc_url, user, def);
        System.out.println("Connected database successfully");
        statement=connection.createStatement();
        statement.executeUpdate(DB.DbCreation());
        Statement statement1=statement;


        DB.dep_in().forEach(s -> {
            try {
                statement1.executeUpdate(s);
            } catch (SQLException throwables){
                throwables.printStackTrace();
            }
        });
    }

    public List<UserAL> getAllUser() throws SQLException{
        String SQL="select * from UserAL";
        ResultSet resultSet=statement.executeQuery(SQL);
        List<UserAL> userALS=new ArrayList<>();
        while (resultSet.next()){
            String firstName=resultSet.getString("firstName");
            String lastName=resultSet.getString("lastName");
            String citizenship=resultSet.getString("citizenship");
            int age = resultSet.getInt(20);
            userALS.add(new UserAL());
        }
        return userALS;
    }

    public List<UserAL> insertUser(UserAL userAL) throws SQLException {
        String SQL="insert into UserAL values firstName=?, lastName=?, citizenship=?, age=?";
        SQL=SQL+ "where  age = ?";
        ResultSet resultSet=statement.executeQuery(SQL);
        boolean update_row=false;

        String firstName=resultSet.getString("firstName");
        String lastName=resultSet.getString("lastName");
        String city=resultSet.getString("citizenship");
        int age = resultSet.getInt(20);
        statement.executeUpdate(SQL);
        return (List<UserAL>) userAL;
    }

    public boolean updateUser(UserAL userAL) throws SQLException {
        String SQL="update UsetAL set firstName=?, lastName=?, citizenship=?, age=?";
        SQL= SQL+"where  age = ?";
        ResultSet resultSet=statement.executeQuery(SQL);
        boolean update_row=false;

        String firstName=resultSet.getString("firstName");
        String lastName=resultSet.getString("lastName");
        String city=resultSet.getString("citizenship");
        int age = resultSet.getInt(20);
        update_row=statement.executeUpdate(SQL)>0;

        return update_row;
    }

    public List<UserAL> deleteUser(UserAL student) throws SQLException {
        String SQL="delete from table where lastName=?";
        ResultSet resultSet=statement.executeQuery(SQL);
        student.setLname("Ivanov");
        statement.executeUpdate(SQL);
        return null;
    }

}

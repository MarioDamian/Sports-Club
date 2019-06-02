package sportsClub.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class DataBaseService extends DataBaseConnection {
    private static DataBaseService ourInstance = new DataBaseService();

    public static DataBaseService getInstance() {
        return ourInstance;
    }

    private DataBaseService() {
    }

    public void readAdidasDB() throws SQLException {
        ResultSet resultSet = DataBaseService.getInstance().getStatement().executeQuery("select * from adidas");
        ResultSetMetaData resultSetMetaData = (ResultSetMetaData) resultSet.getMetaData();

        while(resultSet.next()) {
            System.out.println("logo = " + resultSet.getString(1)
                    + ", bonus = " + resultSet.getInt(2)
                    + ", appears in adds = " + resultSet.getBoolean(3)
                    + ", appears on equipment = " + resultSet.getBoolean(4));
        }
    }

    public void insertSponsorAdidasDB() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        System.out.println("INSERT logo: ");
        String lg = br.readLine();
        System.out.print("INSERT bonus: ");
        String bns = br.readLine();
        System.out.println("INSERT appears in ads: ");
        String apponad = br.readLine();
        System.out.println("INSERT appears on equipment: ");
        String apponeq = br.readLine();

        String first = lg;
        Integer second = Integer.parseInt(bns);
        Boolean third = Boolean.parseBoolean(apponad);
        Boolean fourth = Boolean.parseBoolean(apponeq);

        try {
            Statement statement = DataBaseService.getInstance().getConnection().createStatement();
            statement.execute("insert into adidas(logo, bonus, apponads, apponequipment) values (" + first + ", '" + second + "', '" + third + "', '" + fourth + "')");
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertSponsorAdidasDB(Integer first, Integer second, Integer third, Integer fourth) throws IOException {
        try {
            Statement statement = DataBaseService.getInstance().getConnection().createStatement();
            statement.execute("insert into adidas(logo, bonus, apponads, apponequipment) values (" + first + ", '" + second + "', '" + third + "', '" + fourth + "')");
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateAdidasDBById() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ID = ");
        String id = br.readLine();
        System.out.println("INSERT logo: ");
        String lg = br.readLine();
        System.out.print("INSERT bonus: ");
        String bns = br.readLine();
        System.out.println("INSERT appears in ads: ");
        String apponad = br.readLine();
        System.out.println("INSERT appears on equipment: ");
        String apponeq = br.readLine();

        Integer Id = Integer.parseInt(id);
        String first = lg;
        Integer second = Integer.parseInt(bns);
        Boolean third = Boolean.parseBoolean(apponad);
        Boolean fourth = Boolean.parseBoolean(apponeq);

        String sql = "update adidas set logo = ?, bonus = ?, apponads = ?, apponequipment = ? where id = " + Id;

        try {
            PreparedStatement pst = DataBaseService.getInstance().getConnection().prepareStatement(sql);

            pst.setString(1, first);
            pst.setInt(2, second);
            pst.setBoolean(3, third);
            pst.setBoolean(4, fourth);
            pst.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
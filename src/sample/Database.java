package sample;

import java.sql.*;

import java.util.ArrayList;
import java.util.Random;

public class Database {
    Connection conn = null;
    Statement stmt = null;

    public Database() {

        try {
            String url = "jdbc:sqlite:";
            String path = "C:\\Users\\William\\IdeaProjects\\SPII2018\\src\\sample\\SPDB.db";
            //Windows og MAC bruger forskellige PAth separatorer. Linux/mac bruger maaske / hvor Windows i Java bruger \\
//            Class.forName("org.sqlite.JDBC");
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(url+path);

            System.out.println("Forbindelse oprettet");
            stmt = conn.createStatement();
            String opretMig = "CREATE TABLE if not EXISTS Maalinger\n" +
                    "(\n" +
                    "    id INT NOT NULL,\n" +
                    "    vaerdier INT,\n" +
                    "    Dato DATE,\n" +
                    "    Tidspunkt DATETIME\n" +
                    ");";
            stmt.execute(opretMig);



        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(0);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ArrayList loadData() {

        ArrayList al = null;
        return al;
    }

    public ArrayList<Double> indsaetrandomfyld(int size) {

        ArrayList<Double> gylle = new ArrayList<>();
        // System.out.println("Gylles indhold:");

        double min, max;
        min = 0.01;
        max = 0.995;
        Random r = new Random();
        for (int i = 0; i < size; i++) {

            gylle.add(min + (max - min) * r.nextDouble());
//double resultat = min+(max-min)*r.nextDouble();
            //   System.out.println(gylle.get(i));
        }

        return gylle;
    }

    public void saveData(ArrayList arrayList) {

    }
}

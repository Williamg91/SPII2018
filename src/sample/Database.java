package sample;

import java.sql.*;
import java.util.ArrayList;
import java.util.Random;

public class Database {
    Connection conn = null;

    public Database() {

        try {
            String url = "jdbc:sqlite:jdbc:sqlite:minidb.db";
            //Windows og MAC bruger forskellige PAth separatorer. Linux/mac bruger maaske / hvor Windows i Java bruger \\
            conn = DriverManager.getConnection(url);
            System.out.println("Forbindelse oprettet");




        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(0);
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
        min = 35.5;
        max = 38.5;
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

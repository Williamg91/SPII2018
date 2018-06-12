package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import javax.swing.*;
import java.util.ArrayList;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Semesterprojekt 2");
        primaryStage.setScene(new Scene(root, 1000, 800));
        primaryStage.getIcons().add(new Image("https://cdn.shopify.com/s/files/1/0059/3992/files/Image_1_large.png?v=1476196889"));

        primaryStage.show();


    }


    public static void main(String[] args) {
        //launch(args);

        Database db = new Database();

       /* ArrayList<Double> data = db.indsaetrandomfyld(300);
        Graphclass gp = new Graphclass(data);
        JFrame frame = new JFrame("EKG");
        frame.setVisible(true);
        frame.add(gp);
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);*/
    }
}

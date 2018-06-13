package sample;

import javax.swing.*;

import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.*;

import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

import java.util.ArrayList;

public class Chartklasse extends ApplicationFrame {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset( );

    public Chartklasse(String title) {
        super(title);

        JFreeChart lineChart = ChartFactory.createLineChart(
                title,
                "milivolt", "Tidspunkt",
                createDataset(),
                PlotOrientation.VERTICAL,
                true, true, false);
        ChartPanel chartPanel = new ChartPanel( lineChart );

        setContentPane( chartPanel );
    }

    private DefaultCategoryDataset createDataset( ) {

        dataset.addValue( 15 , "schools" , "1"+1 );
        dataset.addValue( 30 , "schools" , "2" );
        dataset.addValue( 60 , "schools" ,  "3" );
        dataset.addValue( 120 , "schools" , "4" );
        dataset.addValue( 240 , "schools" , "4" );
        dataset.addValue( 300 , "schools" , "5" );
        return dataset;
    }

    //public void

    public void updateDataset(ArrayList<Double> al){
        int counter = 0;
        for (double value: al)
             dataset.addValue(value,"schools",""+counter);
        counter++;
         {

        }
    }
}

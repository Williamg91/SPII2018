package sample;

import javax.swing.*;

import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.*;

import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

import java.util.ArrayList;

public class Chartklasse extends ApplicationFrame {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();

    public Chartklasse(String title) {
        super(title);

        JFreeChart lineChart = ChartFactory.createLineChart(
                title,
                "Tidspunkt", "mV",
                createDataset(),
                PlotOrientation.VERTICAL,
                true, true, false);
        ChartPanel chartPanel = new ChartPanel(lineChart);

        setContentPane(chartPanel);
    }

    private DefaultCategoryDataset createDataset() {
        int maaling = 2;
        //til at lave simulerede dataset
        boolean taelOp = true;

        for (int i = 0; i < 1800; i++) {
            if (taelOp) {
                maaling=maaling+4;
            } else {
                maaling--;
            }
            if (maaling > 1024) {
                taelOp = false;
            }
            if (
                    maaling == 1) {
                taelOp = true;
            }
            System.out.println(maaling);
dataset.addValue(maaling,"schools",""+i);
        }
        return dataset;
    }

    public DefaultCategoryDataset setMaalinger(ArrayList<Double> input) {
        dataset.clear();
        for (int i =0; i< input.size();i++){
           dataset.addValue(input.get(i),"EKG vaerdier", ""+i);

        }

        return dataset;
    }
}





   /*
        public void updateDataset (ArrayList < Double > al) {
            int counter = 0;
            for (double value : al)
                dataset.addValue(value, "schools", "" + counter);
            counter++;
            {

            }
        }
    */

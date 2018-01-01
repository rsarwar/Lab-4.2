import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.Axis;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
 
 
public class LineChartCSV extends Application {
 
    @Override public void start(Stage stage) {
        stage.setTitle("Line Chart Sample");
        //defining the axes
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Year");
        //creating the chart
        final LineChart<String,Number> lineChart = 
                new LineChart<String,Number>(xAxis,yAxis);
                
        lineChart.setTitle("Homeless Population");
        //defining a series
        XYChart.Series series = new XYChart.Series();
        series.setName("Manhattan");
        //populating the series with data
        series.getData().add(new XYChart.Data("2009", 777));
        series.getData().add(new XYChart.Data("2010", 1145));
        series.getData().add(new XYChart.Data("2011", 786));
        series.getData().add(new XYChart.Data("2012", 906));
        /*series.getData().add(new XYChart.Data(5, 34));
        series.getData().add(new XYChart.Data(6, 36));
        series.getData().add(new XYChart.Data(7, 22));
        series.getData().add(new XYChart.Data(8, 45));
        series.getData().add(new XYChart.Data(9, 43));
        series.getData().add(new XYChart.Data(10, 17));
        series.getData().add(new XYChart.Data(11, 29));
        series.getData().add(new XYChart.Data(12, 25));*/
        
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Brooklyn");
        series2.getData().add(new XYChart.Data("2009", 200));
        series2.getData().add(new XYChart.Data("2010", 428));
        series2.getData().add(new XYChart.Data("2011", 242));
        series2.getData().add(new XYChart.Data("2012", 368));
       
        XYChart.Series series3 = new XYChart.Series();
        series3.setName("Bronx");
        series3.getData().add(new XYChart.Data("2009", 164));
        series3.getData().add(new XYChart.Data("2010", 174));
        series3.getData().add(new XYChart.Data("2011", 115));
        series3.getData().add(new XYChart.Data("2012", 169));
       
        Scene scene  = new Scene(lineChart,800,600);
        lineChart.getData().addAll(series, series2, series3);
       
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Chart;

import Business.EcoSystem;
import Business.Event.Event;
import java.io.File;
import java.io.IOException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Raghavi Kirouchenaradjou
 */
public class BarCharGeneration {
    
    public File getFileName(EcoSystem system) throws IOException
    {
          
      final DefaultCategoryDataset dataset = new DefaultCategoryDataset( ); 
for(Event events : system.getEventDirectory().getEventList())
{
    
     dataset.addValue( 1.0, events.getEventName(),events.getEventName() ); 
   
}
                 
      
      JFreeChart barChart = ChartFactory.createBarChart3D(
         "Car Usage Statistics",             
         "Category",             
         "Score",             
         dataset,            
         PlotOrientation.VERTICAL,             
         true, true, false);
         
      int width = 640; /* Width of the image */              
      int height = 480; /* Height of the image */                              
      File barEventVsUsers = new File( "eventVsNoOfUsers.jpeg" );                            
      ChartUtilities.saveChartAsJPEG( barEventVsUsers, barChart, width, height);
      return barEventVsUsers;
    }
}

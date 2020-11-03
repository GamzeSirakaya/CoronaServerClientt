
import java.awt.BorderLayout;
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sirak
 */
public class Singleton {
    private static Singleton instance;
  
    private Singleton(){
    
    
    
    }
      public static Singleton GetInstance(){
    
   if(instance==null)
       instance =new Singleton();
   
   
   return instance;
    }
      public float chart(){
      
      
      
      
      
     
           
        
       
        /*panel.removeAll();
        panel.add(chartpanel,BorderLayout.CENTER);
        panel.validate();
        */
        
        
        return 0;
}
   
      
       

}

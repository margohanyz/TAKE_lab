/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.backing;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

/**
 *
 * @author marce
 */
@Named(value = "chartBeam")
@RequestScoped
public class ChartBeam {

    private LineChartModel sincos;

    /**
     * Creates a new instance of ChartBeam
     */
    public ChartBeam() {
        createModel();
    }
    
    private void createModel(){
        sincos = makeSinusCosinus();
        sincos.setTitle("sinus i cosinus");
        sincos.setLegendPosition("i");
        sincos.getAxes().put(AxisType.X, new CategoryAxis("stopien"));
        sincos.setZoom(true);
        Axis yAxis = getSincos().getAxis(AxisType.Y);
        yAxis.setLabel("wartosc");
    }

    private LineChartModel makeSinusCosinus() {
        LineChartModel model = new LineChartModel();

        LineChartSeries sinus = new LineChartSeries();
        sinus.setLabel("sinus");
        
        for (int i = 0; i <= 360; i += 10) {
            sinus.set(i, Math.sin(Math.toRadians(i)));
        }

        LineChartSeries cosinus = new LineChartSeries();
        cosinus.setLabel("cosinus");

        for (int i = 0; i <= 360; i += 10) {
            cosinus.set(i, Math.cos(Math.toRadians(i)));
        }
        
        model.addSeries(sinus);
        model.addSeries(cosinus);
        return model;
    }

    /**
     * @return the sincos
     */
    public LineChartModel getSincos() {
        return sincos;
    }

    public void setSincos(LineChartModel Sincos) {
        this.sincos = Sincos;
    }

}

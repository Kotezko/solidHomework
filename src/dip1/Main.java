package dip1;

import dip1.model.Report;
import dip1.model.util.DisplayPrinter;
import dip1.model.util.ReportManager;
import dip1.model.util.ReportPrinter;
import logger.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Log.log(Main.class.getName());
    public static void main(String[] args) {
        log.log(Level.INFO, "Method main in model package started");
        ReportManager manager = new ReportManager(new ReportPrinter());
        ReportManager manager1 = new ReportManager(new DisplayPrinter());
        Report report = new Report();
        manager.output(report.calculate());
        manager1.output(report.calculate());
    }
}

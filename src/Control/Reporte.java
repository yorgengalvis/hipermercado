
package Control;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;

public class Reporte {
    
    private String barras = File.separator;
    private String ubicacionReporte = System.getProperty("user.dir") + barras + "util" + barras;

    public Reporte() {
    }
    
    public Reporte(String sucursales){
        
        Map map = new HashMap();
        map.put("sucursales", sucursales);
        
            try {
                 JasperPrint jprint = JasperFillManager.fillReport(ubicacionReporte + "reporte.jasper", map, new JREmptyDataSource());
                JasperPrintManager.printReport(jprint, true);
            } catch (JRException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
            }
    }
  
}

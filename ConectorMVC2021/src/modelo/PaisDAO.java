
package modelo;


import java.sql.ResultSet;
import java.util.ArrayList;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


public class PaisDAO implements ConsultasDAO {

    @Override
    public void insertar(PaisVO p) {
     Conector c = new Conector(); // esto nos da accesso en el metodo a los valores de conector
        try {
            c.conectar();//coneccion
            String consulta = "INSERT INTO tbl_pais(nomre_pais, "
                    + "capital_pais, poblacion_pais) VALUES('"+p.getNombre_pais()+"', '"+p.getCapital_pais()+"', "+p.getPoblacion_pais()+ ");";
           // campos tipo String que almacenan los datos
            c.consultas_multiples(consulta); // ejecuta los datos recibidos y los transforma en SQL
            
        } catch (Exception e) {
            System.err.println("Mensaje Insertar"+e.getMessage());
        }
        
     c.desconectar();
     
    }

    @Override
    public void actualizar(PaisVO p) {
   Conector c = new Conector();
        try {
            c.conectar();
            String consulta = "UPDATE tbl_pais SET nombre_pais ='"+p.getNombre_pais()+"', "
                    + "capital_pais ='"+p.getCapital_pais()+"', "
                    + "poblacion_pais="+p.getPoblacion_pais()+" WHERE id_pais  ="+p.getId_pais();
            c.consultas_multiples(consulta);
        } catch (Exception e) {
            System.err.println("Erro Actualizar "+e.getMessage());
        }
        
        
    }

    @Override
    public void eliminar(PaisVO p) {
     Conector c = new Conector();
        try {
            c.conectar();
            String consulta = "DELETE FROM tbl_pais WHERE id_pais ="+p.getId_pais()+";";
            c.consultas_multiples(consulta);
        } catch (Exception e) {
            System.err.println("Mensaje Eliminar "+e.getMessage());
        }
        c.desconectar();
    }

    @Override
    public ArrayList<PaisVO> consultarTabla() {
      Conector c = new Conector();
      ArrayList<PaisVO> info = new ArrayList<>();

        try {
            c.conectar();
            String consulta = "SELECT * FROM tbl_pais;";
            ResultSet rs = c.consulta_datos(consulta); // permite obterner la informacion de la base de datos
            while(rs.next()){
            PaisVO pvo = new PaisVO();
            pvo.setId_pais(rs.getInt(1));
            pvo.setNombre_pais(rs.getString(2));
            pvo.setCapital_pais(rs.getString(3));
            pvo.setPoblacion_pais(rs.getLong(4));
            info.add(pvo);
            }
            c.desconectar();
        } catch (Exception e) {
        }
      
  return info;
    }
    
    
    //Esta clase usa el JRViewercomponente para mostrar informes. Representa una aplicación simple de Java Swing que puede cargar y mostrar informes. Se utiliza en casi todas las muestras suministradas para mostrar los documentos generados.
public JasperViewer jv; // La variable tiene que se publica 

    public void reporte(){
        Conector c = new Conector();
        try {
            c.conectar();
            //variable que encuentra el reporte
            JasperReport reporte;
            //ruta del reporte
            String ruta = "C:\\Users\\Cristopher Silva\\Documents\\NetBeansProjects\\ConectorMVC2021\\src\\reportes\\reportePaises.jasper";
            //asignacion de ruta
            reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
            JasperPrint jp = JasperFillManager.fillReport(reporte, null, c.con);
            JasperViewer jv = new JasperViewer(jp);
            this.jv = jv;
            
        } catch (Exception e) {
            System.err.println("Mensaje Reporte "+e.getMessage());
        }
    } 
    
}

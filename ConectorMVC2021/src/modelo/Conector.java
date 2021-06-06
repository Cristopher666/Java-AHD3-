
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Conector {
   // Declaracion de variables que se utilizaran en la conexion
    private String driver = "com.mysql.jdbc.Driver"; // es el nombre de una de las librerias del jar
    private String servidor = "127.0.0.1"; //esa es la ip del servidors local host
    private String usuario = "root";
    private String password = "";
    private String bd = "bd_java_con1";
    private String cadena;
    
    //Declara el objeto que me permite realizar una concexion y escoger la libreria java.sql
    Connection con;

    // Declarar el objeto que permite realizar consultas SQL insert, update, delte
    Statement st;  // a la hora de importar, escojer java.sql
    
    
    //Metodos para la conexion
    public void conectar(){
    this.cadena = "jdbc:mysql://"+this.servidor+"/"+this.bd; // este es la direccion lo cual hara que se conecte al servidor y este a su vez a la base de datos
        try {
            Class.forName(this.driver).newInstance();
            this.con= DriverManager.getConnection(this.cadena, this.usuario , this.password);
        } catch (Exception e) {
            System.err.println("Mensaje 1"+e.getMessage());
            
        }
    }
    // Metodo para desconectar
    
   public void desconectar(){
            try {
                this.con.close();
            } catch (Exception e) {
                System.err.println("Mensaje 2"+e.getMessage());
            }
   }
   
   // Metodo para realizar diversas consults como, insert, updatem delete
    public int consultas_multiples (String consulta){
    int resultado;
    // la funcion createStatement genera la consulta de las basses de datos
        try {
            this.conectar();
            this.st = this.con.createStatement();
            resultado = this.st.executeUpdate(consulta);
        } catch (Exception e) {
            System.err.println("Mensaje 3"+e.getMessage());
            return 0;
        }
        finally {
        this.desconectar();
        }
    return resultado;
    
    }
    
    // Metodo para obtener datos de una base de datos, select
    
    public ResultSet consulta_datos (String consulta){
        try {
            this.conectar();
            ResultSet resultado = null;
            this.st =  this.con.createStatement();
            resultado = st.executeQuery(consulta);
            return resultado;
        } catch (Exception e) {
            System.err.println("Mensaje 4"+e.getMessage());
        }
     
        return null;
        
    }
  
 //   
    
}

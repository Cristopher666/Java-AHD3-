
package conectormvc2021;

import controlador.ControladorInsertar;
import controlador.ControladorMenu;
import controlador.ControladorModificarDatos;
import controlador.ControladorMostrar;
import controlador.Controlador_Eliminar;
import modelo.Conector;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.Frm_Eliminar;
import vista.Frm_Insertar;
import vista.Frm_Menu;
import vista.Frm_ModificarDatos;
import vista.Frm_Mostrar;


public class ConectorMVC2021 {


    public static void main(String[] args) {
 //     Conector c = new Conector ();
   // c.conectar();
    
    //vistas
    Frm_Menu m= new Frm_Menu();
    Frm_Insertar fi= new Frm_Insertar();
    Frm_Mostrar fm = new Frm_Mostrar();
    Frm_Eliminar fe = new Frm_Eliminar();
    Frm_Eliminar vEl = new Frm_Eliminar();
    Frm_ModificarDatos  mo = new Frm_ModificarDatos();

    //Accesos a los datos
        PaisVO pvo = new PaisVO();
        PaisDAO pdao = new PaisDAO();
    
    // controladotes
    
    ControladorMenu cm =  new ControladorMenu(fi, m, fm, vEl, mo);
    ControladorInsertar ci = new ControladorInsertar(fi, pvo, pdao);
    ControladorMostrar cmo = new ControladorMostrar(fm, pvo, pdao);
     Controlador_Eliminar ce = new Controlador_Eliminar(fe, pvo, pdao);
     ControladorModificarDatos moD = new ControladorModificarDatos(mo, pvo, pdao);
             
    m.setVisible(true);
    m.setLocationRelativeTo(null);
    
    }
    
    
}

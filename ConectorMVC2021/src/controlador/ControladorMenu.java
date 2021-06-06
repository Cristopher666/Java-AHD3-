
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Frm_Eliminar;
import vista.Frm_Insertar;
import vista.Frm_Menu;
import vista.Frm_ModificarDatos;
import vista.Frm_Mostrar;

public class ControladorMenu implements ActionListener{
    
    Frm_Insertar vIn = new Frm_Insertar();
    Frm_Menu vMe = new Frm_Menu();
    Frm_Mostrar vMo = new Frm_Mostrar();
    Frm_Eliminar vEl = new Frm_Eliminar();
    Frm_ModificarDatos vMod = new Frm_ModificarDatos();
    
    public  ControladorMenu(Frm_Insertar vIn, Frm_Menu vMe, Frm_Mostrar vMo, Frm_Eliminar vEl, Frm_ModificarDatos vMod ){
    this.vIn = vIn;
    this.vMe = vMe;
    this.vMo = vMo;
    this.vEl = vEl;
    this.vMod = vMod;
            
    this.vMe.btnInsertarM.addActionListener(this);
    this.vMe.btnMostrarM.addActionListener(this);
    this.vMe.btnEliminar.addActionListener(this);
    this.vMe.btnActualizar.addActionListener(this);
    
    }
    
    
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==vMe.btnInsertarM) {
            vIn.setVisible(true);
            vIn.setLocationRelativeTo(null);
        }
        
        if (e.getSource()==vMe.btnMostrarM){
         vMo.setVisible(true);
         vMo.setLocationRelativeTo(null);
        }
        
        
         if(e.getSource() == vMe.btnEliminar){
            vEl.setVisible(true);
            vEl.setLocationRelativeTo(null);
    }
         
                 if(e.getSource() == vMe.btnActualizar){
            vMod.setVisible(true);
            vMod.setLocationRelativeTo(null);
        }
    
}}

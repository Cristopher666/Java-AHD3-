
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.Frm_Insertar;


public class ControladorInsertar implements ActionListener{

    Frm_Insertar vista = new Frm_Insertar();
    PaisVO pvo = new PaisVO();
    PaisDAO pdao = new PaisDAO();
    
    public  ControladorInsertar (Frm_Insertar vista, PaisVO pvo, PaisDAO pdao){
    this.vista =  vista;
    this.pvo = pvo;
    this.pdao = pdao;
    
    vista.btnCancelar.addActionListener(this);
    vista.btnInsertar.addActionListener(this);
    }
    
    private void insertarPais(){
    pvo.setNombre_pais(vista.txtPais.getText());
    pvo.setCapital_pais(vista.txtCapital.getText());
    pvo.setPoblacion_pais(Long.parseLong(vista.txtPoblacion.getText()));
    
    pdao.insertar(pvo);
    
    }
        
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource()== vista.btnInsertar){
    this.insertarPais();
    }
    if (e.getSource()== vista.btnCancelar){
    vista.dispose();
    }
    
    }
    
}

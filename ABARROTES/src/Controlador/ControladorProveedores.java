
package controlador;

import pkgModelo.Conexion;
import Vistas.Proveedores;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lpzlu
 */
public class ControladorProveedores implements ActionListener{
    
    private Proveedores _view;
    private pgkModelo.MDB _model;
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    String leyenda="";
     
     if(e.getSource()==_view.btninsertarproveedores){
         leyenda=_model.alta("proveedores",""+_view.txtidproveedor.getText()+",'"+  _view.txtnombreproveedor.getText()+"',"+
               "',"+  _view.txtdireccionproveedores.getText()+"',"+"'"+_view.txtgmailprovedores.getText()+",'"+_view.txttelefonoprovedores.getText()+",'" +",'"+"',null");
                 
           
     JOptionPane.showMessageDialog(null, leyenda);//Se manda mensaje con el resultado de la consulta de inserción
     
     limpiar();//se limpian las cajas de texto
     //agregar otros botones si se necesitan implementar
        
     }
        
     if(e.getSource()==_view.btneliminarprovedor){
           
     JOptionPane.showMessageDialog(null, leyenda);//Se manda mensaje con el resultado de la consulta de inserción
     
     limpiar();//se limpian las cajas de texto
         leyenda = _model.eliminar("proveedores", "id ="+ _view.txtidproveedor.getText());
                 
          // leyenda = administradorBD.borrarRegistro("TbUsuarios", "id = 3");
     //agregar otros botones si se necesitan implementar
        
     }
     
     if(e.getSource()==_view.btneditarprovedor){
            leyenda = _model.modificar("proveedores", "id_proveedor='"+_view.txtidproveedor.getText()+"' , nombre = '"+ _view.txtnombreproveedor.getText()+"' ,  direccion= '"+_view.txtdireccionproveedores.getText()+"' , email='"+_view.txtgmailprovedores.getText()+"'", "telefono= "+_view.txttelefonoprovedores.getText());
            JOptionPane.showMessageDialog(null, leyenda);
         
        limpiar();//se limpian las cajas de texto
     //agregar otros botones si se necesitan implementar
        
        }
     
      if(e.getSource()==_view.btnconsultarproveedores){
        
          String[]datos = new String[0];
          String consulta,info;
          DefaultTableModel tabla2 = new DefaultTableModel();
          tabla2.addColumn("id_proveedor");
          tabla2.addColumn("nombre");
          tabla2.addColumn("direccion");
          tabla2.addColumn("email");
          tabla2.addColumn("telefono");
         
         
          
          _view.tabla.setModel(tabla2);
          
          int i,j;
          
          consulta = _model.Consultar("proveedores","nombre,direccion,email,telefono","id_Proveedor>=1");
          datos = consulta.split(",");
          
          for(i=0; i<datos.length;i++){
              System.out.println(datos[i]);
          }
      
     }
     
    }
    
    public Controlador(VistaUser view,ModeloUsuario model){
        this._model=model;
        this._view=view;
        this._view.btninsertarproveedores.addActionListener(this);
        this._view.btneliminarprovedor.addActionListener(this);
        this._view.btneditarprovedor.addActionListener(this);
        this._view.btnconsultarproveedores.addActionListener(this);
    }
    
    
    public void iniciar(){
        _view.setTitle("MVC_Visual");
    }
    
    public void limpiar(){
        _view.txtidproveedor.setText(null);
        _view.txtnombreproveedor.setText(null);
        _view.txtdireccionproveedores.setText(null);
        _view.txtgmailprovedores.setText(null);
        _view.txttelefonoprovedores.setText(null);
          
    }
    
    }

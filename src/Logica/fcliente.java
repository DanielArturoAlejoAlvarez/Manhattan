/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.vcliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author daniel
 */
public class fcliente {
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    
    private String sSQL = null;
    private String sSQL2 = null;
    public Integer totalRegistros;
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        
        String [] titulos = {"ID","First Name","Last Name", "Type Doc","Number Doc", "Address", "Phone", "Email", "Code" }; 
        
        String [] registro = new String [9];
        
        totalRegistros = 0;
        
        modelo = new DefaultTableModel(null,titulos);
        
        sSQL = "SELECT p.idpersona,p.nombre,p.apellidos,p.tipo_doc,p.num_doc,p.direccion,p.telefono,p.email,c.codigo_cliente FROM persona p INNER JOIN cliente c ON p.idpersona=c.idpersona WHERE num_doc LIKE '%" + buscar + "%' ORDER BY idpersona DESC";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            while(rs.next()){
                registro[0] = rs.getString("idpersona");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("apellidos");
                registro[3] = rs.getString("tipo_doc");
                registro[4] = rs.getString("num_doc");
                registro[5] = rs.getString("direccion");
                registro[6] = rs.getString("telefono");
                registro[7] = rs.getString("email");
                registro[8] = rs.getString("codigo_cliente");
                
                
                
                totalRegistros = totalRegistros +1;
                modelo.addRow(registro);
                
            }
            
            return modelo;
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public boolean insertar(vcliente dts){
        sSQL = "INSERT INTO persona (nombre,apellidos,tipo_doc,num_doc,direccion,telefono,email) VALUES (?,?,?,?,?,?,?)";
        
        sSQL2 = "INSERT INTO cliente (idpersona,codigo_cliente) VALUES ((SELECT idpersona FROM persona ORDER BY idpersona DESC LIMIT 1),?)";
        try {
          
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);
            
            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getApellidos());
            pst.setString(3, dts.getTipo_documento());
            pst.setString(4, dts.getNum_documento());
            pst.setString(5, dts.getDireccion());
            pst.setString(6, dts.getTelefono());
            pst.setString(7, dts.getEmail());
            pst2.setString(1, dts.getCodigo_cliente());
            
            int n = pst.executeUpdate();
            
            if (n!=0) {
                int n2 = pst2.executeUpdate();
                if (n2!=0) {
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
            
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    public boolean editar(vcliente dts){
        sSQL = "UPDATE persona SET nombre=?,apellidos=?,tipo_doc=?,num_doc=?,direccion=?,telefono=?,email=? WHERE idpersona=?";
        
        sSQL2 = "UPDATE cliente SET codigo_cliente=? WHERE idpersona=?";
        try {
          
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);
            
            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getApellidos());
            pst.setString(3, dts.getTipo_documento());
            pst.setString(4, dts.getNum_documento());
            pst.setString(5, dts.getDireccion());
            pst.setString(6, dts.getTelefono());
            pst.setString(7, dts.getEmail());
            pst.setInt(8, dts.getIdpersona());
            pst2.setString(1, dts.getCodigo_cliente());
            pst2.setInt(2, dts.getIdpersona());
            
            int n = pst.executeUpdate();
            
            if (n!=0) {
                int n2 = pst2.executeUpdate();
                if (n2!=0) {
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
                    
        }
    }
    
    public boolean eliminar(vcliente dts){
        sSQL = "DELETE FROM cliente WHERE idpersona=?"; 
        sSQL2 = "DELETE FROM persona WHERE idpersona=?"; 
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);
            
           
            pst.setInt(1, dts.getIdpersona());
           
            pst2.setInt(1, dts.getIdpersona());
            
            int n = pst.executeUpdate();
            
            if (n!=0) {
                int n2 = pst2.executeUpdate();
                if (n2!=0) {
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
}

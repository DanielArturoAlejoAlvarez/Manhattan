# Manhattan
## Description

This repository is a Hotel System and registration of client and worker users created in Java and MySQL.

## Installation
Using Java and MySQl preferably.

## Usage
```html

$ git clone https://github.com/DanielArturoAlejoAlvarez/Manhattan.git [NAME APP] 

```
Follow the following steps and you're good to go! Important:


![GIF](https://d3nmt5vlzunoa1.cloudfront.net/idea/files/2018/03/2018-03-06-17_43_48.gif)


## Coding

### DATABASE

```java
...
public class Conexion {
    
    public String db = "hoteldb";
    public String url = "jdbc:mysql://127.0.0.1/" + db;
    public String user = "root";
    public String pass = "";

    public Conexion() {
    }
    
    public Connection conectar(){
        Connection link = null;
        
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            link = DriverManager.getConnection(this.url,this.user,this.pass);
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        
        return link;
    }
    
}
...
```
### MODEL
```java
...
public boolean insertar(vreserva dts){
        sSQL = "INSERT INTO reserva (idhabitacion,idcliente,idtrabajador,tipo_reserva,fecha_reserva,fecha_ingreso,fecha_salida,costo_alojamiento,estado) VALUES (?,?,?,?,?,?,?,?,?)";
        try {
          
            PreparedStatement pst = cn.prepareStatement(sSQL);
            
            pst.setInt(1, dts.getIdhabitacion());
            pst.setInt(2, dts.getIdcliente());
            pst.setInt(3, dts.getIdtrabajador());
            pst.setString(4, dts.getTipo_reserva());
            pst.setDate(5, dts.getFecha_reserva());
            pst.setDate(6, dts.getFecha_ingreso());
            pst.setDate(7, dts.getFecha_salida());
            pst.setDouble(8, dts.getCosto_alojamiento());
            pst.setString(9, dts.getEstado());
            
            int n = pst.executeUpdate();
            
            if (n!=0) {
                return true;
            }else{
                return false;
            }
            
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
...
```
### VIEW
```java
...
 private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        //Validations
        if (txtNumeroHabitacion.getText().length()==0) {
            JOptionPane.showConfirmDialog(rootPane, "Please enter number of room");
            txtNumeroHabitacion.requestFocus();
            return;
        }
        if (textAreaDescripcion.getText().length()==0) {
            JOptionPane.showConfirmDialog(rootPane, "Please enter description of room");
            textAreaDescripcion.requestFocus();
            return;
        }
        if (textAreaCaracteristicas.getText().length()==0) {
            JOptionPane.showConfirmDialog(rootPane, "Please enter caracteristics of room");
            textAreaCaracteristicas.requestFocus();
            return;
        }
        if (txtPrecioDiario.getText().length()==0) {
            JOptionPane.showConfirmDialog(rootPane, "Please enter daily price of room");
            txtPrecioDiario.requestFocus();
            return;
        }
        
        vhabitacion dts = new vhabitacion();
        fhabitacion func = new fhabitacion();
        
        dts.setNumero(txtNumeroHabitacion.getText());
        int s = cboPisoHabitacion.getSelectedIndex();
        dts.setPiso((String) cboPisoHabitacion.getItemAt(s));
        dts.setDescripcion(textAreaDescripcion.getText());
        dts.setCaracteristicas(textAreaCaracteristicas.getText());
        dts.setPrecio_diario(Double.parseDouble(txtPrecioDiario.getText()));
        s = cboEstado.getSelectedIndex();
        dts.setEstado((String) cboEstado.getItemAt(s));
        s = cboTipoHabitacion.getSelectedIndex();
        dts.setTipo_habitacion((String) cboTipoHabitacion.getItemAt(s));
        
        if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "The room was registered successfully!");
                mostrar("");
                inhabilitar();
            }
        }else if(accion.equals("editar")){
            dts.setIdhabitacion(Integer.parseInt(txtIdHabitacion.getText()));
            
            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "The room was edited successfully!");
                mostrar("");
                inhabilitar();
            }
        }
    }
...
```

## Contributing

Bug reports and pull requests are welcome on GitHub at https://github.com/DanielArturoAlejoAlvarez/Manhattan. This project is intended to be a safe, welcoming space for collaboration, and contributors are expected to adhere to the [Contributor Covenant](http://contributor-covenant.org) code of conduct.


## License

The gem is available as open source under the terms of the [MIT License](http://opensource.org/licenses/MIT).
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author daniel
 */
public class vtrabajador extends vpersona{
    private Double sueldo;
    private String acceso;
    private String login;
    private String password;
    private String estado;

    public vtrabajador(Double sueldo, String acceso, String login, String password, String estado, int idpersona, String nombre, String apellidos, String tipo_documento, String num_documento, String direccion, String telefono, String email) {
        super(idpersona, nombre, apellidos, tipo_documento, num_documento, direccion, telefono, email);
        this.sueldo = sueldo;
        this.acceso = acceso;
        this.login = login;
        this.password = password;
        this.estado = estado;
    }

    public vtrabajador(Double sueldo, String acceso, String login, String password, String estado) {
        this.sueldo = sueldo;
        this.acceso = acceso;
        this.login = login;
        this.password = password;
        this.estado = estado;
    }

    

   
    public vtrabajador() {
    }

    
    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public String getAcceso() {
        return acceso;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
            
}

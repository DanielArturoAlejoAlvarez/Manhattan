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
public class vcliente extends vpersona {
    private String codigo_cliente;

    public vcliente(int idpersona, String nombre, String apellidos, String tipo_documento, String num_documento, String direccion, String telefono, String email) {
        super(idpersona, nombre, apellidos, tipo_documento, num_documento, direccion, telefono, email);
    }

    public vcliente() {
    }

    public String getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }
}

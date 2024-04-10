//Un directorio telefónico posee una lista de Clientes de los que interesa conocer: dni, nombre,
//apellido, ciudad y dirección. El directorio está compuesto por el número de teléfono y los datos
//del Cliente (Directorio: <teléfono,Cliente> donde el teléfono no es un atributo del cliente. Cuando
//agendamos un cliente al directorio telefónico lo agendamos con su número de teléfono, que es
//único)
//El directorio telefónico posee además las siguientes funcionalidades:
//● agregarCliente(nroTel, Cliente):void  que permite registrar un nuevo cliente con su
//respectivo nro de teléfono. Siendo el nro del teléfono la clave del mismo.
//● buscarCliente(nroTel):Cliente  que en base al nro de teléfono retorna el Cliente asociado al
//mismo.
//● buscarTeléfono(apellido):List  que en base a un apellido nos devuelve una lista con los nros.
//de teléfono asociados a dicho apellido.
//● buscarClientes(ciudad):List  que en base a una ciudad nos devuelve una lista con los
//Clientes asociados a dicha ciudad.
//● borrarCliente(telefono):void que en base a un nro de teléfono elimina el cliente del directorio.
//

package com.mycompany.ejer3guia5parte2;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Directorio {
    private Hashtable<String, Cliente> Directorio;
    
    public Directorio() {
        Directorio = new Hashtable<String, Cliente>();
    }
    public void agregarCliente(String nroTel, Cliente cliente) {
        Directorio.put(nroTel, cliente);
    }
    public Cliente buscarCliente(String nroTel) {
        return Directorio.get(nroTel);
    }
    public List<String> buscarTelefono(String apellido) {
        List<String> telefonos = new ArrayList<String>();
        for (Cliente cli : Directorio.values()) {
            if(cli.getApellido().equals(apellido)) {
                telefonos.add(cli.getTelefono());
            }
        }
        return telefonos;
    }
    public List<Cliente> buscarClientes(String ciudad) {
        List<Cliente> clientes = new ArrayList<Cliente>();
        for (Cliente cli : Directorio.values()) {
            if (cli.getCiudad().equals(ciudad)){
                clientes.add(cli);
            }
        }
        return clientes;
    }
    public void borrarCliente(String telefono) {
        Directorio.remove(telefono);
    }
    
}

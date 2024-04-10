
//Luego desde el método main de una clase Test se pide:
// Crear un directorio.
// Cargar 5 clientes al directorio a través de su método agregarCliente, con sus respectivos
//nros de teléfono.
// Probar el resto los métodos que posee directorio.
//Importante: Armar el modelo UML representado las clases necesarias. Implementar en java.
package com.mycompany.ejer3guia5parte2;

import java.util.List;




public class Ejer3guia5parte2 {

    public static void main(String[] args) {
        Directorio directorio = new Directorio();
        
        Cliente cli1 = new Cliente(20355896, "juan", "perez", "buenos aires","3453");
        directorio.agregarCliente("266456576", cli1);
        
        Cliente cli2 = new Cliente(60345787, "ariel", "gonzalez", "tucuman","35664");
        directorio.agregarCliente("266557655", cli2);
        
        Cliente cli3 = new Cliente(27864322, "pedro", "lopez", "san luis ","232");
        directorio.agregarCliente("0115465768", cli3);
        
        Cliente cli4 = new Cliente(50345434, "lucas", "funez", "mendoza","543");
        directorio.agregarCliente("911", cli4);
        
        Cliente cli5 = new Cliente(20355896, "enzo", "fernandez", "la pampa","6745");
        directorio.agregarCliente("0800 34342", cli5);
        
        // Resto de las pruebas
        Cliente clienteEncontrado = directorio.buscarCliente("911");
        
        //List<String> telefonos = directorio.buscarTelefono("Apellido");
        
        //List<Cliente> clientesEnCiudad = directorio.buscarClientes("Ciudad");
        
        //directorio.borrarCliente("111111111");
    }


    }
    


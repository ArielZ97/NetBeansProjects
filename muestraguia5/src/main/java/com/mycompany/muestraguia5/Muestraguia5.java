/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.muestraguia5;

import java.util.ArrayList;

/**
 *
 * @author Ariel Zurita
 */
public class Muestraguia5 {

    public static void main(String[] args) {
        //arrays 
        
        String[] nombreArray = new String[5];
        for (int i = 0; i < nombreArray.length; i++) {
            nombreArray[i] = "penquito " + (i + 1);
            
        }
        for (String var : nombreArray) {
            System.out.println(var);
            
        }
        
        //colections
        ArrayList<String> nombreArrayList = new ArrayList();
        nombreArrayList.add("penquito ");
        nombreArrayList.add("penquito ");
        nombreArrayList.add("penquito ");
        nombreArrayList.add("penquito ");
        nombreArrayList.add("penquito ");
        nombreArrayList.add("penquito ");
        nombreArrayList.add("penquito ");
        
        System.out.println(nombreArrayList.size()); //3
        
        
        
        
    }
}

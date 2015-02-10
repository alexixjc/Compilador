/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

/**
 *
 * @author Alexix
 */
public class archivos {
    
    public String abrirArchivo(String archivo) throws FileNotFoundException, IOException{

        String cadena;
        String r="";
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            r=r+cadena+"\n";
        }
        b.close();
        return r;
    } 
    
    public boolean guardar(String archivo,String contenido){
        FileWriter fw;
        try{
          fw= new FileWriter(archivo);
          fw.write(contenido);
          fw.close();
          return true;
        }catch(IOException io){

        }
            return false;
            
        }
    
    public String convertir(String entrada){
       
        
        return entrada;
        
    }
    
    
    
    }



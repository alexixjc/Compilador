/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladorfinal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class archivos {
    //Método para abrir un archivo
    public String abrirArchivo(String archivo) throws FileNotFoundException, IOException{
        //Variable que va a contener la lectura de linea
        String cadena;
        //Variable que va a contener toda la lectura del archivo
        String r="";
        //Llamamos a la clase FileReader para leer el archivo
        FileReader f = new FileReader(archivo);
        //Llamamos a la clase BufferedReader para contener la lectura del archivo
        BufferedReader b = new BufferedReader(f);
        //Iniciamos un ciclo para la lectura
        while((cadena = b.readLine())!=null) {
            //Almacenamos cada línea del archivo leída en la variable r
            r=r+cadena+"\n";
        }
        //Cerramos el método de lectura
        b.close();
        //Retornamos la variable con la lectura del archivo
        return r;
    } 
    
    //Metodo para guardar un archivo
    public boolean guardar(String archivo,String contenido){
        //Llamamos a la clase FileWriter para escribir un archivo
        FileWriter fw;
        try{
          fw= new FileWriter(archivo);
          //Llamamos al metodo write para escribir el contenido de la variable 
          fw.write(contenido);
          //Cerramos el método de escritura
          fw.close();
          //Retornamos true si se ha cumplido la operacion
          return true;
        }catch(IOException io){
            System.out.println("No se ha podido guardar el archivo");
        }
            //Retornamos false en caso de que no se haya guardado el archivo;  
            return false; 
        }
    }



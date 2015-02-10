/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladorfinal;

public class Ejecutor {
    
    
    public  void ejecutaMain(String archivo) throws Exception {
        AnalizadorSintactico an=new AnalizadorSintactico();
        an.main(archivo);
    }
    
    public static void main(String[] args) throws Exception {
        Ejecutor ej=new Ejecutor();
        ej.ejecutaMain("fichero.txt");
        
        
    }
    
}

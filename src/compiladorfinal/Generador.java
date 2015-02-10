/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladorfinal;

import java.io.File;

public class Generador {
    public static void main(String[] args) {
        generarCup();
        generarLexer();   
    }
    
    public static void generarLexer(){
        String path = System.getProperty("user.dir")+"/src/CompiladorFinal/calcular.lex";
        File file=new File(path);
        JFlex.Main.generate(file);
    }
    
    public static void generarCup(){
        String archivo = System.getProperty("user.dir")+"/src/CompiladorFinal/calcular.cup";
        String[] asintactico = {"-parser", "AnalizadorSintactico", archivo};
        try {
            java_cup.Main.main(asintactico);
            System.out.println("Generado!");

        } catch (Exception ex) {
            //Logger.getLogger(ejecutarCup.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No Generado!");

        }
    }  
}

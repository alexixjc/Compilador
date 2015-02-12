package compiladorfinal;
import java.io.File;

public class Generador {
    
    //Metodo main de ejecución de la clase Generador.java
    public static void main(String[] args) {
        //Llamada al método generarCup
        generarCup();
        //Llamada al método generarLexer
        generarLexer();   
    }
    
    //Método para generar al Analizador léxico
    public static void generarLexer(){
        //Path del archivo calcular.lex
        String path = System.getProperty("user.dir")+"/src/CompiladorFinal/calcular.lex";
        File file=new File(path);
        //LLamada al método generate de la librería JFlex para generar el código java
        JFlex.Main.generate(file);
    }
    
    //Método para generar el Analizador sintáctico
    public static void generarCup(){
        //Path del archivo calcular.cup
        String archivo = System.getProperty("user.dir")+"/src/CompiladorFinal/calcular.cup";
        //Arreglo con las opciones para crear el archivo cup
        String[] asintactico = {"-parser", "AnalizadorSintactico", archivo};
        try {
            //Llamada al método main de la librería CUP para generar el código java
            java_cup.Main.main(asintactico);
            //Presentamos el mensaje de que el archivo se ha generado 
            System.out.println("Generado!");

        } catch (Exception ex) {
            //Presentamos el mensaje en caso de que no se genere el archivo
            System.out.println("No Generado!");
        }
    }  
}

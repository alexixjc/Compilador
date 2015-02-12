
package compiladorfinal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejecutor {
    //Método que ejecuta y hace la llamada al Analizador sintáctico
    public  void ejecutaMain(String archivo) throws Exception {
        //Llamada al Analizador sintáctico
        AnalizadorSintactico an=new AnalizadorSintactico();
        //Llamada al método de ejecución del Analizador sintáctico
        //Recibe como parámetro el path del archivo .txt
        an.main(archivo);
    }
    
    //Metodo main de ejecución de la clase Ejecutor
    public static void main(String[] args) throws Exception {
        Ejecutor ej=new Ejecutor();
        //Presentamos los mensajes de inicio de ejecución
        System.out.println ("Ejecucion Iniciada");
        System.out.println ("Introduce un comando");
        //Variable que va a contener la entrada capturada por teclado
        String entradaTeclado = "";
        //Llamada a la clase scanner para obtener los datos de entrada por teclado
        Scanner entradaEscaner = new Scanner (System.in);   
        //Variable de estado para detener la ejecucion del ciclo while
        boolean estado=true;
        
        //Ciclo de ejecución del compilador
        while (estado) {  
            System.out.println("_____________________________________________");
                //Recibimos la entrada del teclado
                entradaTeclado = entradaEscaner.nextLine ();
                //Verificamos si se ingresa fin para detener el ciclo de ejecución
                if(entradaTeclado.equals("fin")){
                    //Si se ingresa fin cambia la variable de estado
                    estado=false;
                }else{
                    //Llamamos a la clase archivos
                    archivos ar=new archivos();
                    //Llamamos al método para guardar un archivo
                    ar.guardar("fichero.txt", entradaTeclado);
                    //Ejecutamos el archivo .txt que contiene nuestro código a compilar
                    ej.ejecutaMain("fichero.txt");
                } 
        }      
    }
}

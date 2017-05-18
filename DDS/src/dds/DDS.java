/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dds;

import java.io.FileNotFoundException;

/**
 *
 * @author miguel
 */
public class DDS {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) throws FileNotFoundException, Exception {
        // TODO code application logic here
//        if (args.length == 0) {
//            System.out.println("Inserta nombre de archivo\n"
//                    + "( Usage : java Analizador <inputfile> )");
//        } else {
//            for (int i = 0; i < args.length; i++) {
//                AnalizadorLexico lexico = null;
//                try {
//                    lexico = new AnalizadorLexico(new java.io.FileReader(args[i]));
//                    parser sintactico = new parser(lexico);
//                    sintactico.parse();
//                } catch (java.io.FileNotFoundException e) {
//                    System.out.println("Archivo \"" + args[i] + "\" no encontrado.");
//                } catch (java.io.IOException e) {
//                    System.out.println("Error durante la lectura del"
//                            + " archivo \"" + args[i] + "\".");
//                    e.printStackTrace();
//                } catch (Exception e) {
//                    System.out.println("Excepcion:");
//                    e.printStackTrace();
//                }
//            }
//        }
//            AnalizadorLexico lexico = new AnalizadorLexico(new java.io.FileReader("/media/miguel/0914-ABE8/Universidad/3º/Procesadores del Lenguaje/Practica grupal 3/DDS/src/dds/expresionesBooleanas.txt"));
//            parser sintactico = new parser(lexico);
//            Object resultado = sintactico.parse().value;
//            System.out.println(resultado);
//    }
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Inserta nombre de archivo\n"
                    + "( Usage : java Analizador <inputfile> )");
        } else {
            for (int i = 0; i < args.length; i++) {
                AnalizadorLexico lexico = null;
                try {
                    lexico = new AnalizadorLexico(new java.io.FileReader(args[i]));
                    parser sintactico = new parser(lexico);
		    sintactico.parse();
                    sintactico.action_obj.imprimir();
                } catch (java.io.FileNotFoundException e) {
                    System.out.println("Archivo \"" + args[i] + "\" no encontrado.");
                } catch (java.io.IOException e) {
                    System.out.println("Error durante la lectura del"
                            + " archivo \"" + args[i] + "\".");
                    e.printStackTrace();
                } catch (Exception e) {
                    System.out.println("Excepcion:");
                    e.printStackTrace();
                }
            }
        }
    }
    
}

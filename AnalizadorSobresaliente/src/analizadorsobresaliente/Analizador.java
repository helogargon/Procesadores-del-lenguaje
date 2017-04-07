/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador;

/**
 *
 * @author miguel
 */
public class Analizador {

    /**
     * @param argv the command line arguments
     */
    public static void main(String[] argv) {
//        if (argv.length == 0) {
//            System.out.println("Inserta nombre de archivo\n" + "( Usage : java Analizador <inputfile> )");
//        } else {
//            for (int i = 0; i < argv.length; i++) {
                AnalizadorLexico lexico = null;
                try {
                    lexico = new AnalizadorLexico(new java.io.FileReader("/media/miguel/0914-ABE8/Universidad/3º/Procesadores del Lenguaje/Practica grupal 2/Procesadores-del-lenguaje/Analizador/src/analizador/input4 ERRONEO.txt"));
                    parser sintactico = new parser(lexico);
                    Object resultado = sintactico.parse().value;
//                } catch (java.io.FileNotFoundException e) {
//                    System.out.println("Archivo \"" + argv[i] + "\" no encontrado.");
//                } catch (java.io.IOException e) {
//                    System.out.println("Error durante la lectura del" + " archivo \"" + argv[i] + "\".");
//                    e.printStackTrace();
                } catch (Exception e) {
                    System.out.println("Excepcion:");
                    e.printStackTrace();
                }
//            }
//        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dds;

import java.io.IOException;
import java.io.PrintWriter;

/**
 */
public class Analizador {

    public static void main(String argv[]) {
        if (argv.length == 0) {
            System.out.println("Inserta nombre de archivo\n"
                    + "( Usage : java Analizador <inputfile> )");
        } else {
            for (int i = 0; i < argv.length; i++) {
                AnalizadorLexico lexico = null;
                try {
                    lexico = new AnalizadorLexico(new java.io.FileReader(argv[i]));
                    parser sintactico = new parser(lexico);
                    sintactico.parse();
                } catch (java.io.FileNotFoundException e) {
                    System.out.println("Archivo \"" + argv[i] + "\" no encontrado.");
                } catch (java.io.IOException e) {
                    System.out.println("Error durante la lectura del"
                            + " archivo \"" + argv[i] + "\".");
                    e.printStackTrace();
                } catch (Exception e) {
                    System.out.println("Excepcion:");
                    e.printStackTrace();
                }
            }
        }
        
        /*AnalizadorLexico lexico = null;
                try {
                    lexico = new AnalizadorLexico(new java.io.FileReader("C:\\Users\\Helena\\Documents\\GitHub\\Procesadores-del-lenguaje\\DDS\\src\\dds\\inputS1.txt"));
                    parser sintactico = new parser(lexico);
                    sintactico.parse();
                } catch (java.io.FileNotFoundException e) {
                    System.out.println("Archivo \"" + "input" + "\" no encontrado.");
                } catch (java.io.IOException e) {
                    System.out.println("Error durante la lectura del"
                            + " archivo \"" + "input" + "\".");
                    e.printStackTrace();
                } catch (Exception e) {
                    System.out.println("Excepcion:");
                    e.printStackTrace();
                }*/
    }
}
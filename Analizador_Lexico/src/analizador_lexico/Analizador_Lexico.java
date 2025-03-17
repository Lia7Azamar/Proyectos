/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analizador_lexico;

import java.io.File;

/**
 *
 * @author Lia
 */
public class Analizador_Lexico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String path="C:/Users/Leo/Desktop/Analizador_Lexico/src/analizador_lexico/lexer.flex";
        generar(path);
        // TODO code application logic here
    }
    
    public static void generar(String path){
        File file= new File(path);
        JFlex.Main.generate(file);
    }
    
    
}

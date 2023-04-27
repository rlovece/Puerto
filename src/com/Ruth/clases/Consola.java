package com.Ruth.clases;
import java.util.Scanner;

public class Consola {

    private static Scanner scan = new Scanner (System.in);

    public static void escribir (Object msj){
        System.out.println(msj);
    }
    public static int leerInt (){
        return scan.nextInt();
    }


    public static float leerFloat (){
        return scan.nextFloat();
    }

    public static String leerString (){
        scan.nextLine();
        return scan.nextLine();
    }
}
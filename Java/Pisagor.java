/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pisagor;

import java.util.Scanner;

/**
 *
 * @author ebube
 */
public class Pisagor {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        double x,y,hipo;
        System.out.println("x gir:");
        x= scn.nextDouble();
        System.out.println("y gir:");
        y=scn.nextDouble();
        x=x*x;
        y=y*y;
        hipo = Math.sqrt(y+x);
        System.out.println(hipo);
    }
    
}

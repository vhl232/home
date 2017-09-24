package home_prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ZadachiMassiv {
    public static void main(String[] args) throws IOException {
//zadacha 1
       /* int [] chisla ={2,3,5,4,57,34,4,565,4,3,-6,6,-89,56,56,4,8,9,0,-5};
        int razmerMass = chisla.length;
        System.out.println(razmerMass);

        int max = 0;
        for (int i = 0; i <razmerMass ; i++) {
            if(max <chisla[i]){
                max=chisla[i];
            }
        }
        System.out.println(max);
//zadacha 2
        String [] stroki = new String[10];
        BufferedReader schitStrok = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <stroki.length ; i++) {
            stroki[i] = schitStrok.readLine();
        }
        for (int i = stroki.length; i > 0; i--) {
            System.out.print(stroki[i-1]+" ");
        }*/
//zadacha 3

       /* int [] sCHislami = new int[10];
        String soStrokami[] = new String[10];
        BufferedReader schitStrok2 = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <soStrokami.length ; i++) {
            soStrokami[i] = schitStrok2.readLine();
        }
        for (int i = 0; i <soStrokami.length ; i++) {
            sCHislami[i] = soStrokami[i].length();
            System.out.print(sCHislami[i]+" ");
        }*/
 //zadacha 4

       /* int []pervii= new int[10];
        for (int i = 0; i <pervii.length ; i++) {
            pervii[i]= i;
        }
        int [] vtoroi = new int[pervii.length];
        for (int i = pervii.length; i > 0; i--) {
                    vtoroi[0+1] = pervii[i - 1];
                    System.out.println(vtoroi[0+1]);
                }*/
//zadach 5

       /* int []bolshoi = new int[10];
        int []mal1 = new int[4];
        int [] mal2 = new int[6];
        for (int i = 0; i <bolshoi.length ; i++) {
            bolshoi [i] = i;
            System.out.print(bolshoi[i]);
        }
        System.out.println("");
        for (int i = 0; i < mal1.length ; i++) {
            mal1[i] = bolshoi[i];
            System.out.print(mal1[i]);
        }
        System.out.println("");
        for (int i = 0; i <mal2.length ; i++) {
            mal2[i] = bolshoi[mal1.length+i];
            System.out.print(mal2[i]);
        }*/

//zadacha 6


        int [] uliza = new int[15];
        for (int i = 0; i <uliza.length ; i++) {
            uliza[i] = (int)(1.3+ (Math.random()*1.5 +3));
            System.out.print(uliza[i]+" ");
        }
        int chet = 0;
        int neCHet = 0;
        for (int i = 0; i <uliza.length ; i++) {
            if(uliza[i]%2==0){
                chet++;
            }
            else neCHet++;
        }
        System.out.println("");
       if (chet>neCHet){
           System.out.println("chet  win " +chet+ " " +"neCHet loose "+neCHet);
       }
        else System.out.println("neCHet+ win"+ neCHet+ " "+"chet loose "+chet);
    }
}

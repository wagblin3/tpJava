package org.epita.tp.serie1;

import static java.lang.Math.abs;

public class ExercicesSupplementaires {

    public static long exercice1(long...entiers){

        if ( entiers.length == 0) return -1;

        long resultat = 0;
        for (long a : entiers){
            resultat += a * a;
        }
        return resultat;
        //return 0;
    }

    public static int exercice2(float[] decimaux) throws IllegalArgumentException{
        if ( decimaux == null) {
            throw new IllegalArgumentException("Calcul de la moyenne impossible sur un tableau vide");
        }
        
        if ( decimaux.length  == 0) {
            throw new IllegalArgumentException("Calcul de la moyenne impossible sur un tableau vide");
        }

        float somme = 0;
        for (float item : decimaux){
            somme+= item;
        }
        return (int) somme/decimaux.length;
    }

    public static int exercice3(long[] entiers){
        int resultPos = 0 ;
        long resultVal = entiers[0];
        for (int i = 1 ; i < entiers.length ; i++){
            if ( abs(entiers[i]) > abs(resultVal) ||
            abs(entiers[i]) == abs(resultVal) && (entiers[i]) > (resultVal) ){
                resultPos = i;
                resultVal = entiers[i];
            }
        }
        return resultPos;
    }

    public static long exercice4(int n){
        //if (n == 0) return 0;
        //if (n == 2 || n == 1) return 1;
        //return exercice4(n-1) + exercice4(n-2);
        long num = (long)((Math.pow((1 + Math.sqrt(5)), n) - Math.pow((1 - Math.sqrt(5)), n)) / (Math.pow(2,n) * Math.sqrt(5)));
        return num;
    }

    public static boolean exercice5(int age, int pysique, long revenusAnnuels){
        return true;
    }

    public static String exercice6(String numeroClair){
        return "";
    }

    public static String exercice7(String texteMinEtMaj){
        return "";
    }

    public static long exercice8(int[] entiers){
        return 0;
    }

    public static long exercice9(int[] entiersPositifs){
        return 0;
    }

    public static long exercice10(String nombre, int nombreVirgules){
        return 0;
    }

    public static boolean exercice11(int pieces10ct, int pieces20ct, int pieces50ct, int totalARendre){
        return false;
    }


}
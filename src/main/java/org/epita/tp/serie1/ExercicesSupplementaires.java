package org.epita.tp.serie1;

import java.math.BigDecimal;

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
        long resultVal = 0;
        for (int i = 0 ; i < entiers.length ; i++){
            if ( abs(entiers[i]) > abs(resultVal) ||
            abs(entiers[i]) == abs(resultVal) && (entiers[i]) > (resultVal) ){
                resultPos = i;
                resultVal = entiers[i];
            }
        }
        return resultPos;
    }

    public static long exercice4(int n){
        // METHODE RECCURSIVE MAIS LENTE ET LIMITEE !!!
        //if (n == 0) return 0;
        //if (n == 1) return 1;
        //return exercice4(n-1) + exercice4(n-2);

        // METHODE EVOLUEE ==> PROBLEME DE PRECISION ???
        //long num = (long)((Math.pow((1 + Math.sqrt(5)), n) - Math.pow((1 - Math.sqrt(5)), n)) / (Math.pow(2,n) * Math.sqrt(5)));
        //return num;
        // SOLUTION AU PROBLEME DE PRECISION ==> NE FONCTIONNE PAS
        //final BigDecimal SQRT_5 = BigDecimal.valueOf(Math.sqrt(5));
        //final BigDecimal GR = (BigDecimal.ONE.add(SQRT_5).divide(BigDecimal.valueOf(2)));
        //final BigDecimal NGR = GR.negate().add(BigDecimal.ONE);
        //return BigDecimal.ONE.divide(SQRT_5).multiply((GR.pow(n).substract(NGR.pow(n)))).toBigInteger().longValue();

        // METHODE OPTIMISEE : ITERATIVE
        long n_moins2 = 0L;
        long n_moins1 = 1L;
        long result = n;
        for (int j = 2; j<= n; j++){
            result = n_moins1 + n_moins2;
            n_moins2 = n_moins1;
            n_moins1 = result;
        }
        return result;
    }



    public static boolean exercice5(int age, int physique, long revenusAnnuels){
        if (age >= 18 && age <= 35 && physique >= 8 && revenusAnnuels >= 50000 || revenusAnnuels >= 2000000) return true;
        return false;
    }

    public static String exercice6(String numeroClair){

        if ( numeroClair.length() <= 4) return numeroClair;

        String numeroMasque = "";
        for (int i = 0 ; i < numeroClair.length()-4 ; i++) numeroMasque += "#";
        numeroMasque += numeroClair.substring(numeroClair.length()-4,numeroClair.length());
        return numeroMasque;
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
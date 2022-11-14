package org.epita.tp.serie1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.epita.tp.serie1.ExercicesSupplementaires.*;
import static org.assertj.core.api.Assertions.assertThat;

public class TestsExercicesSupplementaires {

    @Test
    public void test_exercice1_nominal(){
        long result14 = ExercicesSupplementaires.exercice1(1,2,3);
        System.out.println(result14);
        Assertions.assertThat(result14).isEqualTo(14);
        long result384 = ExercicesSupplementaires.exercice1(14,9,-9,1,4,3);
        System.out.println(result384);
        Assertions.assertThat(result384).isEqualTo(384);
    }

    @Test
    public void test_exercice1_return_moinsun_when_empty_array(){
        long resultMoins1 = ExercicesSupplementaires.exercice1();
        System.out.println(resultMoins1);
        Assertions.assertThat(resultMoins1).isEqualTo(-1);
    }

    @Test
    public void test_exercice2_nominal(){
        float[] firstTable = {10f,20f};
        int resultExo15 = ExercicesSupplementaires.exercice2(firstTable);
        System.out.println(resultExo15);
        Assertions.assertThat(resultExo15).isEqualTo(15);

        float[] secondTable = {11f,12f,13f,14f,15f,16f};
        int resultExo13 = ExercicesSupplementaires.exercice2(secondTable);
        System.out.println(resultExo13);
        Assertions.assertThat(resultExo13).isEqualTo(13);

        float[] thirdTable = {11.5f,12.5f,13.5f,14.5f,15.5f,16.5f};
        int resultExo14 = ExercicesSupplementaires.exercice2(thirdTable);
        System.out.println(resultExo14);
        Assertions.assertThat(resultExo14).isEqualTo(14);
    }

    @Test
    @DisplayName("Doit retourner une exception lorsque le tableau est vide")
    public void test_exercice2_return_exception_when_empty(){

        float[] fourthTable = {};

        org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> {
            int resultExoExc = ExercicesSupplementaires.exercice2(fourthTable);
            System.out.println(resultExoExc);
        });
    }

    @Test
    @DisplayName("Doit retourner une exception lorsque le tableau est null")
    public void test_exercice2_return_exception_when_null_table(){

        float[] fifthTable = null;

        org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> {
            int resultExoExc = ExercicesSupplementaires.exercice2(fifthTable);
            System.out.println(resultExoExc);
        });
    }

    @Test
    @DisplayName("Soit un tableau d'entiers relatifs, trouvez l'index de l'élément le plus éloigné de zéro.")
    public void test_exercice3_nominal(){
        long[] exo3table1 = {1, 2, 10, -15, 3};
        int exo3result1 = ExercicesSupplementaires.exercice3(exo3table1);
        System.out.println(exo3result1);
        Assertions.assertThat(exo3result1).isEqualTo(3);
    }

    @Test
    @DisplayName("S'il y a égalité, entre deux nombres, l'un positif, le second négatif, prenez le positif.")
    public void test_exercice3_return_the_positive_when_egality(){
        long[] exo3table2 = {-10, 10, 3, -5};
        int exo3result2 = ExercicesSupplementaires.exercice3(exo3table2);
        System.out.println(exo3result2);
        Assertions.assertThat(exo3result2).isEqualTo(1);
    }

    @Test
    @DisplayName("S'il y a égalité entre deux nombres positifs, prenez le premier index.")
    public void test_exercice3_return_the_first_index_when_egality(){
        long[] exo3table3 = {-10, 10, 3, 10};
        int exo3result3 = ExercicesSupplementaires.exercice3(exo3table3);
        System.out.println(exo3result3);
        Assertions.assertThat(exo3result3).isEqualTo(1);
    }

    @Test
    @DisplayName("Ecrire le code pour calculer le n-ième élément de la suite de Fibonacci.f(n) = f(n-1) + f(n-2)" +
            "f(2) = f(0)+f(1) = 1 (f(1) = 1 & f(0) = 0)")
    public void test_exercice4_f2(){
        long resultF2 = ExercicesSupplementaires.exercice4(2);
        System.out.println(resultF2);
        Assertions.assertThat(resultF2).isEqualTo(1);
    }

    @Test
    @DisplayName("Ecrire le code pour calculer le n-ième élément de la suite de Fibonacci.f(n) = f(n-1) + f(n-2)" +
            "f(3) = f(1)+f(2) = 2")
    public void test_exercice4_f3(){
        long resultF3 = ExercicesSupplementaires.exercice4(3);
        System.out.println(resultF3);
        Assertions.assertThat(resultF3).isEqualTo(2);
    }

    @Test
    @DisplayName("Ecrire le code pour calculer le n-ième élément de la suite de Fibonacci.f(n) = f(n-1) + f(n-2)" +
            "f(10) = f(9)+f(8) = 55")
    public void test_exercice4_f10(){
        long resultF10 = ExercicesSupplementaires.exercice4(10);
        System.out.println(resultF10);
        Assertions.assertThat(resultF10).isEqualTo(55);
    }

    @Test
    @DisplayName("Ecrire le code pour calculer le n-ième élément de la suite de Fibonacci.f(n) = f(n-1) + f(n-2)" +
            "f(16) = 987")
    public void test_exercice4_f16(){
        long resultF16 = ExercicesSupplementaires.exercice4(16);
        System.out.println(resultF16);
        Assertions.assertThat(resultF16).isEqualTo(987);
    }

    @Test
    @DisplayName("Ecrire le code pour calculer le n-ième élément de la suite de Fibonacci.f(n) = f(n-1) + f(n-2)" +
            "f(80) = ??")
    public void test_exercice4_f80(){
        long resultF80 = ExercicesSupplementaires.exercice4(80);
        System.out.println(resultF80);
        Assertions.assertThat(resultF80).isEqualTo( 23416728348467685L);
    }

    @Test
    @DisplayName("Jessica-Marie-Sue-Hellen est une femme...difficile. Elle n'accepte de sortir qu'avec des hommes selon les critères suivants :  \n" +
            "* Âge : Il doit avoir entre 18 et 35 ans\n" +
            "* Physique : Au minimum 8/10\n" +
            "* Revenus annuels : Au minimum 50 000€/an, mais si c'est au delà de 1 000 000€/an, on oublie le reste des critères !\n" +
            "Ecrire une méthode permettant de modéliser la chance d'un homme à sortir avec Jessica-Marie-Sue-Helen")
    public void test_exercice5_21_9_60000_true(){
        boolean resultExo5Test1 = ExercicesSupplementaires.exercice5(21, 9, 60000);
        System.out.println(resultExo5Test1);
        Assertions.assertThat(resultExo5Test1).isEqualTo(true);
    }
    
    @Test
    @DisplayName("21, 7, 90000 -> false")
    public void test_exercice5_21_7_90000_false(){
        boolean resultExo5Test2 = ExercicesSupplementaires.exercice5(21, 7, 90000);
        System.out.println(resultExo5Test2);
        Assertions.assertThat(resultExo5Test2).isEqualTo(false);
    }

    @Test
    @DisplayName("90, 2, 2000000 -> true")
    public void test_exercice5_90_2_2000000_true(){
        boolean resultExo5Test3 = ExercicesSupplementaires.exercice5(90, 2, 2000000);
        System.out.println(resultExo5Test3);
        Assertions.assertThat(resultExo5Test3).isEqualTo(true);
    }

    @Test
    @DisplayName("En général, lorsque vous payer, vous recevez un ticket de carte bleue avec le numéro de votre carte masquée. " +
            "Seuls restent les 4 derniers numéros, le reste étant remplacé par des #.\n" +
            "    Le but de cet exercice est d'écrire une méthode permettant de " +
            "remplacer tous les caractères d'une chaîne de caractère par des # (sauf les 4 derniers)." +
            "123456789012 -> ########9012")
    public void test_exercice6_1(){
        String resultExo6Test1 = ExercicesSupplementaires.exercice6("123456789012");
        System.out.println(resultExo6Test1);
        Assertions.assertThat(resultExo6Test1).isEqualTo("########9012");
    }

    @Test
    @DisplayName("1234 5678 9012 -> ##########9012")
    public void test_exercice6_2(){
        String resultExo6Test2 = ExercicesSupplementaires.exercice6("1234 5678 9012");
        System.out.println(resultExo6Test2);
        Assertions.assertThat(resultExo6Test2).isEqualTo("##########9012");
    }

    @Test
    @DisplayName("MomNomEstPersonne -> #############onne")
    public void test_exercice6_3(){
        String resultExo6Test3 = ExercicesSupplementaires.exercice6("MomNomEstPersonne");
        System.out.println(resultExo6Test3);
        Assertions.assertThat(resultExo6Test3).isEqualTo("#############onne");
    }

    @Test
    @DisplayName("42 -> 42")
    public void test_exercice6_4(){
        String resultExo6Test4 = ExercicesSupplementaires.exercice6("42");
        System.out.println(resultExo6Test4);
        Assertions.assertThat(resultExo6Test4).isEqualTo("42");
    }

    @Test
    @DisplayName("Le but est de prendre un texte et de la convertir soit :  \n" +
            "- Tout en majuscules si le texte comprend une majorité de majuscules.  \n" +
            "- Tout en minuscules si le texte comprend une majorité de minuscules.  \n" +
            "- En cas d'égalité, on ne convertira rien !  \n" +
            "\"Toto\" -> \"toto\"\n" +
            "\"TITi\" -> \"TITI\"\n" +
            "\"taTA\" -> \"taTA\" ")
    public void test_exercice7(){
        String resultExo7Test1 = ExercicesSupplementaires.exercice7("Toto");
        System.out.println(resultExo7Test1);


    }

    @Test
    public void test_exercice8(){

    }

    @Test
    public void test_exercice9(){

    }

    @Test
    public void test_exercice10(){

    }

    @Test
    public void test_exercice11(){

    }
    
}

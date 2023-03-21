package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        zad1();

        zad2();
    }

    private static void zad2() {
        System.out.println(WordsHelper.countDistinctCharacters("aaabbbccc"));
        System.out.println(WordsHelper.countDistinctCharactersV2("aaabbbccc"));
    }

    private static void zad1() {
        List<Double> lista = List.of(3.0d, 2.0d, 5.0d, 4.3d, 4.5d, 4.0d, 3.0d);
        System.out.println(lista);
        System.out.println(Grades.countNumberOf5(lista));
        System.out.println(Grades.getTheBestGrades(lista));
        //System.out.println(grades.checkGrade(lista,3.0d));
        //System.out.println(grades.checkGrade(lista,2.2d));
        System.out.println(Grades.getGradesSet());
        System.out.println(Grades.showUniqueGrades(lista));
    }
}
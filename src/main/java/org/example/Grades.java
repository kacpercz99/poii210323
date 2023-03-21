package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Grades {
    public static int countNumberOf5(List<Double> gradeList){
        return (int) gradeList.stream().filter(e -> e.equals(5.0d)).count();
    }

    public static List<Double> getTheBestGrades(List<Double> gradeList) {
        return gradeList.stream().filter(e -> e >= 4.0d).collect(Collectors.toList());
    }

//    public boolean checkGrade(List<Double> gradeList, Double gradeToFind) {
//        return gradeList.contains(gradeToFind);
//    }

    public static Set<Double> getGradesSet() {
        return Set.of(2.0d, 3.0d, 3.5d, 4.0d, 4.5d, 5.0d);
    }

    public static Set<Double> showUniqueGrades(List<Double> gradeList) {
        return new HashSet<>(gradeList);
    }
}

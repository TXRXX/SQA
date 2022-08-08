package test;

import main.GradeEnum;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class testGradeEnum {

    GradeEnum gradeEnum;


    @ParameterizedTest
    @CsvSource({
            "30,30,40",
            "25,25, 0",
            "1, 1, 1 ",
            "20,30,20",
            "30,30, 0"
    }) void testTS001 (int secA, int secB, int secFinal) {
        gradeEnum = new GradeEnum(secA, secB, secFinal);
        String show = gradeEnum.classify().getName();
        System.out.println(show);
    }

    @ParameterizedTest
    @CsvSource({
            "-30,30,40",
            "-30, 0, 0",
            "10,-10,10",
            "40, 30, 30",
            "50, 50, 50,"
    }) void testTS002 (int secA, int secB, int secFinal) {
        gradeEnum = new GradeEnum(secA, secB, secFinal);
        String show = gradeEnum.classify().getName();
        System.out.println(show);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"resources/Data_TS003.csv"})
    void testTS003 (int secA, int secB, int secFinal) {
        gradeEnum = new GradeEnum(secA, secB, secFinal);
        String show = gradeEnum.classify().getName();
        System.out.println(show);
    }
}

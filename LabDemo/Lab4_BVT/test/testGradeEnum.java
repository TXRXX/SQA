package test;

import main.GradeEnum;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class testGradeEnum {

    GradeEnum gradeEnum;


    @ParameterizedTest
    @CsvSource({
            "0	,15	,20",
            "1	,15	,20",
            "15	,15	,20",
            "29	,15	,20",
            "30	,15	,20",
            "15	,0	,20",
            "15	,1	,20",
            "15	,29	,20",
            "15	,30	,20",
            "15	,15	,0",
            "15	,15	,1",
            "15	,15	,39",
            "15	,15	,40",
    }) void testTS001 (int secA, int secB, int secFinal) {
        gradeEnum = new GradeEnum(secA, secB, secFinal);
        String show = gradeEnum.classify().getName();
        System.out.println(show);
    }

    @ParameterizedTest
    @CsvSource({
            "0,15,20",
            "1,15,20",
            "15,15,20",
            "29,15,20",
            "30,15,20",
            "15,0,20",
            "15,1,20",
            "15,29,20",
            "15,30,20",
            "15,15,0",
            "15,15,1",
            "15,15,39",
            "15,15,40",
            "-1,15,20",
            "15,-1,20",
            "15,15,-1",
            "31,15,15",
            "15,31,15",
            "15,15,41"
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

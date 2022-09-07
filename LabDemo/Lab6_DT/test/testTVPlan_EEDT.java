package test;

import main.TVPlan;
import main.TVPlan.TVPackage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class testTVPlan_EEDT {
    @ParameterizedTest
    @MethodSource("testCaseBasic")
    @DisplayName("testCase_Basic")
    void testCaseBasic(boolean fam, boolean inter, boolean yearly) {
        TVPlan tvPlan = new TVPlan(fam, inter, yearly);
        TVPackage pack = TVPackage.BASIC;
        double total = tvPlan.pricePerMonth(pack);
        System.out.println("totalPrice (Basic): "+ "Fam:"+fam + ", Inter:"+ inter  + ", Yearly:"+ yearly + "   ==> " + total);
    }

    static Stream<Arguments> testCaseBasic() {
        return Stream.of(
                Arguments.of(true, false, false),
                Arguments.of(false, true, false),
                Arguments.of(false, false, true),
                Arguments.of(true, true, false),
                Arguments.of(true, false, true),
                Arguments.of(false, true, true),
                Arguments.of(true, true, true),
                Arguments.of(false, false, false));
    }

    @ParameterizedTest
    @MethodSource("testCaseStandard")
    @DisplayName("testCase_Standard")
    void testCaseStandard(boolean fam, boolean inter, boolean yearly) {
        TVPlan tvPlan = new TVPlan(fam, inter, yearly);
        TVPackage pack = TVPackage.STANDARD;
        double total = tvPlan.pricePerMonth(pack);
        System.out.println("totalPrice (Standard): "+ "Fam:"+fam + ", Inter:"+ inter  + ", Yearly:"+ yearly + "   ==> " + total);
    }

    static Stream<Arguments> testCaseStandard() {
        return Stream.of(
                Arguments.of(true, false, false),
                Arguments.of(false, true, false),
                Arguments.of(false, false, true),
                Arguments.of(true, true, false),
                Arguments.of(true, false, true),
                Arguments.of(false, true, true),
                Arguments.of(true, true, true),
                Arguments.of(false, false, false));
    }

    @ParameterizedTest
    @MethodSource("testCasePremium")
    @DisplayName("testCase_Premium")
    void testCasePremium(boolean fam, boolean inter, boolean yearly) {
        TVPlan tvPlan = new TVPlan(fam, inter, yearly);
        TVPackage pack = TVPackage.PREMIUM;
        double total = tvPlan.pricePerMonth(pack);
        System.out.println("totalPrice (Premium): "+ "Fam:"+fam + ", Inter:"+ inter  + ", Yearly:"+ yearly + "   ==> " + total);
    }

    static Stream<Arguments> testCasePremium() {
        return Stream.of(
                Arguments.of(true, false, false),
                Arguments.of(false, true, false),
                Arguments.of(false, false, true),
                Arguments.of(true, true, false),
                Arguments.of(true, false, true),
                Arguments.of(false, true, true),
                Arguments.of(true, true, true),
                Arguments.of(false, false, false));
    }
}

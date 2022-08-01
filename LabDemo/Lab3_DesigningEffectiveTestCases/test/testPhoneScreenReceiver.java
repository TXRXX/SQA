package test;

import main.PhoneScreenReceiver;
import org.junit.jupiter.api.*;

public class testPhoneScreenReceiver {
    PhoneScreenReceiver phoneScreenReceiver;

    @BeforeEach
    void setUp(TestInfo testInfo, RepetitionInfo repetitionInfo){
        int currentReptition = repetitionInfo.getCurrentRepetition();
        int totalReptition = repetitionInfo.getTotalRepetitions();

        phoneScreenReceiver = new PhoneScreenReceiver();
    }

    @RepeatedTest(value = 3, name = RepeatedTest.LONG_DISPLAY_NAME)
    @DisplayName("TC01")
    void testTC01(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getTestMethod().get().getName() + " : " + repetitionInfo.getCurrentRepetition() + " of " + repetitionInfo.getTotalRepetitions());
        System.out.println("noAttemp = 0 && isCorrectPwd = true --> Expected Result = Unlocked");
        phoneScreenReceiver.onReceive(1, true);
    }

    @RepeatedTest(value = 3, name = RepeatedTest.LONG_DISPLAY_NAME)
    @DisplayName("TC02")
    void testTC02(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getTestMethod().get().getName() + " : " + repetitionInfo.getCurrentRepetition() + " of " + repetitionInfo.getTotalRepetitions());
        System.out.println("noAttemp = 5 && isCorrectPwd = true --> Expected Result = Unlocked");
        phoneScreenReceiver.onReceive(5, true);
    }

    @RepeatedTest(value = 3, name = RepeatedTest.LONG_DISPLAY_NAME)
    @DisplayName("TC03")
    void testTC03(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getTestMethod().get().getName() + " : " + repetitionInfo.getCurrentRepetition() + " of " + repetitionInfo.getTotalRepetitions());
        System.out.println("noAttemp = 10 && isCorrectPwd = true --> Expected Result = Unlocked");
        phoneScreenReceiver.onReceive(10, true);
    }

    @RepeatedTest(value = 3, name = RepeatedTest.LONG_DISPLAY_NAME)
    @DisplayName("TC04")
    void testTC04(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getTestMethod().get().getName() + " : " + repetitionInfo.getCurrentRepetition() + " of " + repetitionInfo.getTotalRepetitions());
        System.out.println("noAttemp = 1 && isCorrectPwd = false --> Expected Result = Locked");
        phoneScreenReceiver.onReceive(1, false);
    }

    @RepeatedTest(value = 3, name = RepeatedTest.LONG_DISPLAY_NAME)
    @DisplayName("TC05")
    void testTC05(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getTestMethod().get().getName() + " : " + repetitionInfo.getCurrentRepetition() + " of " + repetitionInfo.getTotalRepetitions());
        System.out.println("noAttemp = 5 && isCorrectPwd = false --> Expected Result = Locked");
        phoneScreenReceiver.onReceive(5, false);
    }

    @RepeatedTest(value = 3, name = RepeatedTest.LONG_DISPLAY_NAME)
    @DisplayName("TC06")
    void testTC06(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getTestMethod().get().getName() + " : " + repetitionInfo.getCurrentRepetition() + " of " + repetitionInfo.getTotalRepetitions());
        System.out.println("noAttemp = 6 && isCorrectPwd = false --> Expected Result = Locked");
        phoneScreenReceiver.onReceive(10, false);
    }

    @AfterEach
    void doneFunc() {
        System.out.println("========== DONE ==========");
    }
}

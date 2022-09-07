package test;

import main.Commission;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class testCommission {
    Commission commission;

    @ParameterizedTest
    @MethodSource("dataSource")
    @DisplayName("Commission TestCase #1 - #7")
    void testCommission(int lock,int stock,int barrel) {
        System.out.println(lock + "," + stock + "," + barrel);
        commission = new Commission();
        Double comPrice = commission.checkCommission(lock, stock, barrel);
        System.out.println(comPrice);
        System.out.println();
    }
    static Stream<Arguments> dataSource(){
        return Stream.of(
                Arguments.of(0,40,45),
                Arguments.of(35,0,45),
                Arguments.of(35,40,0),
                Arguments.of(71,40,45),
                Arguments.of(35,81,45),
                Arguments.of(35,40,91),
                Arguments.of(71,81,91)
        );
    }
}

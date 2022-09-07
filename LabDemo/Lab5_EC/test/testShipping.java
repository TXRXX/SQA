package test;

import main.ShippingPackage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class testShipping {
    ShippingPackage shippingPackage;
    @ParameterizedTest
    @MethodSource("dataSource")
    @DisplayName("Test shippingPackage")
    void test_Commission(int d1,int d2,int d3) {
        System.out.println(d1 +","+ d2 + "," +d3);
        shippingPackage = new ShippingPackage();
        int sum = shippingPackage.calculate(d1,d2,d3);
        System.out.println(sum);
        System.out.println();
    }
    static Stream<Arguments> dataSource(){
        return Stream.of(
                Arguments.of(0,1,5),
                Arguments.of(1,0,1),
                Arguments.of(0,2,10),
                Arguments.of(1,-2,11),
                Arguments.of(-1,1,5),
                Arguments.of(1,1,-6),
                Arguments.of(1,0,1),
                Arguments.of(0,1,1),
                Arguments.of(1,1,0)
        );
    }

}

package ParameterTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ParameterTests {

    @ParameterizedTest
    @CsvFileSource(resources = "/testData.csv", useHeadersInDisplayName = true)
    public void csvFileTestSource(String Login, String Password, String Role) {

        Assertions.assertNotNull(Password);
        Assertions.assertFalse(Login.isBlank());
        Assertions.assertNotNull(Role);
        String file = (Login + " " + Password + " " + Role);
        System.out.println(file);
    }
}
package io.soeasy.demo.testng;

import org.testng.annotations.DataProvider;

public class StaticProvider {
    @DataProvider(name = "create")
    public static Object[][] createData() {
        return new Object[][]{
                new Object[]{1, "S-ABC"},
                new Object[]{2, "S-DEF"}
        };
    }
}

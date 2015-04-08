package io.soeasy.demo.testng;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class FooTest {

//    private Foo foo;
//    @BeforeMethod
//    public void setUp() throws Exception {
//        foo = new Foo();
//    }
//
//    @AfterMethod
//    public void tearDown() throws Exception {
//        foo = null;
//    }
    private static Foo foo;

    @BeforeClass
    public void setUp() throws Exception {
        foo = new Foo();
    }

    @AfterClass
    public void tearDown() throws Exception {
        foo = null;
    }

    @Test
    public void testFoo() throws Exception {
        assertEquals(foo.foo(), "foo");
    }

    @Test(dataProvider = "create")
    public void testDataProvider(int i, String s) throws Exception {
        System.out.printf("%d - %s%n", i, s);
    }

    @Test(dataProvider = "create", dataProviderClass = StaticProvider.class)
    public void testStaticDataProvider(int i, String s) throws Exception {
        System.out.printf("%d - %s%n", i, s);
    }

    @DataProvider(name = "create")
    public Object[][] createData() {
        return new Object[][]{
                new Object[]{1, "ABC"},
                new Object[]{2, "DEF"}
        };
    }

}
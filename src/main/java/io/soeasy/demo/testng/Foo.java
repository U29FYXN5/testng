package io.soeasy.demo.testng;

public class Foo {
    public String foo() {
        return "foo";
    }

    public String fo() {
        return "fo";
    }

    public void verifyData(int i, String s) {
        System.out.printf("%d - %s", i, s);
    }
}

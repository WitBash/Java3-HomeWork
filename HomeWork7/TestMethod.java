package com.bashko.java3.HomeWork7;

public class TestMethod {

    @Test(priority = 1)
    public void method1() {
        System.out.println("Running test method1");
    }

    @Test(priority = 4)
    public void method4() {
        System.out.println("Running test method4");
    }

    @Test(priority = 3)
    public void method3() {
        System.out.println("Running test method3");
    }

    @Test(priority = 2)
    public void method2() {
        System.out.println("Running test method2");
    }

    @AfterSuite
    public void afterSuiteMethod() {
        System.out.println("Running afterSuiteMethod");
    }

    @BeforeSuite
    public void beforeSuiteMethod() {
        System.out.println("Running beforeSuiteMethod");
    }
}

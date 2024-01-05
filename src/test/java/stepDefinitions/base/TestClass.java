package stepDefinitions.base;

import io.cucumber.java.BeforeAll;



public class TestClass {

    public TestClass()
    {
        System.out.println("Test class constructor is called");
    }
    @BeforeAll
    public void test()
    {
        System.out.println("Before All test method is called");
    }

}

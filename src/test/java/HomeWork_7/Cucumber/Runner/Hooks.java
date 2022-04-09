package HomeWork_7.Cucumber.Runner;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    @Before
    public void prepareData() {
        System.out.println("Hello!!!");
    }

    @After
    public void clearData() {
        System.out.println("By-by!!!");
    }

}

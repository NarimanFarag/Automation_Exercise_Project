package Tests;

import Pages.TestCasesPage;
import org.testng.annotations.Test;

public class TestCasesTest extends BaseTest
{

    @Test
    public void testNavigateToTestCases()
    {
        TestCasesPage testCasesPage= new TestCasesPage(chromeDriver);

        testCasesPage.checkHomeVisibility();
        testCasesPage.clickOnTestCases();
        testCasesPage.checkHTestCasesVisibility();

    }
}

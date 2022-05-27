package Task14;

import Task11.Driver;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class AllureListener implements ITestListener {
    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        // getScreenshot();
    }

    @Attachment(value="Page screen", type="image/png")
    public byte[] getScreenshot(){
        return ((TakesScreenshot) Driver.getInstance())
                .getScreenshotAs(OutputType.BYTES);
    }

    @Attachment(value="{0}", type="text/plain")
    public String getDom(){
        return Driver.getInstance().getPageSource();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        getScreenshot();
        getDom();
    }
}

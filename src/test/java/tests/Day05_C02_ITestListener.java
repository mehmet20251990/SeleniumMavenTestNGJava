package tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class Day05_C02_ITestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart method called");
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess method called");
    }
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure method called");
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped method called");
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("onTestFailedButWithinSuccessPercentage method called");
    }
    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("onTestFailedWithTimeout method called");
    }
    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStart method called");
    }
    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish method called");
    }
}

package com.amul.testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test case started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test case success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test case failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test case skipped");

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("onTestFailedWithTimeout");

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("test case finished");

	}

}

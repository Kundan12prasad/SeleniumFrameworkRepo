package listener;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class TestNGISuiteListener implements ISuiteListener {

	public void onStart(ISuite suite) {
		System.out.println("I am starting with Suites");
	}

	public void onFinish(ISuite suite) {
		System.out.println("I am ending with Suites");
	}

}

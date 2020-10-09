package TestNGPACK;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestRunner {

	public static void main(String[] args) {
		TestNG runner = new TestNG();
		List<String> suites = new ArrayList<String>();
		// Add Suite Path
		suites.add("D:\\Java\\Git_Repository\\TestProject\\TestNG_Sample\\SuitA.xml");
		runner.setTestSuites(suites);
		runner.run();

	}

}

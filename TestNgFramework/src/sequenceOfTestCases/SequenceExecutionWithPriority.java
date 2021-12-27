package sequenceOfTestCases;

import org.testng.annotations.Test;

public class SequenceExecutionWithPriority {

	
	@Test(priority=1)
	public void testcase1()
	{
		System.out.println("test1 running");
	}
	@Test(priority=2)
	public void atestcase2()
	{
		System.out.println("test2 running");
	}
}

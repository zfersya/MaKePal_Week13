package src.test.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import src.main.java.Counter;

public class CounterTest {

	@Test
	public void testReset() {
		Counter testCounter = new Counter();
		
		for(int i = 0; i <10; i++) {
			testCounter.increment();
		}
		
		testCounter.reset();
		
		assertEquals(testCounter.getCount(), 0);
	}

	@Test
	public void testIncrement() {
		Counter testCounter = new Counter();
		
		for(int i = 1; i <10; i++) {
			testCounter.increment();
			assertEquals(testCounter.getCount(), i);
		}
	}

	@Test
	public void testDecrement() {
		Counter testCounter = new Counter();
		
		for(int i = 1; i <10; i++) {
			testCounter.decrement();
			assertEquals(testCounter.getCount(), i * -1);
		}
	}

}

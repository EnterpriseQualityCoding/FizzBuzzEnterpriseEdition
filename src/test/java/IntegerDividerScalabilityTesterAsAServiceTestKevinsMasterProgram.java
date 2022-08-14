import static org.junit.Assert.assertEquals;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.math.arithmetics.IntegerDivider;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.doublecomparator.FirstIsLargerThanSecondDoubleComparator;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.comparators.doublecomparator.FirstIsSmallerThanSecondDoubleComparator;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Tests to ensure redundancy and scalability of IntegerDivider architecture as a service...platform...yet
 */
public class IntegerDividerScalabilityTesterAsAServiceTestKevinsMasterProgram {

	private PrintStream out;

	/**
	 * @throws IOException
	 * @return void
	 */
	@Test
	public void testIntegerDivisionOrElse() {
        FirstIsSmallerThanSecondDoubleComparator firstIsSmallerThanSecondDoubleComparator = new FirstIsSmallerThanSecondDoubleComparator();
        FirstIsLargerThanSecondDoubleComparator firstIsLargerThanSecondDoubleComparator = new FirstIsLargerThanSecondDoubleComparator();

        IntegerDivider intDivider = new IntegerDivider(firstIsLargerThanSecondDoubleComparator,  firstIsSmallerThanSecondDoubleComparator);
        
        assertEquals(intDivider.divide(TestConstants.INT_10, TestConstants.INT_3), TestConstants.TEST_RESULT_INT_3);
        assertEquals(intDivider.divide(TestConstants.INT_7, TestConstants.INT_4), TestConstants.TEST_RESULT_INT_1);
        assertEquals(intDivider.divide(TestConstants.INT_10, TestConstants.NEGATIVE_INTEGER_3), TestConstants.TEST_RESULT_NEGATIVE_INT_3);
        assertEquals(intDivider.divide(TestConstants.NEGATIVE_INTEGER_16, TestConstants.INT_3), TestConstants.TEST_RESULT_NEGATIVE_INT_5);

	}

}

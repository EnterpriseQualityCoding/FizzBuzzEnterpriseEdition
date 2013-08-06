import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.math.arithmetics.NumberIsMultipleOfAnotherNumberVerifier;
import org.junit.Test;

import java.io.IOException;
import static org.junit.Assert.assertEquals;

public class TheNumberIsMultipleOfAnotherNumberVerifierTest {

	@Test
	public void three_should_be_recognized_as_multiple_of_nine() throws IOException {
        // invoke
        boolean tested= NumberIsMultipleOfAnotherNumberVerifier.numberIsMultipleOfAnotherNumber(9,3);

        // check
        assertEquals(tested,true);
    }

    @Test
    public void five_should_not_be_recognized_as_multiple_of_nine() throws IOException {
        // invoke
        boolean tested= NumberIsMultipleOfAnotherNumberVerifier.numberIsMultipleOfAnotherNumber(9,5);

        // check
        assertEquals(tested,false);
    }

    @Test
    public void twentythree_should_not_be_recognized_as_multiple_of_fortytwo() throws IOException {
        // invoke
        boolean tested= NumberIsMultipleOfAnotherNumberVerifier.numberIsMultipleOfAnotherNumber(42,23);

        // check
        assertEquals(tested,false);
    }


    @Test
    public void one_should_be_recognized_as_multiple_of_three() throws IOException {
        // invoke
        boolean tested= NumberIsMultipleOfAnotherNumberVerifier.numberIsMultipleOfAnotherNumber(3,1);

        // check
        assertEquals(tested,true);
    }

}

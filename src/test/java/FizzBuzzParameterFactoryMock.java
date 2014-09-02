import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzParameterFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.parameters.FizzBuzzLowerLimitParameter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.parameters.FizzBuzzUpperLimitParameter;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.parameters.FizzBuzzStepParameter;

public class FizzBuzzParameterFactoryMock implements FizzBuzzParameterFactory {

    public FizzBuzzParameterFactoryMock(final int initialValue, final int finalValue, final int stepValue) {
        lowerLimitParameter = new FizzBuzzLowerLimitParameter() {
            @Override
            public int ObtainLowerLimitValue() {
                return initialValue;
            }
        };
        upperLimitParameter = new FizzBuzzUpperLimitParameter() {
            @Override
            public int ObtainUpperLimitValue() {
                return finalValue;
            }
        };
        stepParameter = new FizzBuzzStepParameter() {
            @Override
            public int ObtainStepValue() {
                return stepValue;
            }
        };
    }

    @Override
    public FizzBuzzLowerLimitParameter createLowerLimitParameter() {
        return lowerLimitParameter;
    }

    @Override
    public FizzBuzzUpperLimitParameter createUpperLimitParameter() {
        return upperLimitParameter;
    }

    @Override
    public FizzBuzzStepParameter createStepParameter() {
        return stepParameter;
    }

    private final FizzBuzzLowerLimitParameter lowerLimitParameter;
    private final FizzBuzzUpperLimitParameter upperLimitParameter;
    private final FizzBuzzStepParameter stepParameter;
}

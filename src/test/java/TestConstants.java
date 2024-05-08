/**
 * Constants for FizzBuzz tests
 */
public class TestConstants {

	private TestConstants() {
		super();
	}

	static final String _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14_FIZZ_BUZZ_16 = "1\n2\n%1$s\n4\n%2$s\n%1$s\n7\n8\n%1$s\n%2$s\n11\n%1$s\n13\n14\n%1$s%2$s\n16\n";
	static final String _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14_FIZZ_BUZZ = "1\n2\n%1$s\n4\n%2$s\n%1$s\n7\n8\n%1$s\n%2$s\n11\n%1$s\n13\n14\n%1$s%2$s\n";
	static final String _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14 = "1\n2\n%1$s\n4\n%2$s\n%1$s\n7\n8\n%1$s\n%2$s\n11\n%1$s\n13\n14\n";
	static final String _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13 = "1\n2\n%1$s\n4\n%2$s\n%1$s\n7\n8\n%1$s\n%2$s\n11\n%1$s\n13\n";
	static final String _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ = "1\n2\n%1$s\n4\n%2$s\n%1$s\n7\n8\n%1$s\n%2$s\n11\n%1$s\n";
	static final String _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11 = "1\n2\n%1$s\n4\n%2$s\n%1$s\n7\n8\n%1$s\n%2$s\n11\n";
	static final String _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ = "1\n2\n%1$s\n4\n%2$s\n%1$s\n7\n8\n%1$s\n%2$s\n";
	static final String _1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ = "1\n2\n%1$s\n4\n%2$s\n%1$s\n7\n8\n%1$s\n";
	static final String _1_2_FIZZ_4_BUZZ_FIZZ_7_8 = "1\n2\n%1$s\n4\n%2$s\n%1$s\n7\n8\n";
	static final String _1_2_FIZZ_4_BUZZ_FIZZ_7 = "1\n2\n%1$s\n4\n%2$s\n%1$s\n7\n";
	static final String _1_2_FIZZ_4_BUZZ_FIZZ = "1\n2\n%1$s\n4\n%2$s\n%1$s\n";
	static final String _1_2_FIZZ_4_BUZZ = "1\n2\n%1$s\n4\n%2$s\n";
	static final String _1_2_FIZZ_4 = "1\n2\n%1$s\n4\n";
	static final String _1_2_FIZZ = "1\n2\n%1$s\n";
	static final String _1_2_ = "1\n2\n";
	static final String _1_ = "1\n";

	static final String LINE_SEPARATOR = "line.separator";
	static final String ASSETS_VALUES_TEST_NUMBERS_PROPERTIES = "assets/values/test-numbers.properties";
	static final String STANDARD_FIZZ_BUZZ = "standardFizzBuzz";
	static final String SPRING_XML = "spring.xml";

	static final int INT_1;
	static final int INT_2;
	static final int INT_3;
	static final int INT_4;
	static final int INT_5;
	static final int INT_6;
	static final int INT_7;
	static final int INT_8;
	static final int INT_9;
	static final int INT_10;
	static final int INT_11;
	static final int INT_12;
	static final int INT_13;
	static final int INT_14;
	static final int INT_15;
	static final int INT_16;

	static {
		InputStream inputStream = TestConstants.class.getClassLoader().getResourceAsStream(ASSETS_VALUES_TEST_NUMBERS_PROPERTIES);
		Properties properties = new Properties();
		properties.load(inputStream);
		INT_1 = Integer.parseInt(properties.get("int_1"));
		INT_2 = Integer.parseInt(properties.get("int_2"));
		INT_3 = Integer.parseInt(properties.get("int_3"));
		INT_4 = Integer.parseInt(properties.get("int_4"));
		INT_5 = Integer.parseInt(properties.get("int_5"));
		INT_6 = Integer.parseInt(properties.get("int_6"));
		INT_7 = Integer.parseInt(properties.get("int_7"));
		INT_8 = Integer.parseInt(properties.get("int_8"));
		INT_9 = Integer.parseInt(properties.get("int_9"));
		INT_10 = Integer.parseInt(properties.get("int_10"));
		INT_11 = Integer.parseInt(properties.get("int_11"));
		INT_12 = Integer.parseInt(properties.get("int_12"));
		INT_13 = Integer.parseInt(properties.get("int_13"));
		INT_14 = Integer.parseInt(properties.get("int_14"));
		INT_15 = Integer.parseInt(properties.get("int_15"));
		INT_16 = Integer.parseInt(properties.get("int_16"));
	}
}

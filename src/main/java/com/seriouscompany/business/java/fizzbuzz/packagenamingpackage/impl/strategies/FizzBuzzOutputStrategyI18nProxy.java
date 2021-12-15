package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Constants;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzOutputStrategy;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author zwk
 * @date 2021/12/15
 **/
public class FizzBuzzOutputStrategyI18nProxy implements FizzBuzzOutputStrategy {

    private final FizzBuzzOutputStrategy _fizzBuzzOutputStrategy;

    public FizzBuzzOutputStrategyI18nProxy(final FizzBuzzOutputStrategy _fizzBuzzOutputStrategy) {
        this._fizzBuzzOutputStrategy = _fizzBuzzOutputStrategy;
    }

    /**
     * @author zwk
     * @date 17:53 2021/12/15
     * @param output
     * @return void
     **/
    @Override
    public void output(String output) throws IOException {
        Properties properties = PropertiesLoaderUtils.loadAllProperties(Constants.I18N_LIB_PROPERTIES_PATH);
        String pathSuffix = Constants.I18N_LIB_PROPERTIES_SEPARATOR + Constants.LANGUAGE;
        String fizz = properties.getProperty(Constants.FIZZ+pathSuffix);
        String buzz = properties.getProperty(Constants.BUZZ+pathSuffix);
        output = output.replaceAll(Constants.FIZZ,fizz).replaceAll(Constants.BUZZ,buzz);
        this._fizzBuzzOutputStrategy.output(output);
    }
}

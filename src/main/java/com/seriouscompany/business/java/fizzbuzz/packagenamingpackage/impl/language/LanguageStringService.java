package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.language;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.enums.LanguageString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.enums.LanguageString.*;

@Service
public class LanguageStringService {

    private static final Map<LanguageString, String> en_US = new HashMap<>();
    private static final Map<LanguageString, String> zh_CH = new HashMap<>();

    private static Map<LanguageString, String> activeLanguageMap;

    static {
        en_US.put(AN_ATTEMPT_WAS_MADE_TO_DIVIDE_BY_ZERO, "An attempt was made to divide by zero.");
        en_US.put(BUZZ, "Buzz");
        en_US.put(FIZZ, "Fizz");
        en_US.put(THE_INTEGERS_COULD_NOT_BE_COMPARED, "The integers could not be compared.");

        zh_CH.put(AN_ATTEMPT_WAS_MADE_TO_DIVIDE_BY_ZERO, "试图被除以零。");
        zh_CH.put(BUZZ, "蜂鸣器");
        zh_CH.put(FIZZ, "嘶");
        zh_CH.put(THE_INTEGERS_COULD_NOT_BE_COMPARED, "整数不能比较。");
    }

    @Autowired
    public LanguageStringService(@Value("#{systemProperties['user.locale']}") String locale) {
        switch (locale) {
            case "en_US":
                activeLanguageMap = en_US;
                break;
            case "zh_CN":
                activeLanguageMap = zh_CH;
                break;
            default:
                activeLanguageMap = en_US;
        }
    }

    public static String getString(LanguageString name) {
        return activeLanguageMap.get(name);
    }

}

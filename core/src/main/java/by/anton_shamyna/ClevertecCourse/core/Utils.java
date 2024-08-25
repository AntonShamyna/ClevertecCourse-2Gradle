package by.anton_shamyna.ClevertecCourse.core;

import by.anton_shamyna.ClevertecCourse.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumber(String... str) {
        boolean result = true;
        for (String s : str) {
            result = result && StringUtils.isPositiveNumber(s);
        }
        return result;
    }
}
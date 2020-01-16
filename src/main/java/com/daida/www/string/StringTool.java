package com.daida.www.string;

import java.util.Optional;
import java.util.function.Predicate;

public class StringTool {

    //字符串的长度是否为null或者""
    public static Predicate<String> StringLengthNull = (x) -> Optional.ofNullable(x).orElse("").trim().length()>0;

}

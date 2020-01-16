package com.daida.www.string;

import java.util.Optional;
import java.util.function.Predicate;

public class StringTool {

    public static Predicate<String> StringLengthNull = (x) -> Optional.ofNullable(x).orElse("").trim().length()>0;

}

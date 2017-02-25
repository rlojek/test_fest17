package org.me.wrapStatic;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public class TextUtils {

    public static Set<String> getSingleWord(Collection<String> inputText){
        Set<String> sinleWords = inputText.stream()
            .flatMap(words -> Arrays.stream(words.split(" ")))
            .collect(Collectors.toSet());
        return sinleWords;
    }
}

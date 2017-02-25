package org.me.wrapStatic;

import java.util.Collection;
import java.util.Set;

public class TextTokeniser {

    public int tokenizeCount(Collection<String> text){
        Set<String> singleWords = TextUtils.getSingleWord(text);
        return singleWords.size();
    }
}

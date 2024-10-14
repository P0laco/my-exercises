package io.codeforall.fanSTATICs_;

import java.util.HashSet;
import java.util.Iterator;

public class UniqueWord implements Iterable<String> {

    private HashSet hashSet = new HashSet();

    private String[] stringArray;

    public UniqueWord(String string) {
        stringArray = string.split(" ");
        for (int i = 0; i < stringArray.length; i++) {
            hashSet.add(stringArray[i]);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return this.hashSet.iterator();
    }
}

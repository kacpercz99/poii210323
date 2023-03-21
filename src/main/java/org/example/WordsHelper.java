package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordsHelper {
    public static int countDistinctCharacters(String word) {
        Set<Integer> characterSet = new HashSet<>();
        word.chars().forEach(characterSet::add);
        return characterSet.size();
    }

    public static Set<String> countDistinctCharactersV2(String word) {
        return new HashSet<>(Arrays.asList(word.split("")));
    }
}

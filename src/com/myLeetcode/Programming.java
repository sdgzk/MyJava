package com.myLeetcode;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;
 
public class Programming {
    @Test
    public void testFirstNonRepeatedCharacter() {
        assertEquals('b', Programming.firstNonRepeatedCharacter("abcdefghija"));
        assertEquals('h', Programming.firstNonRepeatedCharacter("hello"));
        assertEquals('J', Programming.firstNonRepeatedCharacter("Java"));
        assertEquals('i', Programming.firstNonRepeatedCharacter("simplest"));
    }
 
    @Test
    public void testFirstNonRepeatingChar() {
        assertEquals('b', Programming.firstNonRepeatingChar("abcdefghija"));
        assertEquals('h', Programming.firstNonRepeatingChar("hello"));
        assertEquals('J', Programming.firstNonRepeatingChar("Java"));
        assertEquals('i', Programming.firstNonRepeatingChar("simplest"));
    }
 
    @Test
    public void testGetFirstNonRepeatedChar() {
        assertEquals('b', Programming.getFirstNonRepeatedChar("abcdefghija"));
        assertEquals('h', Programming.getFirstNonRepeatedChar("hello"));
        assertEquals('J', Programming.getFirstNonRepeatedChar("Java"));
        assertEquals('i', Programming.getFirstNonRepeatedChar("simplest"));
    }
    /**
     * Java Program to find first duplicate, non-repeated character in a String.
     * It demonstrate three simple example to do this programming problem.
     * 
     * @author Javarevisited
     */
    public static char getFirstNonRepeatedChar(String str) {
        Map<Character, Integer> counts = new LinkedHashMap<Character, Integer>(
                str.length());
        for (char c : str.toCharArray()) {
            counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
        }
        for (Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        throw new RuntimeException("didn't find any non repeated Character");
    }
 
    /**
     * Using HashMap to find first non-repeated character from String in Java.
     * Algorithm :
     * 
     * Step 1 : Scan String and store count of each character in HashMap
     * 
     * Step 2 : traverse String and get count for each character from Map. Since
     * we are going through String from first to last character, * when count
     * for any character is 1, we break, it's the first * non repeated
     * character. Here order is achieved by going * through String again.
     */
    public static char firstNonRepeatingChar(String word) {
        Set<Character> repeating = new HashSet<Character>();
        List<Character> nonRepeating = new ArrayList<Character>();
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (repeating.contains(letter)) {
                continue;
            }
            if (nonRepeating.contains(letter)) {
                nonRepeating.remove((Character) letter);
                repeating.add(letter);
            } else {
                nonRepeating.add(letter);
            }
        }
        return nonRepeating.get(0);
    }
 
    /**
     * Using HashMap to find first non-repeated character from String in Java.
     * Algorithm :
     * 
     * Step 1 : Scan String and store count of each character in HashMap
     * 
     * Step 2 : traverse String and get count for each character from Map. Since
     * we are going through String from first to last character, when count for
     * any character is 1, we break, it's the first non repeated character. Here
     * order is achieved by going through String again.
     * 
     * @return
     */
    public static char firstNonRepeatedCharacter(String word) {
        HashMap<Character, Integer> scoreboard = new HashMap<Character, Integer>();
        // build table [char -> count]
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (scoreboard.containsKey(c)) {
                scoreboard.put(c, scoreboard.get(c) + 1);
            } else {
                scoreboard.put(c, 1);
            }
        }
        // since HashMap doesn't maintain order, going through string again
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (scoreboard.get(c) == 1) {
                return c;
            }
        }
        throw new RuntimeException("Undefined behaviour");
    }
}
package com.myLeetcode;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UniqueMorseRepresentations {

	public static void main(String args[]) {
		UniqueMorseRepresentations s = new UniqueMorseRepresentations();
		String words[] = {"gin", "zen", "gig", "msg"};
		int count = s.uniqueMorseRepresentations(words);
		System.out.println(count);
	}
	
    public int uniqueMorseRepresentations(String[] words) {
    	
    	System.out.println(Arrays.toString(words));
        String mima[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map m = new HashMap(100);
        char a = 'a';
		for (int i =0;i< mima.length;i++) {
			m.put(a++, mima[i]);
		}
		Iterator iter = m.entrySet().iterator();  
		while (iter.hasNext()) {  
            Map.Entry entry = (Map.Entry) iter.next();  
            Object key = entry.getKey();  
            Object value = entry.getValue();  
            System.out.println(key + ":" + value);  
  
        }
		StringBuffer sb = null;
		int count = 0;
		HashMap outPut = new HashMap(100);
		for (int i =0;i< words.length;i++) {
			String in_word = words[i];
			sb = new StringBuffer();
			for (int j = 0;j <in_word.length();j++) 
			{
				char abc = in_word.charAt(j);
				String mi = (String)m.get(abc);
				sb.append(mi);
				
			}

			String out = sb.toString();
			System.out.println(out);
			
            if (outPut.containsKey(out) == false) {
            	outPut.put(out, out);
                count ++;	
            }
		
			
					
		}
		
        return count;
    }
    
    
}

package com.myLeetcode;
//给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class KeyboardRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyboardRow kb = new KeyboardRow();
		String[] words = {"Hello", "Alaska", "Dad", "Peace"};
		String[] out=kb.findWords(words);
		System.out.println(Arrays.toString(out));
		out=kb.findWords2(words);
		System.out.println(Arrays.toString(out));
	}
	public String[] findWords(String[] words) {
		Map<String,String> h1  = new HashMap<String,String>();
		h1.put("Q", "");
		h1.put("W", "");
		h1.put("E", "");
		h1.put("R", "");
		h1.put("T", "");
		h1.put("Y", "");
		h1.put("U", "");
		h1.put("I", "");
		h1.put("O", "");
		h1.put("P", "");
		Map<String,String> h2 = new HashMap<String,String>();
		h2.put("A", "");
		h2.put("S", "");
		h2.put("D", "");
		h2.put("F", "");
		h2.put("G", "");
		h2.put("H", "");
		h2.put("J", "");
		h2.put("K", "");
		h2.put("L", "");
		Map<String,String> h3 = new HashMap<String,String>();
		h3.put("Z", "");
		h3.put("X", "");
		h3.put("C", "");
		h3.put("V", "");
		h3.put("B", "");
		h3.put("N", "");
		h3.put("M", "");
		boolean flg1 = false;
		boolean flg2= false;
		boolean flg3 = false;
		// Map<String,String> out = new HashMap<String,String>(100);
		List<String> out = new ArrayList<String>(100);
		for (int i =0;words != null && i < words.length;i++) {
			String word = words[i];
			flg1 = false;
			flg2 = false;
			flg3 = false;
			for (int j=0;j<word.length();j++) {
				char abc = word.charAt(j);
				if (abc >= 'a' && abc <='z') {
					abc =(char) (abc - 32);
				}
				
				if (abc >= 'A' && abc <='Z') {
					if (h1.containsKey(String.valueOf(abc)) ) {
						flg1 = true; 
					}
					if (h2.containsKey(String.valueOf(abc))) {
						flg2 = true; 
					}

					if (h3.containsKey(String.valueOf(abc))) {
						flg3 = true; 
					}
				}

			}
		
			if ((flg1 == true && flg2 == false && flg3 == false)
					|| (flg1 == false && flg2 == true && flg3 == false) 
					|| (flg1 == false && flg2 == false && flg3 == true) 
					) {
				out.add(words[i]);
			}
			
		}
		String [] newLongs=  out.toArray(new String []{});
		return newLongs;
	}
	
	 public String[] findWords2(String[] words) {
	        List<String> oneRowWords = new ArrayList<String>();
	        String[] keyboard = {"qwertyuiop","asdfghjkl","zxcvbnm"};
	        for(String word : words) {
	            String realWord = word;
	            word = word.toLowerCase();//每个字母变为小写
	            char[] strBit = word.toCharArray();
	            int count = 0;
	            for(char ch : strBit) {
	                if(keyboard[0].indexOf(strBit[0]) != -1) {//第一个字母在第一排
	                    if(keyboard[0].indexOf(ch) == -1) {//其他字母必须也在第一排 否则跳过
	                        break;
	                    }
	                }else if(keyboard[1].indexOf(strBit[0]) != -1) {//第一个字母在第二排
	                    if(keyboard[1].indexOf(ch) == -1) {
	                        break;
	                    }
	                }else if(keyboard[2].indexOf(strBit[0]) != -1) {//第一个字母在第三排
	                    if(keyboard[2].indexOf(ch) == -1) {
	                        break;
	                    }
	                }
	                count ++;
	            }
	            if(count == strBit.length) {
	                oneRowWords.add(realWord);
	            }
	        }
	        String[] oneRowWordsArray = new String[oneRowWords.size()];
	        for(int i=0; i<oneRowWords.size(); i++){
	            oneRowWordsArray[i] = oneRowWords.get(i);
	        }

	        return oneRowWordsArray;
	    }

}

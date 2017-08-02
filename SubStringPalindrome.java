package us.gopinath.substring;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubStringPalindrome {


	public static void main(String[] args) throws IOException{
        int res = palindrome("aabaa");
        System.out.println(res);
    }
	
		

	
	private static int palindrome(String str) {
	    String[] chrArray = str.split("");
	    List<String> chrList = Arrays.asList(chrArray);
	    Set<String> uniquePalindromeSet = new HashSet<>(chrList);
	    String palindromeString = null;
	    for(int i = 0 ; i<chrList.size() ; ++i){
	    	palindromeString = chrList.get(i);
	        for(int j = i+1 ; j<chrList.size() ; ++j){
	        	palindromeString = palindromeString+chrList.get(j);
	            if(!uniquePalindromeSet.contains(palindromeString) && isPalindrome(palindromeString)){
	            	uniquePalindromeSet.add(palindromeString);
	            }
	        }
	    }
	    return uniquePalindromeSet.size();
	}


	private static boolean isPalindrome(String str){
		
	    char[] chars = str.toCharArray();
	    for(int i =0;i<(chars.length/2);i++){
	        if(chars[i] != chars[chars.length-1-i]){
	            return false;
	        }
	    }
	    return true;
	}
	
	private static boolean checkPalindrome(String str) {
		if(str.equals(new StringBuilder(str).reverse().toString())) {
			return true;
		}
		return false;
	}

}

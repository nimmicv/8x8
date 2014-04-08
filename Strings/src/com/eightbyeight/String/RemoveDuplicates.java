package com.eightbyeight.String;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String duplicateString = "abbccddeghst";
		RemoveDuplicates rdp = new RemoveDuplicates();
		String uniqueString = rdp.removeDup(duplicateString);

	}
	
	public String removeDup(String s)
	{
		
		if(s == null)
		{
			return null;
		}
		
		Set<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		StringBuffer sb = new StringBuffer();
		for(Character c : set)
		{
			sb.append(c);
		}
		return sb.toString();
	}

}

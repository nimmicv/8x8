package com.eightbyeight.String;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String duplicateString = "abbccddeghst";
		RemoveDuplicates rdp = new RemoveDuplicates();
		String uniqueString = rdp.removeDup(duplicateString);
		System.out.println("New String =" + uniqueString);
		String uniqueString2 = rdp.removeDup2(duplicateString);
		System.out.println("New String =" + uniqueString2);

	}
	
	// Using LinkedHashSet
	public String removeDup(String s)
	{
		
		if(s == null)
		{
			return null;
		}
		// I used a linkedHashset instead of hashset to maintain the order of insertion
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
	
	
	// Using 
	public String removeDup2(String s)
	{
		
		if(s == null)
		{
			return null;
		}
		boolean[] array = new boolean[128];
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<s.length();i++)
		{
			if(!array[(int)s.charAt(i)])
			{
				array[(int)s.charAt(i)]=true;
				sb.append(s.charAt(i));
			}
		}
		//System.out.println(sb.toString());
		
		return sb.toString();
	}


}

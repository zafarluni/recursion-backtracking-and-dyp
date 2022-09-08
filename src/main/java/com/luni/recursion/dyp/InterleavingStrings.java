package com.luni.recursion.dyp;

public class InterleavingStrings {

	public boolean isInterleaving(String str, String s1, String s2){
		return isInterleavingRec(str, s1, s2);
	}

	public boolean isInterleavingRec(String str, String s1, String s2){
		if(str.length() == 0 && s1.length() == 0 && s2.length() == 0){
			return true;
		}
		if(str.length() == 0){
			return false;
		}

		if(str.charAt(0) == s1.charAt(0)){
			return isInterleavingRec(str.substring(1), s1.substring(1), s2);
		}
		if(str.charAt(0) == s2.charAt(0)){
			return isInterleavingRec(str.substrin(1), s1, s2.substring(1));
		}

		// if no character for either string is match then return false.
		return false;
	}
}
package com.learning.datastructure.queue;

import java.io.UnsupportedEncodingException;

public class AscendPriorityQueueUsingLinkedList {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
	
		//StandardCharsets.UTF_8.encode(rawString);
		
		 String str = "hey\u6366";
	      byte[] charset = str.getBytes("UTF-8");
	      String result = new String(charset, "UTF-8");
	      System.out.println(result);
		
		

	}

}

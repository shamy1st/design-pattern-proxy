package com.shamy1st;

import com.shamy1st.proxy.Library;
import com.shamy1st.proxy.LoggingEbookProxy;

public class Main {

	public static void main(String[] args) {
		
		Library library = new Library();
		String[] fileNames = { "a", "b", "c" };
		for(String fileName : fileNames) {
			library.add(new LoggingEbookProxy(fileName));
		}
		
		library.openEbook("a");
		library.openEbook("b");
	}
}

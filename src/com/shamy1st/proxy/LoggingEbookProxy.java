package com.shamy1st.proxy;

public class LoggingEbookProxy implements Ebook {

	private String fileName;
	private RealEbook realEbook;
	
	public LoggingEbookProxy(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void show() {
		if(realEbook == null)
			realEbook = new RealEbook(fileName);
		
		System.out.println("Logging");
		realEbook.show();
	}

	@Override
	public String getFileName() {
		return fileName;
	}
}

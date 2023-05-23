package study.guide.chapter.ch7.practise7;

import java.util.zip.ZipEntry;

import study.guide.chapter.ch7.otherpackage.Abstract;

public record Car(String brand, String model) implements Parent {
	public final static int x = 0;
	public static int ZipEntry; 
	@Override 
	public String brand() {
		return "berk";
	}
	
}

package com.coderscampus.arraylist;

public class Assignment5Application {
	
	public static void main(String[] args) {
		
		CustomList<String> itemContents = new CustomArrayList<>();
		
		populateElement(itemContents);
		for (int i=0; i<itemContents.getSize(); i++) {
			System.out.println(itemContents.get(i));
		}
		
	}

	private static void populateElement(CustomList<String> itemContents) {
		itemContents.add("Element 1");
		itemContents.add("Element 2");
		itemContents.add("Element 3");
		itemContents.add("Element 4");
		itemContents.add("Element 5");
		itemContents.add("Element 6");
		itemContents.add("Element 7");
		itemContents.add("Element 8");
		itemContents.add("Element 9");
		itemContents.add("Element 10");
		itemContents.add("Element 11");
		itemContents.add("Element 12");
		itemContents.add("Element 13");
		itemContents.add("Element 14");
		itemContents.add("Element 15");
		itemContents.add("Element 16");
		itemContents.add("Element 17");
		itemContents.add("Element 18");
		itemContents.add("Element 19");
		itemContents.add("Element 20");
	}
}

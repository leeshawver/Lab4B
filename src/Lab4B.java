import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lab4B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Steve", "Harold", "Jason", "Billy", "Hesse", "shawver");
		Set<String> blip = new HashSet<String>();
		blip.add("Billy");
		blip.add("Raymond");
		blip.add("Harold");
		blip.add("Bob");
		blip.add("Brisket");
		blip.add("Tony");

		List<Integer> myNumbers = Arrays.asList(1, 54, 36, 223, 442, 31, 32, 333, 5748);
		List<List<Integer>> sortedNumbers = intList(myNumbers);
		for (List<Integer> list : sortedNumbers) {
			for (int i : list) {
				System.out.println(i);
			}
			System.out.println("_____________________");
		}
		String newName = "s";
		List<String> printedNames = allWords(names, newName);
		for (String word : printedNames) {
			System.out.println(word);
		}
		
		List<String> states = Arrays.asList("Alabama", "Arkansas", "Alaska", "California", "New Mexico");
		List<Integer> finalCount = countLetters(states);
		for (int i : finalCount) {
			System.out.println(i);
		}
		
		Set<String> setOfNames = new HashSet<String>();
		setOfNames.add("Hello");
		setOfNames.add("Goodbye");
		setOfNames.add("Whatsh out");
		setOfNames.add("Buh bye");

		for (String name : setOfNames) {
			System.out.println(name);
		}
		
		Set<String> printNames = getFirstChar(blip, 'B');
		for (String needle : printNames) {
			System.out.println(needle);
		}
		
		List<String> printList = setToList(blip);
		for (String ble : printList) {
			System.out.println(ble);
		}
		
	}
	
	public static List<String> allWords(List<String> namesList, String query) {
		List<String> newList = new ArrayList<String>();
		for (String name : namesList) {
			if (name.toLowerCase().contains(query)) {
				newList.add(name);
			}
		}
		return newList;
	}
	
	public static List<List<Integer>> intList (List<Integer> numbers) {
		List<List<Integer>> allNums = new ArrayList<List<Integer>>();
		List<Integer> div2 = new ArrayList<Integer>();
		List<Integer> div3 = new ArrayList<Integer>();
		List<Integer> div5 = new ArrayList<Integer>();
		List<Integer> notDiv = new ArrayList<Integer>();
		for (int i : numbers) {
			if (i % 2 == 0) {
				div2.add(i);
			} 
			if (i % 3 == 0) {
				div3.add(i);
			}
			if (i % 5 == 0) {
				div5.add(i);
			}
			if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
				notDiv.add(i);
			}
		}
		allNums.add(div2);
		allNums.add(div3);
		allNums.add(div5);
		allNums.add(notDiv);
		return allNums;
	}
	
	public static List<Integer> countLetters (List<String> wordsList) {
		List<Integer> stateInts = new ArrayList<Integer>();
		for (String word : wordsList) {
			stateInts.add(word.length());
		}
		return stateInts;
	}
	
	public static Set<String> getFirstChar(Set<String> names, char first) {
		Set<String> firstChar = new HashSet<String>();
		for (String i : names) {
			if (i.charAt(0) == first) {
				firstChar.add(i);
			}
		}
		return firstChar;
	}
	
	public static List<String> setToList(Set<String> nobbies) {
		List<String> newList = new ArrayList<String>();
		for (String nube : nobbies) {
			newList.add(nube);
		}
		return newList;
	}

}

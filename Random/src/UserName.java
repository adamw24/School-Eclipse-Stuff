import java.util.ArrayList;

public class UserName {
	private static ArrayList<String> possibleNames = new ArrayList<String>();

	public UserName(String firstName, String lastName) {
		for (int i = 0; i < firstName.length(); i++) {
			String first = firstName.substring(0, i + 1);
			possibleNames.add(lastName + first);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserName person1 = new UserName("mary", "hart");
		String[] usedN = { "harta", "hartm", "harty" };
		System.out.println(person1.toString());
		setAvailableUserNames(usedN);
		System.out.print(person1.toString());

	}

	public static boolean isUsed(String name, String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (name.equals(arr[i])) {
				return true;
			}
		}
		return false;
	}

	public String toString() {
		String p = "";
		for (String s : possibleNames) {
			p += s + " ";
		}
		return p;
	}

	public static void setAvailableUserNames(String[] usedNames) {
		for (int i = 0; i < possibleNames.size(); i++) {
			if (isUsed(possibleNames.get(i), usedNames)) {
				possibleNames.remove(i);
			}
		}
	}

}

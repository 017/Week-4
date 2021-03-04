import java.util.*;

public class Default {

	public static void main(String[] args) {
		ArrayList<String> employeeNames = new ArrayList<String>();
		HashSet<Integer> ids = new HashSet<Integer>();
		HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		employeeNames.add("Byrd");
		employeeNames.add("Kowalski");
		employeeNames.add("Jenkins");
		employeeNames.add("Vasquez");
		employeeNames.add("Fitzpatrick");
		ids.add(0001);
		ids.add(0002);
		ids.add(0003);
		ids.add(0004);
		
		int i=0;
		
		for (String employee : employeeNames) {
			employeeMap.put(i, employee);
			i++;
		}
		
		for (int key : employeeMap.keySet()) {
			System.out.println(key);
			System.out.println(employeeMap.get(key));
		}
		
		StringBuilder idsBuilder = new StringBuilder();
		
		Iterator<Integer> iter = ids.iterator();
		
		for (Integer el : ids) {
			idsBuilder.append(el + "-");
		}
		
		System.out.println("idsBuilder: " + idsBuilder.toString());

		StringBuilder namesBuilder = new StringBuilder();
		
		for (String name : employeeNames) {
			namesBuilder.append(name + " ");
		}
		
		System.out.println("namesBuilder: " + namesBuilder.toString());
	}

}

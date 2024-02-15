package StepDefination;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> hm = new HashMap<String, String>();
		
		hm.put("Maharashtra", "Mumbai");
		hm.put("Punjab", "Chand");
		hm.put("Haryana", "Chand");//{Haryana=Chand, Punjab=Chand, Maharashtra=Mumbai}

		//hm.put("Haryana", "cd");//{Haryana=cd, Punjab=Chand, Maharashtra=Mumbai}
		
		System.out.println(hm);

	}

}

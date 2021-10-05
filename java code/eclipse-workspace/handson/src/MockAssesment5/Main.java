package MockAssesment5;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String>map=new HashMap<String,String>();
		map.put("TCS-003", "TCS");
		map.put("IBM-112", "IBM");
		map.put("DEL-455", "DEL");
		map.put("HP-288", "HP");
		map.put("CTS-144", "CTS");
		Map<String,String>map1=UserMainCode.getCompanyCode(map);
		System.out.println(map1);

	}

}


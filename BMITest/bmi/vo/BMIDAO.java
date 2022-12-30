package bmi.vo;

import java.util.ArrayList;

public class BMIDAO {
	//ArrayList
	ArrayList<BMIVO> bmiList = new ArrayList();
	
	//Insert
	public void insert(BMIVO bmi) {
		bmiList.add(bmi);
	}
	
	//select
	public ArrayList<BMIVO> select() {
		return bmiList;
		
	}
}

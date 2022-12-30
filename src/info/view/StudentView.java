package info.view;

import java.util.ArrayList;

//학생 정보를 출력하는 Object
import info.vo.SchoolInfo;
import info.vo.StudentVO;

public class StudentView {
	public void view(ArrayList<StudentVO> svoList) { // svoList 넣어주기
		System.out.println("학교 명 : " + SchoolInfo.SCHOOL_NAME);
		// 개선된 (enhanced) for문
		for (StudentVO svo : svoList) {
			System.out.print("성명 : " + svo.getName() + "\t"); // svo = svo.toString()
			System.out.print("학번 : " + svo.getStuId() + "\t");
			System.out.print("학년 : " + svo.getGrade() + "\t");
			System.out.print("전공 : " + svo.getMajor() + "\t");
			System.out.print("번호 : " + svo.getMobile() + "\t");
			System.out.print("주소 : " + svo.getAddress() + "\n");
		}

		// for(int i = 0; i < svoArr.length; i++) { System.out.println(svoArr[i]); }

		System.out.println("학교 전화 : " + SchoolInfo.PHONE_NUMBER);
		System.out.println("학교 주소 : " + SchoolInfo.SCHOOL_ADDRESS);
	}
}

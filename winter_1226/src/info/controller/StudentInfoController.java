package info.controller;

import java.util.ArrayList;
import java.util.Scanner;

import info.view.StudentView;
import info.vo.SchoolInfo;
import info.vo.StudentDAO;
// svoArr[0]~[2]: 3명의 학생정보객체를 저장한다.
import info.vo.StudentVO;

public class StudentInfoController {
	public static final int CONTINUE = 1; // 계속 입력
	public static final int EXIT = 0; // 그만 입력

	public static void main(String args[]) { //ArrayList로 변수 만들기
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> grades = new ArrayList<Integer>();
		ArrayList<Integer> stuIds = new ArrayList<Integer>();
		ArrayList<String> majors = new ArrayList<String>();
		ArrayList<String> mobiles = new ArrayList<String>();
		ArrayList<String> addresses = new ArrayList<String>();

		Scanner s1 = new Scanner(System.in); //문자열 입력용
		Scanner s2 = new Scanner(System.in); //정수값 입력용

		int flag = CONTINUE; //flag에 상수 CONTINUE(1) 값 대입
		System.out.println("========   학생 정보 입력 화면   ========");
		while (true) { 
			if (flag == CONTINUE) { //flag가 1이면 계속
				System.out.print("== 성명 : "); //ArrayList를 사용할 때는 add사용
				names.add(s1.nextLine());
				System.out.print("== 학번 : ");
				stuIds.add(s2.nextInt());
				System.out.print("== 학년 : ");
				grades.add(s2.nextInt());
				System.out.print("== 전공 : ");
				majors.add(s1.nextLine());
				System.out.print("== 전화 : ");
				mobiles.add(s1.nextLine());
				System.out.print("== 주소 : ");
				addresses.add(s1.nextLine());
			} else if (flag == EXIT) { //flag가 0이면 종료
				break;
			}
			System.out.print("계속 입력하시겠습니까? (계속 : 1, 종료 : 0) : ");
			flag = s2.nextInt(); //flag 입력받기
			System.out.println("");
		} //입력받기

		StudentDAO dao = new StudentDAO();

		// 길이 : length -> size()
		for (int i = 0; i < names.size(); i++) { //이름의 길이까지
			StudentVO svo = new StudentVO(names.get(i), stuIds.get(i), grades.get(i), majors.get(i), mobiles.get(i), addresses.get(i));
			System.out.println();
			dao.insert(svo); // ->콜바이 래퍼런스 ctrl + 클릭
		}

		// 화면 출력
		StudentView stuView = new StudentView();
		stuView.view(dao.select());
		s1.close(); // 스캐너 닫아주기 -> 시스템 리소스를 덜 쓰게 됨
		s2.close();
	}
}

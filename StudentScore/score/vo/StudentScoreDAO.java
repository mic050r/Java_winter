package score.vo;

import java.util.ArrayList;

public class StudentScoreDAO {
	// ArrayList 만들기
	ArrayList<StudentScoreVO> scoList = new ArrayList();

	// insert 만들기
	public void insert(StudentScoreVO sco) {
		scoList.add(sco);
	}
	// select
	public ArrayList<StudentScoreVO> select(){
		return scoList;
	}
	
	//delete 삭제 메소드
	public void delete(int row){
		scoList.remove(row);
	}
}

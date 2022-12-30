package info.vo;
//VO : Value Object

public class StudentVO { // vo에는 getter와 setter가 꼭 필요
	// 성명, 학번, 학년, 전공, 전화번호 필드값들
	// private : 현재 이 클래스내에서만 사용 ㄱㄴ
	private String name;
	private int stuId;
	private int grade;
	private String major;
	private String mobile;

	// 생성자 : 필드 값 초기화
	public StudentVO(String name, int stuId, int grade, String major, String mobile) { //매개변수
		//멤버필드 = 멤버변수
		this.name = name;
		this.stuId = stuId;
		this.grade = grade;
		this.major = major;
		this.mobile = mobile;
	}

	// setter : 필드 값 설정
	// getter : 필드 값 변환
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override //메소드 재정의
	//Object(부모클래스를 정하지 않으면 자동으로)가 최상의 클래스(부모) -> StudentVO로 정의
	public String toString() {
		return "StudentVO [name=" + name + ", stuId=" + stuId + ", grade=" + grade + ", major=" + major + ", mobile="
				+ mobile + "]";
	}
	
}

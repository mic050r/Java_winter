package score.vo;

public class StudentScoreVO {
	private int stuId;   //학번
	private String name; //이름
	private int grade;   //학년
	private int ban;     //반
	private int kor;     //영어
	private int eng;     //영어
	private int math;	 //수학
	private int sci;	 //과학
	private int total;	 //총점
	private double avg;  //평균
	
	public StudentScoreVO() {
		
	}
	public StudentScoreVO(int stuId, String name, int grade, int ban, int kor, int eng, int math, int sci, int total,
			double avg) {
		super();
		this.stuId = stuId;
		this.name = name;
		this.grade = grade;
		this.ban = ban;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sci = sci;
		this.total = total;
		this.avg = avg;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal() {
		this.total = kor + sci + math + eng;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg() {
		this.avg = total / 4.0;
	}
	
	

	@Override
	public String toString() {
		return "StudentScoreVO [stuId=" + stuId + ", name=" + name + ", grade=" + grade + ", ban=" + ban + ", kor="
				+ kor + ", eng=" + eng + ", math=" + math + ", sci=" + sci + ", total=" + total + ", avg=" + avg + "]";
	}
	
	
}

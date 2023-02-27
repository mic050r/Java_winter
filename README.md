# Event Programming EventListener
Event Programming EventListener : 이미지나 버튼을 변화시키는 것

### 1번째 방법
- JFrame 클래스(현재 클래스)에 EventHandler 클래스
	- 추상 메소드 actionPerformed
	- btn와 actionPerformed를 연결할 때 addActionListener를 이용
	- 연결 버튼이 클릭이 되면 actionPerformed이 호출

### 2번째 방법
- Inner(내부)클래스로 ActionListener를 구현
	- 클래스안에 BtnListener를 만들고 그 참조값을 addActionListener에 추가해주기

### 3번째 방법
- Anonymous(익명) 클래스로 ActionListener를 구현
	- 클래스 이름이 없고 new ActionListener를 상속 받아서 이름없이 클래스를 구현(객체 생성됨) 이걸 버튼과 연결

### 4번째 방법

- 독립된 ActionListener 클래스를 사용하자(콜바이 래퍼런스)
	- Listener를 독립시켜준다 ActionListener라는 상속을 받음 → implements ActionListener
	- 3개의 참조값 전달(버튼많아지면 배열로 만들어주기 리스너객체에 전달 )
	- 독립된 클래스 만들기 (객체 생성해서 addActionListener로 연결)


# < 도서 정보 관리 시스템 >
#### MVC 모델링
- M
	- DataModel(BookVO, BookDAO)
- V
	-	View(BookView)
- C
	- Controller(BookController)
	- 
**입력 (콘솔) : 도서정보 (BookVO)**

→여러 책의 정보들 

→ ArrayList(BookVO객체들) / 저장 반환 

→BookDAO isbn(도서번호), bookName(책이름), author(저자명), publish(출판사), price(가격), category(카테고리) → 6개 필드

**출력 : 저장된 도서 정보들을 콘솔창에 출력**


## javax.swing.JTable
- 행, 열로 data를 출력하는 컴포넌트

## jvax.swing.JTextField
- 값 입력 컴포넌트

## javax.swing.JCombobox
- 콤보박스 컴포넌트

GridLayout(표 같은 느낌)(4, 4) (행, 열)

Empty String : “ “ 빈 문자열

JPanel를 이용하여 추가

-GridLayout
|GridLayout| | | | 
|---|---|---|---|
|도서번호 :|TextField  |도서명 : |TextField|
|출판사 :|TextField  |저자명 : |TextField|
|도서가격 :|TextField  |카테고리 : |Combobox|
|EmptyString|        |  	|도서추가|

## JFrame : BorderLayout (다섯개의 구역)
- 창역할
- 그 안에 넣는 작은 역할이 JPanel

## JPanel : FlowLayout(자연스럽게, 저절로 flow)

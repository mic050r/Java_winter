# <Vending Machine(자판기)>
음료자판기(콘솔 입력 /출력)
- 제품 정보(음료) : ProductVO
  - 제품명
  - 제품가격
  - 재고량
- 제품관리(추가) : ProductDAO
  - 재고량이 없을때 제품을 채워주는 기능
- 자판기 화면 ProductView
  - 제품을 보여주는 화면(출력)
  - 제품을 구매화면(입력)
- 자판기사용 : ProductController
  - 제품화면을 보고 제품을 선택 → 돈을 투입 → 제품과 반환액을 출력

## 실행화면 
<img src = "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fcxe7AB%2FbtrUWRVBO0F%2FelItcKn33yFCTh45BhrPdK%2Fimg.png">

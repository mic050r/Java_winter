# 경마게임 GUI로 만들기
- GUI(JPanel - JLabel(말그림)3개) lbl1.setLocation(x, y)
- l bl1.setSize(50,50)
- pan.setLayout(null)
- Thread
  + 끝까지 결승점 도착
  + Random하게 하기
  + 말 선택 → 선택한 말에 이름 해당말 밑에 이름 보이게 하기

|대기화면|선택|성공|실패|
|---|---|---|---| 
|<img src = "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbfqOBc%2FbtrVo40YR20%2FmLReVb6LRb2P4XHQfidQg0%2Fimg.png">|<img src = "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fbn0tHM%2FbtrVoGZ97hs%2FJFNagRtAO9i7GGFYUra0NK%2Fimg.png">|<img src = "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbkwCz5%2FbtrVqgGnnc7%2Ffb1VLkWzu5f5SlDu4GEEDK%2Fimg.png">|<img src = "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FwQdHD%2FbtrVjMN13HL%2FGdDSLr3pIXDCBEEnY1Ik4k%2Fimg.png">| 

### <개선하기>
- 배팅을 두 사람이 가능하게 변경
- 배팅하는 두 사람의 이름도 저장해서 승리한 Beting 자의 이름을 표시

|말 선택|플레이어1 이름 입력|플레이어2 이름 입력|
|---|---|---|
|<img src = "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2F84v2o%2FbtrVpf2ieow%2FdVCgshWACMvCgk1WtT0PPk%2Fimg.png">|<img src = "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fcst0J5%2FbtrVpEt0Am7%2FXzAeqxG9xpEoikrSaIwTYk%2Fimg.png">|<img src = "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FlWA4d%2FbtrVpuyboir%2FWJNBAeMNZJvK1BUaFyiFY0%2Fimg.png">|
|경기중|우승말|성공|
|<img src = "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbSVIkc%2FbtrVpfutLl4%2Fn4tQX5Gt55ZiVxrf5QYYU0%2Fimg.png">|<img src = "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fcs2wbL%2FbtrVpvRqLAl%2FhWzcV0ACQboFRhfeba2KM1%2Fimg.png">|<img src = "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FWZ1sx%2FbtrVmgOlSyJ%2FaER4rSfwYloWctP3uOSJ1K%2Fimg.png">|

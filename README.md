# Thread를 이용하여 시간에 따라 사진 바뀌는 프로그램 만들기

## Multi Thread 개념

하나의 program에서 동시에 여러 작업을 하는 것처럼 느끼게 해줌
ex) 이미지 바뀌는거, 멀티프로세싱과 비슷

 

⭐Thread 상태전이도(Life Cycle/생명주기)

New Born(새로 태어난 상태) t1 = new Thread1()

→ t1.start()

→ Runnable(실행가능한 상태) JVM Thread Scheduler

→ Running(실행중인 상태) run() { } } ⇒ while(true)로 만들어 놓기, 죽지않고 계속이용할 수 있음

→ Dead(죽은 상태)

 

+Block(휴면 상태)

실행가능할때( sleep(ms) , wait ), 실행중일 때 쉴수 있다.
Runnable 상태일때만 돌아갈수 있음(시간 경과후 notifyAll)

| | | 
| | |
<img src = "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FoWOYl%2FbtrVeVjxtUN%2FkCwl7buDl6HMb4JA9UAKjk%2Fimg.png">
<img src = "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FcPRGAP%2FbtrVjjqbkSX%2FkpqHhBle5mkxprPJ0ptRfk%2Fimg.png">
<img src = "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FdoPGw9%2FbtrVeb1g7YM%2FbKd4BcqK8HaFsx18CvK631%2Fimg.png">

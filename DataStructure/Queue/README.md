# Queue 자료구조
![image](https://user-images.githubusercontent.com/95271528/147239667-e068c9cd-5f56-411e-bf49-cb3f3f9058dd.png)

삽입은 rear에서, 삭제는 front에서 이루어지는 선형 자료 구조로, 삭제를 할 때엔 가장 먼저 들어온 데이터가 삭제되는 FIFO(First-In First-Out) 구조다.

## 연산
+ empty()<br>큐가 비어 있다면 TRUE, 비어있지 않다면 FALSE 반환
+ enqueue(e)<br>큐의 rear에 데이터 e를 삽입
+ peek()<br> 큐의 front에 있는 데이터를 삭제하지 않고 반환
+ dequeue()<br> 큐의 front에 있는 데이터를 삭제하고 반환

## 배열로 구현한 선형 큐
+ front와 rear의 초기값은 -1이다.
+ enqueue 연산 시 rear의 값을 1 증가시킨다.
+ dequeue 연산 시 front의 값을 1 증가시킨다.
+ front == rear 이라면 큐가 비어있는 것이다.
+ 큐(배열)의 크기가 n이라고 했을 때, rear == n - 1이면 큐가 꽉 찬 것이다.

### 배열로 구현한 선형 큐의 단점

![image](https://user-images.githubusercontent.com/95271528/147242966-e8c3619a-32c3-49d1-9145-ce9cf40e465e.png)

![image](https://user-images.githubusercontent.com/95271528/147244327-26272a93-55e2-4115-8c0f-25a515bc8ce6.png)

+ 큐의 삽입과 삭제를 계속 반복하다보면, front와 rear의 값이 계속해서 증가해 rear가 큐의 마지막을 가리키게 된다.
<br>이렇게 되면 큐의 모든 데이터를 배열의 앞쪽으로 이동해야 한다. (위 그림에서 B와 C를 인덱스 0, 1로 이동)
  + 데이터의 이동만큼 시간이 낭비된다.

## 원형 큐
+ 선형 큐의 단점 극복

![image](https://user-images.githubusercontent.com/95271528/147247078-c016dcdc-404d-42d4-97ff-6d2e8df804bf.png)

+ front와 rear의 초기값은 0이다.
+ 큐(배열)의 크기가 n이라고 했을 때, 저장되는 데이터의 수는 n-1개이다.
  + 포화 상태 검사를 위해 인덱스 front 칸은 비워둔다.
+ enqueue 연산 시 rear의 값을 (rear + 1) % n 으로 바꾼다.
+ dequeue 연산 시 front의 값을 (front + 1) % n 으로 바꾼다.
+ front == rear 이라면 큐가 비어있는 것이다.
+ front == (rear + 1) % n 이라면 큐가 꽉 찬 것이다.

## 큐의 사용
+ 너비 우선 탐색(BFS, Breadth First Search)
+ 운영체제에서 FCFS(First Come, First Served) 스케줄링

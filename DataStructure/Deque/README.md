# Deque 자료구조

![image](https://user-images.githubusercontent.com/95271528/147347879-69e2e1ad-50a8-4c7c-8bb5-6a8b5e75764d.png)

double-ended queue, rear와 front 모두에서 삽입과 삭제가 가능한 선형 자료 구조이다.

## 연산
+ empty()<br>덱이 비어 있다면 TRUE, 비어있지 않다면 FALSE 반환
+ add_front(e)<br>덱의 front에 데이터 e를 삽입
+ peek_front()<br>덱의 front에 있는 데이터를 삭제하지 않고 반환
+ remove_front()<br>덱의 front에 있는 데이터를 삭제하고 반환
+ add_rear(e)<br>덱의 rear에 데이터 e를 삽입
+ peek_rear()<br>덱의 rear에 있는 데이터를 삭제하지 않고 반환
+ remove_front()<br>덱의 rear에 있는 데이터를 삭제하고 반환

## 배열로 구현한 원형 덱
+ 원형 큐를 이용해 구현할 수 있다.
+ add_front 연산 시 front의 값을 (front - 1 + n) % n 으로 바꾼다.
+ remove_front 연산은 dequeue 연산과 동일하다.
+ add_rear 연산 시 enqueue 연산과 동일하다.
+ remove_rear 연산 시 rear의 값을 (rear - 1 + n) % n 으로 바꾼다.

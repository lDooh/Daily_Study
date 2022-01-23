# 힙

최대값이나 최소값을 빠르게 찾을 수 있도록 고안된 이진탐색트리를 기본으로 한 자료구조
+ 힙 트리는 완전이진트리이다. 하지만 중복된 키값을 허용한다.
+ 자식 노드와 부모 노드 사이에는 대소 관계가 존재한다.

#### 이진 힙(Binary Heap)

자식 노드의 개수를 2개 이하로 제한하는 힙 트리

## 최대 힙(Max Heap)

![image](https://user-images.githubusercontent.com/95271528/147761800-faa235c9-83a9-459c-956e-50b2d851b2c3.png)

부모 노드의 키값이 자식 노드의 키값보다 항상 크거나 같은 힙

## 최소 힙(Min Heap)

![image](https://user-images.githubusercontent.com/95271528/147761442-356c8a99-4808-4e06-b973-fdcad81b1de5.png)

부모 노드의 키값이 자식 노드의 키값보다 항상 작거나 같은 힙

## 힙의 표현

힙은 완전이진트리이기 때문에 배열을 이용하여 표현했을 때 저장 공간의 낭비가 없다.

![image](https://user-images.githubusercontent.com/95271528/147762240-fe32580c-5f53-4b65-966a-00999da63f4c.png)

#### 인덱스 찾기

![image](https://user-images.githubusercontent.com/95271528/147762336-d884003b-f805-41c8-ad57-ed5dd2dae991.png)

어떤 노드의 인덱스가 i라고 했을 때, 그 노드의 왼쪽 자식 노드의 인덱스는 2i, 오른쪽 자식 노드의 인덱스는 2i+1이 된다.

## 삽인 연산

![image](https://user-images.githubusercontent.com/95271528/148056170-da40cdef-739d-4fa2-8d91-0aaf212b3c41.png)

+ 먼저 힙의 마지막에 노드를 삽입한다.
+ (최대 힙에서)새로운 노드가 부모 노드보다 큰 값을 가지면 교환한다.
  + 힙의 성질을 만족할 때까지 반복한다.

## 삭제 연산

![image](https://user-images.githubusercontent.com/95271528/148060704-ac40491e-cd44-4116-a143-fbd782d3994a.png)

![image](https://user-images.githubusercontent.com/95271528/148060724-2f629672-31a1-4666-9791-4027dee5b080.png)

![image](https://user-images.githubusercontent.com/95271528/148060892-ba2a4e4d-e1ef-4740-bcc7-f820eec7ec4e.png)

+ 힙에서 삭제 연산은 루트 노드를 삭제하는 것이며, 최대 힙에선 최대값이 삭제된다.
+ 힙의 마지막 노드를 루트 노드의 자리로 삽입한다.
+ 삽입한 노드와 자식 노드를 비교해서 자식 노드 중 더 큰 노드와 위치를 바꾼다.
  + 힙의 성질을 만족할 때까지 반복한다.

## 힙의 사용

+ 우선순위 큐를 구현할 때 적절한 자료구조이다.

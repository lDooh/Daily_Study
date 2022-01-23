# 트리 자료구조

![image](https://user-images.githubusercontent.com/95271528/147381591-7cf8c076-4935-45fc-a72a-afbf7ef4ec76.png)

각각의 노드가 0개 이상의 자식 노드를 가지며 계층 구조(hierarchical structure)를 구성하는 자료 구조

## 용어

![image](https://user-images.githubusercontent.com/95271528/147383611-4940b16f-092d-480b-960b-e50f00a2447e.png)

+ 간선(edge): 노드와 노드를 연결하는 선
+ 루트 노드(root node): 부모 노드가 없는 최상위 트리
+ 부모 노드(parent node)
+ 자식 노드(child node)
+ 형제 노드(sibling node): 부모 노드가 같은 노드들
+ 단말 노드(terminal node, leaf node): 자식 노드가 없는 노드, 잎 노드
+ 레벨(level): 트리의 각 층
+ 깊이(depth): 루트 노드 부터 해당 노드까지 거쳐야 하는 간선의 수
+ 높이(height): 가장 긴 깊이, 노드가 한 개 뿐인 단일 노드의 경우 높이가 0이다.
  + ~~서적이나 사이트마다 노드가 한 개인 이진 트리의 높이를 1로 정의하는 경우도 있다.~~
+ 차수(degree): 자식 노드의 수
+ 트리의 차수(degree of tree): 최대 차수

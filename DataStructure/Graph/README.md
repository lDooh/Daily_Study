# 그래프

정점(vertex)과 간선(edge)으로 이루어진 자료구조

## 용어

![image](https://user-images.githubusercontent.com/95271528/148647973-7255574c-080d-4830-bc92-ea5865b9c90f.png)

그래프 G = (V, E)
+ 정점(vertex): 데이터가 저장되는 노드
  + V(G): 그래프 G의 정점들의 집합
+ 간선(edge): 정점들을 연결하는 선으로, 링크(link)라고도 부름.
  + E(G): 그래프 G의 간선들의 집합
+ 인접 정점(adjacent vertex): 간선에 의해 직접 연결된 정점.
  + 위 그림에서 정점 2는 정점 1, 정점 3과 인접하다.
+ 차수(degree): 정점에 연결된 간선의 수
  + [무방향 그래프](#무방향-그래프undirected-graph)(G1)에선 해당 정점에 __인접__ 한 정점의 수가 차수가 된다. 그래프 G1에서 정점 1의 차수는 3.
    <br>모든 정점의 차수를 합하면 간선 수의 2배가 된다.
  + [방향 그래프](#방향-그래프directed-graph)(G2)에서
    + 진입 차수(in-degree): 외부에서 오는 간선의 수, 그래프 G2에서 정점 0의 진입 차수는 2.
    + 진출 차수(out-degree): 외부로 향하는 간선의 수, 그래프 G2에서 정점 0의 진출 차수는 1.
    <br>진입 차수와 진출 차수의 합이 간선의 수가 된다.
+ 경로(path): 한 정점에서 다른 정점으로 갈 수 있는 길
  + 그래프 G2의 정점 1에서 정점 2로 가는 경로는 <1, 0, 2>, <1, 3, 2>, <1, 3, 0, 2>가 있다.
+ 경로 길이(path length): 경로를 구성하는데 사용된 간선의 수
+ 단순 경로(simple path): 경로 중에서 반복되는 정점이 없는 경로
  + 사이클(cycle): 단순 경로 중에서 시작 정점과 종료 정점이 같은 경로

## 그래프의 종류

### 무방향 그래프(undirected graph)

![image](https://user-images.githubusercontent.com/95271528/148648153-e3d03799-0cb6-4a15-81e5-cc95a63af8eb.png)

+ 두 정점을 연결하는 간선에 방향이 없는 그래프
+ 간선 (A, B)와 (B, A)는 동일한 간선이다.

V(G1) = { 0, 1, 2, 3 }<br>
E(G1) = { (0, 1), (0, 3), (1, 2), (1, 3), (2, 3) }

### 방향 그래프(directed graph)

![image](https://user-images.githubusercontent.com/95271528/148648075-3c5fd4fd-7f01-4456-94e6-e80c1303335f.png)

+ 두 정점을 연결하는 간선에 방향이 존재하는 그래프
+ 그래프 G2에서 정점 0에서 정점 2로만 갈 수 있는 간선은 <0, 2>로 표기
  + <0, 2>와 <2, 0>은 다른 간선이다

V(G2) = { 0, 1, 2, 3 }<br>
E(G2) = { <0, 2>, <1, 0>, <1, 3>, <3, 0>, <3, 2> }

### 가중치 그래프(weighted graph)

![image](https://user-images.githubusercontent.com/95271528/148648245-b60a48ba-ca3b-42ee-8b24-c26df188e7a9.png)

+ 간선에 가중치나 비용이 할당된 그래프

### 완전 그래프(complete graph)

![image](https://user-images.githubusercontent.com/95271528/148648309-0750678b-8b84-44d7-a3f9-31960ab2bed4.png)

+ 모든 정점이 간선으로 연결된 그래프
  + 최대 간선수를 가진다.
+ 무방향 그래프의 정점이 n개이고, 완전 그래프라면 간선의 수는 n(n-1)/2개
  + 방향 그래프라면 n(n-1)개

### 연결 그래프(connected graph)

![image](https://user-images.githubusercontent.com/95271528/148648582-5cc09ac7-1679-4717-9ac0-37c6f36b2b07.png)

+ 임의의 두 정점 사이에 경로가 존재하는 그래프

### 부분 그래프(subgraph)

![image](https://user-images.githubusercontent.com/95271528/148648772-8761b58b-a1f8-40fc-ba42-89e843fcf148.png)

+ 그래프 G의 V(G)와 E(G)의 부분 집합으로 이루어진 그래프

### 트리(tree)

![image](https://user-images.githubusercontent.com/95271528/148758822-6aa9859c-de1a-418a-bb64-e667aefd09ab.png)

+ 사이클이 존재하지 않는 연결 그래프

## 연산
+ empty()<br>그래프가 비어 있다면 TRUE, 비어있지 않다면 FALSE 반환
+ insertVertex(v): 그래프에 정점 v를 삽입
+ deleteVertex(v): 그래프의 정점 v를 삭제
  + 정점을 삭제하면 정점과 연결된 간선도 모두 삭제해야 함.
+ insertEdge(u, v): 그래프에 간선 (u, v)를 삽입
+ deleteEdge(u, v): 그래프의 간선 (u, v)를 삭제
+ adjacent(v): 그래프의 정점 v의 모든 인접 정점 반환

## 그래프의 표현
### 인접 행렬(adjacency matrix) 이용

![image](https://user-images.githubusercontent.com/95271528/148682182-857e9c1f-8e3c-46ab-8532-1381688fc8ed.png)

+ 정점의 개수가 n개이면, n×n 형태의 2차원 배열을 이용하여 표현한다.
+ 간선 (i, j)가 존재하면 G[i][j] = 1, 존재하지 않으면 G[i][j] = 0.
+ 가중치 그래프에선 0과 1이 아니라 가중치나 비용을 저장한다.

### 인접 리스트(adjacency list) 이용

![image](https://user-images.githubusercontent.com/95271528/148683923-8908a36e-fe0c-4563-8b46-f70bb2528ae2.png)

+ 각 정점을 헤드 노드로 하고, 인접 정점들을 연결리스트를 이용해 연결하는 방식
+ 헤드 노드들은 배열을 이용해 관리
+ 연결 리스트의 정점들의 순서는 상관 없음
+ 정점의 수가 n개, 간선의 수가 e개인 무방향 그래프를 표현하기 위해선
  + n개의 연결 리스트, 2e개의 노드가 필요

### 인접 행렬의 장단점

n개의 정점을 가지는 그래프에서

#### 장점

+ 두 정점 사이에 간선이 존재하는지 여부를 조사하는 데 O(1)의 시간 복잡도를 가진다.
+ 정점의 차수를 구하는 연산의 시간 복잡도가 O(n)이다.
  + 인접 행렬의 행이나 열을 조사하면 됨.

#### 단점

+ 그래프의 전체 간선의 수를 알아내는 연산의 시간 복잡도가 O(n<sup>2</sup>)이다.
  + 인접 행렬 전체를 조사해야 함.

### 인접 리스트의 장단점

n개의 정점과 e개의 간선을 가지는 그래프에서

#### 장점

+ 메모리 공간의 낭비를 줄일 수 있다.
+ 그래프의 전체 간선의 수를 알아내는 데 O(n+e)의 연산이 필요하다.

#### 단점

+ 간선의 존재 여부나 정점의 차수를 구하는 연산에 정점 차수만큼의 시간이 필요하다.

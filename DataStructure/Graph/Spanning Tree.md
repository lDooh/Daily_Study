# 신장 트리

![image](https://user-images.githubusercontent.com/95271528/148762077-2c076534-79ba-4eac-ab33-3fffc2e875cd.png)

+ 그래프G의 모든 정점을 최소한의 간선을 이용하여 연결한 부분 그래프
+ 정점의 개수가 n개라면, 간선의 개수는 n-1개가 된다.
+ DFS, BFS를 이용하여 신장 트리를 구할 수 있다.

## 최소 신장 트리(MST, Minimum Spanning Tree)

![image](https://user-images.githubusercontent.com/95271528/148763885-5aefe7a5-56b8-442b-a77a-af77ec423b53.png)

+ 신장트리 중에서 가중치의 합이 가장 작은 신장트리
+ MST를 구하는 알고리즘
  + Kruskal 알고리즘
  + Prim 알고리즘

## Kruskal(크루스칼) Algorithm

+ 탐욕 알고리즘(greedy algorithm)을 이용하여, 작은 가중치를 가지는 간선부터 차례대로 선택해 신장 트리를 만드는 방법이다.

1. 그래프의 모든 간선을 가중치를 기준으로 오름차순으로 정렬
2. 사이클이 생기지 않도록 간선을 선택

#### 그래프의 모든 간선을 가중치를 기준으로 오름차순 정렬

![image](https://user-images.githubusercontent.com/95271528/148770418-c3642d0e-61ea-446b-8458-f3d3ededcc7a.png)

#### 간선 (B, E), (A, D), (A, B), (D, F), (B, C)를 차례대로 선택

![image](https://user-images.githubusercontent.com/95271528/148770905-c4ceb5c7-4c78-49f0-beb9-904e90a1adf2.png)

+ 간선 (C, G)를 선택하면 사이클이 형성되므로 선택하지 않음.

#### 같은 방법으로 간선 (B, D)는 선택하지 않고 간선 (E, F)선택

![image](https://user-images.githubusercontent.com/95271528/148771118-f9f4670f-84b5-4074-8629-69b7932d126f.png)

+ 6개의 간선 선택 완료, MST 완성

### Union-Find Algorithm

상호 배타적 집합, 서로소 집합(disjoint-set) 자료 구조라고도 부름.

+ 중복되는 원소(부분집합)가 없는 집합들
+ Kruskal Algorithm에서 사이클의 생성 여부를 판단할 때 사용할 수 있다.

![image](https://user-images.githubusercontent.com/95271528/150540438-8f4d9cf4-4f95-4ba9-b8d7-4fe30745b956.png)

+ 서로소 집합인 정점 2개를 연결하는 간선을 추가해도 사이클이 생성되지 않는다.

## Prim Algorithm

+ 하나의 정점에서부터 시작하여 트리를 확장해 나가는 방식

1. 정점을 하나 선택하여 트리를 만듦.
2. 트리의 정점들의 인접한 정점들 중에서 가장 낮은 가중치의 간선과 연결된 정점을 선택해 간선과 정점을 트리에 삽입.

#### 임의의 정점(A) 선택

![image](https://user-images.githubusercontent.com/95271528/150588719-f8b2ad8d-55fb-4a39-b132-a8f5c570c859.png)

#### 트리와 인접한 정점(B, D) 중에서 가중치가 가장 낮은 간선으로 연결된 정점(D) 선택

![image](https://user-images.githubusercontent.com/95271528/150588875-bcbb9a5a-8608-43ff-a97d-9a14a4f20661.png)

#### 트리와 인접한 정점(B, E, G) 중에서 가중치가 가장 낮은 간선으로 연결된 정점(B) 선택

![image](https://user-images.githubusercontent.com/95271528/150589566-5bdebb20-19f5-4f34-af80-e777bb8c54b7.png)

#### 트리와 인접한 정점(C, E, G) 중에서 가중치가 가장 낮은 간선(B, E)으로 연결된 정점(E) 선택

![image](https://user-images.githubusercontent.com/95271528/150589753-c22bb62f-4afa-4f55-bd0c-f11854bddda4.png)

#### 같은 방법으로 정점 G, C, F를 차례대로 선택

![image](https://user-images.githubusercontent.com/95271528/150590001-227abd2d-b35d-4850-889a-540b3b0b97fc.png)

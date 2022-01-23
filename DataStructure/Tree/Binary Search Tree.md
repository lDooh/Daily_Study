# 이진 탐색 트리, BST

![image](https://user-images.githubusercontent.com/95271528/147468532-1c5a1654-b962-41c2-bf42-e0b7e2acb38a.png)

정렬된 이진 트리로, 효율적인 탐색이 가능하다.
+ 중복된 값을 가지는 노드가 없다.
+ 왼쪽 서브 트리의 키들은 루트 노드의 키보다 작다.
+ 오른쪽 서브 트리의 키들은 루트의 노드의 키보다 크다.
+ 좌우 서브 트리도 모두 이진 탐색 트리이다.

## 이진 트리의 중위 순회(inorder traversal)

+ 이진 트리를 중위 순회(LVR)하면 오름차순으로 정렬된 결과를 얻을 수 있다.

## 삽입 연산

![image](https://user-images.githubusercontent.com/95271528/147478901-2410e8ab-25de-4569-9953-450cba15f1e7.png)

먼저 탐색 연산을 수행하고, 탐색이 성공하면 이미 중복되는 키가 있는 것이므로 삽입을 하지 않고, 탐색이 실패하면 실패한 위치에 새로운 노드를 삽입한다.

## 삭제 연산
삭제 연산은 세 가지 경우의 수를 고려해야 한다.
+ 삭제할 노드가 자식 노드가 없는 경우(단말(잎) 노드인 경우)
+ 삭제할 노드가 하나의 자식 노드를 가지고 있는 경우
+ 삭제할 노드가 두 개의 자식 노드를 가지고 있는 경우

### 1. 삭제할 노드가 자식 노드가 없는 경우(단말 노드인 경우)

![image](https://user-images.githubusercontent.com/95271528/147482406-b7113030-0243-4fc8-894f-69f529448060.png)

![image](https://user-images.githubusercontent.com/95271528/147482629-1595d7e1-0e1d-444d-9db4-c194774b0510.png)

단순히 해당 노드를 삭제하면 된다. 노드의 삭제는 부모 노드의 포인터 필드를 NULL로 만들면 된다.

### 2. 삭제할 노드가 하나의 자식 노드를 가지고 있는 경우

![image](https://user-images.githubusercontent.com/95271528/147483207-0abbaaf8-664d-4241-bfbe-6e26e5603953.png)

삭제할 노드의 자식 노드를 부모 노드에 연결한다.

### 3. 삭제할 노드가 두 개의 자식 노드를 가지고 있는 경우

![image](https://user-images.githubusercontent.com/95271528/147486161-860a565e-09c5-43bf-8639-a575c0eb8116.png)

![image](https://user-images.githubusercontent.com/95271528/147486173-72ade4e4-78a4-45bd-abf1-da1dc2d82038.png)

+ successor 노드를 찾는다.
  + 삭제할 노드와 가장 비슷한 값을 가지는 노드
  + 왼쪽 서브트리에서 가장 큰 값을 가지는(가장 오른쪽) 노드
  + 오른쪽 서브트리에서 가장 작은 값을 가지는(가장 왼쪽) 노드
+ successor 노드를 삭제할 노드로 복사한다.
+ successor 노드를 삭제한다.

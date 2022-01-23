## 이진 트리(Binary Tree)

![image](https://user-images.githubusercontent.com/95271528/147384323-2beb553a-2f7c-4eb1-a8c9-971e0924fcd1.png)

각 노드의 자식 개수가 최대 2개로 제한되는 트리 (차수가 최대 2)

## 이진 트리의 종류

### 정 이진트리(Full Binary Tree)

![image](https://user-images.githubusercontent.com/95271528/147385860-0747bf5e-ba68-4c93-b818-c0f6fc9c49f6.png)


모든 노드가 0개나 2개의 자식 노드를 가진다.

### 완전 이진트리(Complete Binary Tree)

![image](https://user-images.githubusercontent.com/95271528/147385839-b08e7654-bd8b-41ca-ac95-e33f220dd628.png)

높이가 h인 트리에서, 레벨 h까지는 포화 이진트리이고 레벨 h+1은 맨 왼쪽부터 자식 노드가 채워져 있다.

### 포화 이진트리(Perfect Binary Tree)

![image](https://user-images.githubusercontent.com/95271528/147385874-c2260477-58da-407c-bfe2-880f506bb8b6.png)

모든 말단(잎) 노드의 높이가 같고, 말단 노드를 제외한 모든 노드가 2개의 자식 노드를 가진다.

~~서적이나 사이트마다 정 이진트리와 포화 이진트리를 동일하게 정의하는 경우도 있다.~~

## 이진 트리의 속성
+ 이진 트리의 노드의 개수가 n개이면 간선의 개수는 n-1 개이다.
+ 포화 이진트리에서 노드의 개수는 2<sup>h+1</sup> - 1 개이다. (h: height)
  + 높이가 h인 이진 트리의 최대 노드 개수
+ 포화 이진트리에서 높이가 h라면 말단(잎) 노드의 개수는 2<sup>h</sup> 개이다.

## 이진 트리의 표현
### 배열 이용

![image](https://user-images.githubusercontent.com/95271528/147401901-bde686d4-9a7f-4807-aff8-727e3dfa8f5d.png)

어떤 노드의 인덱스가 i라고 했을 때, 그 노드의 왼쪽 자식 노드의 인덱스는 2i, 오른쪽 자식 노드의 인덱스는 2i+1이 된다.

![image](https://user-images.githubusercontent.com/95271528/147402084-0b515835-ede0-4998-8c0b-160f3f15be68.png)

배열을 이용해 이진 트리를 표현하는 경우, 완전 이진 트리가 아니면 공간의 낭비가 생긴다.

### 연결 리스트 이용

![image](https://user-images.githubusercontent.com/95271528/147402345-763f65ab-b741-4498-b03e-aaf92ab8107e.png)

(단순 연결 리스트)각 노드가 데이터 필드와 두 개의 포인터 필드로 이루어져, 각각의 포인터 필드가 왼쪽 자식 노드와 오른쪽 자식 노드의 주소를 저장한다.

## 이진 트리의 순회(traversal)

![image](https://user-images.githubusercontent.com/95271528/147403034-7432d80b-0d2a-4f91-8be1-cd8571bf36f7.png)

### 전위 순회(preorder): VLR
루트노드, 왼쪽 서브트리, 오른쪽 서브트리 순으로 방문

![image](https://user-images.githubusercontent.com/95271528/147403658-a3180af7-b511-415a-a92a-3ea550a8a2b3.png)

### 중위 순회(inorder): LVR
왼쪽 서브트리, 루트, 오른쪽 서브트리 순으로 방문

![image](https://user-images.githubusercontent.com/95271528/147403668-6cabbed3-70f7-4657-aca3-ddea7fde3334.png)

### 후위 순회(postorder): LRV
왼쪽 서브트리, 오른쪽 서브트리, 루트 순으로 방문

![image](https://user-images.githubusercontent.com/95271528/147403677-7bf3ca81-ffc9-475d-9cc3-22af00cd1d9b.png)

### 레벨 순회(level)
각 레벨별로 가장 왼쪽 노드부터 탐색

![image](https://user-images.githubusercontent.com/95271528/147403684-dbfb2905-a237-4d2c-b760-50f939678469.png)

## 수식 트리(Expression Tree)

![image](https://user-images.githubusercontent.com/95271528/147405351-fd4e0cb2-e2ec-4ca0-8d15-116353f9c61a.png)

두 개의 자식 노드는 피연산자, 부모 노드는 연산자로 이루어진 트리

+ 이 수식 트리를 전위 순회하면 전위 표기식(prefix notation)을 구할 수 있고, 중위 순회, 후위 순회를 하면 각각 중위 표기식(infix notation), 후위 표기식(postfix notation)을 얻을 수 있다.

|     전위 순회     |     중위 순회     |     후위 순회     |
| :---: | :---: | :---: |
|       +ab       |       a+b       |       ab+       |

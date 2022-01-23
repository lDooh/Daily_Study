# Stack 자료구조

![image](https://user-images.githubusercontent.com/95271528/146739180-587d8325-38ab-45eb-b7e2-4471f5a7f45e.png)

한쪽 끝에서만 삽입과 삭제가 가능한 선형 자료 구조로, 삭제를 할 때엔 가장 최근에 입력된 데이터가 삭제되는  __LIFO(Last-In First-Out)__ 구조다.

## 연산
+ empty()<br>스택이 비어있다면 TRUE, 비어있지 않다면 FALSE 반환
+ peek()<br>스택의 가장 윗 데이터를 삭제하지 않고 반환
+ pop()<br>스택의 가장 윗 데이터를 삭제하고 반환
+ push(e)<br>스택의 가장 위에 데이터 e 삽입

## 스택의 사용
+ 깊이 우선 탐색 (DFS, Depth First Search)
+ 프로그램에서 함수를 호출하고 복귀주소를 스택에 저장한다.
+ 문서 편집기에서 되돌리기(undo) 기능(Ctrl + Z)
+ 사람이 사용하는 중위 표기(infix notation)를 후위 표기(postfix notation)로 변환하고, 후위 표기를 계산할 때 사용
+ Youtube Music의 Play next 기능도 스택을 이용하는 것 같다.

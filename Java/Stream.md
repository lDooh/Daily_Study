# 스트림

```java
int[] array = { 1, 2, 3, 4, 5 };
		
// 배열 기반 스트림 생성
IntStream stream = Arrays.stream(array);
		
// 짝수만 필터링
stream.filter(n -> n % 2 == 0)
  .forEach(n -> System.out.print(n + "\t"));
		
// 원본 데이터에 영향을 주지 않음
System.out.println();
for (int n : array) {
  System.out.print(n + "\t");
}
		
System.out.println();
// 배열 기반 스트림 생성
Arrays.stream(array)
  .filter(n -> n % 2 != 0)	// 홀수만 필터링
  .map(n -> n * n)		// 중간 연산, 각 요소 제곱
  .forEach(n -> System.out.print(n + "\t"));
```

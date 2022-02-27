# [로그 메시지](https://developer.android.com/studio/debug/am-logcat)

+ `Log` 클래스를 사용하여 Logcat에 로그 메시지를 표시할 수 있다.

```java
  Log.d(tag, message);
```

### 자주 사용하는 로그 메서드

+ `Log.e(String, String)` (오류, error)
+ `Log.w(String, String)` (경고, warn)
+ `Log.i(String, String)` (정보, info)
+ `Log.d(String, String)` (디버그, debug)
+ `Log.v(String, String)` (상세, verbose), 가장 낮은 우선순위

### 우선순위
+ __V__ : 상세
+ __D__ : 디버그
+ __I__ : 정보
+ __W__ : 경고
+ __E__ : 오류
+ __A__ : 강제 종료, Assert

### 예시

+ 태그는 문자열 상수를 선언해서 사용하는 것을 권장.

```java
    private static final String DEBUG_TAG1 = "디버그 태그1";
    private static final String DEBUG_TAG2 = "디버그 태그2";
```

+ 버튼을 입력하면 로그 메시지를 출력하는 코드

```java
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Log.d(DEBUG_TAG1, "메시지msg"); }
        });
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Log.d(DEBUG_TAG2, "msgmsg"); }
        });
```

+ 하단의 `Logcat` 을 통해 로그 메시지 확인 가능

![image](https://user-images.githubusercontent.com/95271528/155885316-53b85ea7-9537-44d2-a25d-3cb31bfbfc05.png)

+ 필터를 적용하여 메시지 필터링 가능

![image](https://user-images.githubusercontent.com/95271528/155885403-d477705c-cb88-420b-b308-e6b79ec47885.png)

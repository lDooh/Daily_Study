# 안드로이드 스튜디오

잡다한것들

## [단축키](https://developer.android.com/studio/intro/keyboard-shortcuts?hl=ko)

### 메소드 오버라이딩

`Ctrl + O`

![image](https://user-images.githubusercontent.com/95271528/155769968-58a776ca-8534-4012-9eef-ce9ae67c666a.png)

### API 문서 보기

`Ctrl + Q`

![image](https://user-images.githubusercontent.com/95271528/155769716-92785ea2-9afd-4e9d-a0c6-9628d91eec32.png)
![image](https://user-images.githubusercontent.com/95271528/155769734-c7ea78f9-02f1-4abb-9c41-d546130c60b7.png)

### 매개변수 표시

`Ctrl + P`

![image](https://user-images.githubusercontent.com/95271528/155770057-2c0fba9d-c00f-4311-9fa1-a0cc89436a71.png)

## Sync Project with Gradle Files

+ 소스코드나 .gradle 파일 등을 수정했을 때 반드시 눌러주자.

![image](https://user-images.githubusercontent.com/95271528/154095574-1165c282-b0d9-47d3-96ed-fa8ba075dc07.png)

## Auto Import

![image](https://user-images.githubusercontent.com/95271528/154095760-1ca61261-d7e1-45e4-80a9-f6320cd6b293.png)

![image](https://user-images.githubusercontent.com/95271528/154096128-c8f0b574-828a-4d04-9811-74493e0c2eec.png)

## jcenter

+ build.gradle 파일에 `jcenter()`이 있다면 지우거나 `mavenCentral()`로 변경

```gradle
buildscript {
    repositories {
        google()
        mavenCentral()    // jcenter()
    }

...

allprojects {
    repositories {
        google()
        mavenCentral()    // jcenter()
    }
}
```

---

+ SDK 버전 관련 오류 발생 시 `app/build.gradle` 파일에서 다음 항목 수정

#### sdk 버전

```gradle
anrdoid {
  compileSdkVersion 31
  ...
  
  defaultConfig {
    ...
    targetSdkVersion 31
    ...
}
```

#### 빌드 종속 

```gradle
dependencies {
    implementation 'androidx.appcompat:appcompat:1.3.0'
    implementation 'com.google.android.material:material:1.4.0'
    ...
```

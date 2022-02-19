# 버튼에 이미지 넣기

## 이미지 파일 경로

+ 사용할 이미지를 `/app/src/main/res/drawable` 폴더에 삽입

![image](https://user-images.githubusercontent.com/95271528/154804916-70917593-6bab-44c8-b5af-7e0460848607.png)

+ 버튼의 `background` 속성에서 이미지 설정

![image](https://user-images.githubusercontent.com/95271528/154805676-1f3a60e2-2546-4d06-9355-f4ea16ef1ffc.png)

+ 기본 제공 아이콘들을 사용할 수도 있다.

## StateListDrawable

+ 버튼의 상태에 따라 다른 이미지 보여주기

```xml
<?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:state_pressed="true"
        android:drawable="@android:drawable/ic_lock_silent_mode" />
    <item android:drawable="@android:drawable/ic_lock_silent_mode_off" />
</selector>
```

+ 버튼이 눌렸을 땐 `@android:drawable/ic_lock_silent_mode` 이미지를 보여주고, <br>
버튼이 눌리지 않았을 땐 `@android:drawable/ic_lock_silent_mode_off` 이미지를 보여준다.

![image](https://user-images.githubusercontent.com/95271528/154806009-1a67f49e-12f4-4928-b209-8bb982bd9773.png) ![image](https://user-images.githubusercontent.com/95271528/154806042-48a656ca-9e49-4b2f-a0fd-d27f9c96bc0f.png)

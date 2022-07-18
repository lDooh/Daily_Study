# 안드로이드 스튜디오 딥링크

## Manifest에 intent-filter를 추가

```xml
    <activity
        android:name=".TestActivity"
        android:exported="true" >
        <intent-filter>
            <action android:name="android.intent.action.VIEW" />
            <category android:name="android.intent.category.DEFAULT" />
            <category android:name="android.intent.category.BROWSABLE" />

            <data
                android:host="deeplink"
                android:scheme="scheme" />
        </intent-filter>
    </activity>
```

`딥링크는 scheme://deeplink~ 형태`

## 터미널에서 딥링크 테스트

+ [ADB](https://github.com/lDooh/TIL/blob/master/Android%20Studio/ADB.md)가 설치되어 있어야 한다.

```
adb shell "am start -n com.example.test_app/.TestActivity -a android.intent.action.VIEW
```

+ 패키지 이름과 액티비티 이름은 프로그램에 알맞게 수정

---
reference

https://developer.android.com/training/app-links/deep-linking <br>
https://stackoverflow.com/questions/22767795/cannot-launch-activity-from-adb

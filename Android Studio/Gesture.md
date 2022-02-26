# [제스처](https://developer.android.com/training/gestures)

+ 스크롤, 튕기기, 두 번 탭하기 등의 동작을 제스처라 하고, 제스처를 통해 사용자가 앱과 상호작용할 수 있다.

+ `setOnTouchListener()` 메서드를 이용하여 터치 이벤트를 수신할 수 있다.

```java
        View view01 = findViewById(R.id.view01);
        view01.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                int action = event.getActionMasked();

                switch(action) {
                    case (MotionEvent.ACTION_DOWN):
                        Log.d(Gesture_TAG, "화면 누름");
                        return true;
                    case (MotionEvent.ACTION_MOVE):
                        Log.d(Gesture_TAG, "움직임");
                        return true;
                    case (MotionEvent.ACTION_UP):
                        Log.d(Gesture_TAG, "손가락 뗌");
                        return true;
                    case (MotionEvent.ACTION_CANCEL):
                        Log.d(Gesture_TAG, "제스처 중단");
                        return true;
                    case (MotionEvent.ACTION_OUTSIDE):
                        Log.d(Gesture_TAG, "터치가 UI를 벗어남");
                        return true;
                    default:
                        return true;
                }
            }
        });
```

![image](https://user-images.githubusercontent.com/95271528/155847340-7edb5ef6-af19-48f1-aec9-c40e0d8ba187.png)


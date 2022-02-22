# 다양한 위젯들

## 체크박스

+ 한 번에 여러 개를 선택할 수 있음

```xml
<CheckBox
        android:id="@+id/checkBox1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="체크박스1"
        android:textSize="20sp"
        android:onClick="onCheckboxClicked" />
```

```java
public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox)view).isChecked();

        if (checked) {
            Toast.makeText(getApplicationContext(), "체크됨", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(getApplicationContext(), "체크 해제됨", Toast.LENGTH_SHORT).show();
        }
    }
```

![image](https://user-images.githubusercontent.com/95271528/154976669-69b5b771-a19a-49cf-818e-e93857a61939.png) ![image](https://user-images.githubusercontent.com/95271528/154976698-85ba13cb-83e9-4cf6-889d-ff138c69cbab.png)

## 라디오 버튼

+ 라디오 그룹의 버튼들 중에서 한 개의 버튼 선택 가능

```xml
<RadioGroup
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">
        <RadioButton
            android:id="@+id/radioButton1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="라디오버튼1"
            android:onClick="onRadioButtonClicked" />
        <RadioButton
            android:id="@+id/radioButton2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="라디오버튼2"
            android:onClick="onRadioButtonClicked" />
        <RadioButton
            android:id="@+id/radioButton3"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="라디오버튼3"
            android:onClick="onRadioButtonClicked" />
    </RadioGroup>
```

``` java
public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton)view).isChecked();

        switch(view.getId()) {
            case R.id.radioButton1:
                if (checked) {
                    Toast.makeText(getApplicationContext(), "버튼1 선택", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.radioButton2:
                if (checked) {
                    Toast.makeText(getApplicationContext(), "버튼2 선택", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.radioButton3:
                if (checked) {
                    Toast.makeText(getApplicationContext(), "버튼3 선택", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
```

![image](https://user-images.githubusercontent.com/95271528/154977698-74f5621c-9248-4e2a-9176-d58e0a133ff9.png) ![image](https://user-images.githubusercontent.com/95271528/154977821-5d3026a5-0d55-42e0-885c-ecec5e9aabad.png)

## 토글 버튼

+ 두 가지 상태를 가지는 버튼이다.

```xml
<ToggleButton
        android:id="@+id/toggleButton1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="ToggleButton" />
```

```java
toggle1 = (ToggleButton)findViewById(R.id.toggleButton1);
        toggle1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getApplicationContext(), "On", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Off", Toast.LENGTH_SHORT).show();
                }
            }
        });
```

![image](https://user-images.githubusercontent.com/95271528/154979346-adb5d392-c74a-4f43-827b-0e4f0a5b6db0.png) ![image](https://user-images.githubusercontent.com/95271528/154979371-92313cc8-a349-422a-8d20-cb50bd44f26c.png)

+ `Switch`도 똑같은 방법으로 사용할 수 있다. (안드로이드 4.0이상에서)

```xml
<Switch
        android:id="@+id/switch1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Switch" />
```

![image](https://user-images.githubusercontent.com/95271528/154979618-c30e78d0-3f1e-440f-ac94-a4d2ed75f54a.png)

## 스피너

+ 값 집합에서 하나를 선택할 수 있도록 해준다.

```xml
    <Spinner
        android:id="@+id/spinner"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />
```

+ `string.xml`(문자열 리소스) 파일에 문자열 배열을 정의한다.

```xml
    <string-array name="spinner_array">
        <item>Mercury</item>
        <item>Venus</item>
        <item>Earth</item>
        <item>Mars</item>
        <item>Jupiter</item>
        <item>Saturn</item>
        <item>Uranus</item>
        <item>Neptune</item>
    </string-array>
```

```java
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinner_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                Toast.makeText(getApplicationContext(), getResources().getStringArray(R.array.spinner_array)[pos] + " 선택함", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();
            }
        });
```

![image](https://user-images.githubusercontent.com/95271528/155155400-9e857bcc-7bb8-49ae-ab6f-c2c13c592f24.png) ![image](https://user-images.githubusercontent.com/95271528/155155433-970f1b4c-2c63-4f17-995a-e6df99af8ecd.png)

![image](https://user-images.githubusercontent.com/95271528/155170879-4bf93b76-ce2e-4ce3-b72e-64df736fd3b6.png)



---
reference

[체크박스  |  Android 개발자  |  Android Developers](https://developer.android.com/guide/topics/ui/controls/checkbox?hl=ko)

[라디오 버튼  |  Android 개발자  | Android Developers](https://developer.android.com/guide/topics/ui/controls/radiobutton?hl=ko)

[전환 버튼  |  Android 개발자  | Android Developers](https://developer.android.com/guide/topics/ui/controls/togglebutton?hl=ko)

[스피너  |  Android 개발자  | Android Developers](https://developer.android.com/guide/topics/ui/controls/spinner?hl=ko)

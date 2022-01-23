# 파이썬으로 csv 파일 읽기 

```python
import csv

file = open("data_folder/Consumer_Price_Index.csv", "r", encoding="utf-8-sig")
data = csv.reader(file, delimiter=",")      # 구분자 기본값이 ',' 이므로 delimiter 인자는 생략 가능

header = next(data)     # 첫 번째 행은 헤더

print(header)
for row in data:
    print(row)

file.close()
```

<br>코드 3행의 __-sig__ 생략 시 아래 사진처럼 \ufeff 라는 문자열이 출력되는 경우가 있음

![image](https://user-images.githubusercontent.com/95271528/147828331-fe81ff23-4bef-415d-bd9a-1a9f34f2c5a1.png)


### 실행 결과

![image](https://user-images.githubusercontent.com/95271528/147828165-6297f68f-1604-45c4-817b-0303e58642af.png)
자료 출처: KOSIS(통계청, 소비자물가조사), 2021.12.31

+ 각 행이 리스트 형식으로 출력된다.


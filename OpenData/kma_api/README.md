# 기상청 API 활용 

![image](https://user-images.githubusercontent.com/95271528/149320489-3e45b8b2-22b5-47fa-b35f-fe97f4d8ddd3.png)

---

![image](https://user-images.githubusercontent.com/95271528/149324451-651c6f5d-60a2-4f8b-a68a-0c2856c0f3dd.png)

+ `일반 인증키 (Encoding)`의 경우엔 '%' 문자때문에 코드상에서 에러가 발생하므로 `일반 인증키 (Decoding)` 사용

## 샘플 코드
+ [상세정보 페이지](https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15084084)에서 제공
```python
import requests

url = 'http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst'
params ={'serviceKey' : '서비스키', 'pageNo' : '1', 'numOfRows' : '1000', 'dataType' : 'XML', 'base_date' : '20210628', 'base_time' : '0600', 'nx' : '55', 'ny' : '127' }

response = requests.get(url, params=params)
print(response.content)
```
+ url은 `http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/` 뒤에 자신이 원하는 기능에 해당하는 문자열을 넣으면 된다.
  + 해당 오픈API 활용가이드에 상세기능 목록이 명시되어 있음.
  + 샘플코드의 `getUltraSrtNcst`는 초단기실황조회
+ base_date - 최근 1일간의 정보만 제공하므로 오늘 날짜(yyyymmdd)를 전달하도록 해야 함.

## 미리보기

![image](https://user-images.githubusercontent.com/95271528/149335393-63fb14eb-f53d-45d3-a702-be9101c08d46.png)

---

![image](https://user-images.githubusercontent.com/95271528/149335525-be7d95d8-6ab5-4913-834b-2535e125297a.png)

#### 첫 번째 \<item\> 태그 해석

+ baseDate: 발표일자
+ baseTime: 발표 시간
  + 0200, 0500, 0800, 1100, 1400, 1700, 2000, 2300 (1일 8회)
+ category: TMP는 1시간 기온 (활용 가이드 16쪽 참조)
+ fcstDate: 예보일자
+ fcstTime: 예보시간
+ fcstValue: 예보 값
+ nx, ny: 예보지점 좌표

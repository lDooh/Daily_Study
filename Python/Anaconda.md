# 아나콘다
데이터 분석이나 머신러닝에 필요한 패키지들을 기본적으로 포함하고 있는 파이썬 배포판

## VSC에서 아나콘다 사용
아나콘다 설치<br><br>

```cmd
conda craete -n tmpenv python=3.8
```
tmpenv라는 이름의 가상환경 만듦<br><br>

+ VSC에서 Ctrl + Shift + P
+ python select interpreter 입력

![image](https://user-images.githubusercontent.com/95271528/147826574-85c8c232-6d46-4d34-b3d2-d3ec8cc4e986.png)

+ tmpenv 가상환경 선택

![image](https://user-images.githubusercontent.com/95271528/147826602-2e40c94e-c700-4688-b6f6-eeed40992014.png)
--
+ 다시 한 번 Ctrl + Shift + P
+ terminal select default profile 입력

![image](https://user-images.githubusercontent.com/95271528/147826658-55b35d25-abc2-4a0c-a808-4a7769b320bc.png)

+ Command Prompt 선택

![image](https://user-images.githubusercontent.com/95271528/147826696-94175c68-c9ef-4cac-bda7-80a211668aac.png)



# 기본 명령어들

```cmd
conda --vesion
```
아나콘다의 버전 확인<br><br>

```cmd
conda info
```
설치된 아나콘다의 정보 출력<br><br>

```cmd
conda update conda
```
conda를 최신 버전으로 업데이트<br><br>

```cmd
conda install -n [패키지 이름](=버전) []() []() ...
```
패키지 설치<br><br>

```cmd
conda remove -n [패키지 이름]
```
패키지 삭제<br><br>

```cmd
conda list
```
설치된 패키지 목록 출력<br><br>

```cmd
conda search [패키지 이름]
```
패키지가 설치되어 있는지, 어떤 버전인지 확인<br><br>

```cmd
conda create -n [가상환경 이름] python=3.8 anaconda
```
파이썬 3.8 버전을 사용하는 가상환경 생성
마지막 anaconda는 anaconda 패키지와 함께 생성한다는 것을 의미<br><br>

```cmd
activate [가상환경 이름]
rem source activate [가상환경 이름]
deactivate [가상환경 이름]
```
가상환경 활성화/비활성화<br><br>

```cmd
conda env list
conda info --env
```
가상환경 목록 확인<br><br>

```cmd
conda env remove -n [가상환경이름]
```
가상환경 삭제

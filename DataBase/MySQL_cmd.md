# cmd 창에서 MySQL 접속

## 환경변수 설정

+ `환경 변수` - `시스템 변수` - __Path__ 에 경로 추가

![image](https://user-images.githubusercontent.com/95271528/151558558-0b4fd82e-abb3-4b33-88b8-dd5f84acac98.png)

## MySQL 접속

 + 아래 코드 입력 후 비밀번호 입력
 
```cmd
mysql -u [username] -p;
```

### 데이터베이스 목록 출력

```cmd
show databses;
```

### 데이터베이스 생성

```cmd
create database [databasename];
```

### 데이터베이스 사용

```cmd
use [databasename];
```

### 전체 테이블 출력

```cmd
show tables;
```

### 테이블 생성
```cmd
create table employee(
ID varchar(7),
name varchar(10),
age int,
primary key(ID));
```

![image](https://user-images.githubusercontent.com/95271528/151567005-3b397f4a-4670-40a1-a3f6-53cc1cbeac59.png)

### 테이블 Describe

```cmd
desc [tablename];
```

![image](https://user-images.githubusercontent.com/95271528/151567099-1234f4c2-e5f6-4697-9b9a-ec752b53f90c.png)

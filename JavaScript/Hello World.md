# 자바스크립트 출력

## alert() 메서드

+ 브라우저와는 별도의 대화 상자를 띄워 사용자에게 데이터를 전달해 준다.

```html
  <script>
    function alertDialog() {
    alert("Hello World!");
    }
  </script>
```

![image](https://user-images.githubusercontent.com/95271528/156000993-e4116f1d-ad96-442d-a66c-380223be1288.png)

## HTML DOM 요소를 이용한 innerHTML 프로퍼티

+ `document` 객체의 `getElementByID()` 나 `getElementsByTagName()` 등의 메서드를 사용하여<br>HTML 요소의 내용(content)이나 속성(attribute)값 등을 손쉽게 변경할 수 있다.

```html
  <p id="text">바뀌기 전 문장</p>

  <script>
    var str = document.getElementById("text");
    str.innerHTML = "바꾼 후 문장";
  </script>
```

## document.write() 메서드

+ 웹 페이지가 로딩될 때 실행되면, 웹 페이지에 가장 먼저 데이터를 출력한다.<br>따라서 대부분 테스트나 디버깅을 위해 사용된다.

```html
  <script>
    document.write("Hello World!");
  </script>
```

## console.log() 메서드

+ 웹 브라우저의 콘솔을 통해 데이터를 출력해 준다.

```html
  <script>
    console.log("Hello World!");
  </script>
```

![image](https://user-images.githubusercontent.com/95271528/156004517-e4de0e33-c47e-4376-912d-91493b9fa827.png)

---

reference

http://www.tcpschool.com/javascript/js_intro_output

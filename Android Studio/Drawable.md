# 드로어블

+ 드로어블을 이용해 이미지를 그릴 수 있다.

### 드로어블 종류

#### Bitmap Drawable

+ 비트맵 그래픽 파일(.png, .jpg, .gif)을 이용해 drawable 생성

#### Nine Patch Drawable

+ 해상도가 바뀌어도 이미지가 깨지지 않도록 확장 가능한 영역을 포함한 PNG 파일, 확장자는 `.9.png`

#### Layer Drawable

+ 다른 드로어블로 구성된 배열을 관리하는 드로어블 객체, 목록에 포함된 각 드로어블은 목록에 나열된 순서대로 그려짐

#### State List Drawable

+ 상태별로 다른 비트맵 그래픽을 참조(버튼이 눌렸을때 다른 이미지를 사용하는 등)하는 drawable 생성

#### Level List Drawable

+ 대체 드로어블의 수를 관리하는 드로어블

#### Transition Drawable

+ 두 개의 드로어블 리소스를 서로 전환할 수 있는 드로어블 객체

#### Inset Drawable

+ 지정된 거리만큼 다른 드로어블을 인셋

#### Clip Drawable

+ 드로어블의 현재 레벨을 기준으로 다른 드로어블을 클립

#### Scale Drawable

+ 현재 레벨을 기준으로 다른 드로어블의 크기를 변경

#### Shape Drawable

+ 색상과 그라데이션을 포함하여 기하학적 모양을 정의

---

reference: https://developer.android.com/guide/topics/resources/drawable-resource

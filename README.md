## ⊙ 물류 최적화 프로그램(ERP)

> #### 팀원
- 김재홍(<a href="https://blog.daum.net/eeetaa" target="_blank"><img src="https://img.shields.io/badge/Duam-003E54?style=flat-square&logo=Devpost&logoColor=white"/></a>) : 공간사업관리 
- 이상현(<a target="_blank"  href="https://deww.tistory.com"><img src="https://img.shields.io/badge/Tistory-F64935?style=flat-square&amp;logo=Thumbtack&amp;logoColor=white"/></a>) : 재무관리
- 이은빈(<a href="https://blog.naver.com/leb4610" target="_blank"><img src="https://img.shields.io/badge/Naver-03C75A?style=flat-square&logo=Naver&logoColor=white"/></a>) : 계약관리
- 송아현(<a href="https://blog.naver.com/girlish_1" target="_blank"><img src="https://img.shields.io/badge/Naver-03C75A?style=flat-square&logo=Naver&logoColor=white"/></a>) : 회원관리
- 김지원(
<a href="https://blog.naver.com/dnjsrlawl_" target="_blank"><img src="https://img.shields.io/badge/Naver-03C75A?style=flat-square&logo=Naver&logoColor=white"/></a>) : 배송통합관리
- 오한수(
<a href="https://tidy-ship-234.notion.site/Hansoo-Oh-32e36f118afe43e7b2634f1c59865c37" target="_blank"><img src="https://img.shields.io/badge/Notion-000000?style=flat-square&logo=Notion&logoColor=white"/></a>) : 상품관리

> #### 프로젝트 목적

: 물류 자동화로 변해가는 시장흐름에 맞춰, 중소기업들이 변화된 물류 환경에 적응해 나가기 위한 프로세스를 제공함

> #### 프로젝트 기대효과 
- 입출고 검수 강화를 통해 재고 오차범위를 최소화한다
- 체계적이고 안정적인 물류 시스템을 통해 유통업체의 경쟁력 확보 및 운영비 절감
- 직관적인 UI 사용으로 접근성 향상

> #### 개발과정

: 시스템 구조도 작성, 기능 정의, 상세자료입력, 테이블 스키마, ERD 작성, UI 설계, 네이밍 규칙, 구현, 배포

> #### 프로젝트 기능   


▶오한수
- 카테고리 관리
  - 상품을 분류할 때 사용하는 카테고리를 CRUD를 할 수 있는 기능
- 상품 관리
  - 사용자가 다루는 상품에 대한 정보들을 CRUD 할 수 있는 기능
- 입고 관리
  - 입고요청
    - 입고에 필요한 정보를 기입
  - 입고승인<br>
    - 들어온 입고 요청 현황을 확인하고 승인 혹은 반려처리
    - 들어온 입고 요청 현황을 알 수 있는 실시간 알림기능
  - 입하검수<br>
    - 입고 승인된 상품들 중 입하검수 등록 현황을 한눈에 볼 수 있음
    - 입하검수와 관련된 정보들의 CRUD를 관리
  - 입고
    - 입고와 관련된 상품들을 조회하는 기능
  - 재고 등록
    - 입고등록된 상품을 바로 재고등록 처리하는 기능
- 재고 관리
  - 재고
    - 재고와 관련된 내용을 CRD 할 수 있는 기능
  - 간단조회
    - 상품명을 기준으로 회사별 재고량을 확인하는 기능
  - 상세조회
    - 로케이션을 기준으로 회사별 재고량을 확인하는 기능
- 출고 관리
  - 출고요청
    - 출고에 필요한 정보를 기입
  - 출고승인
    - 들어온 출고 요청 현황을 확인하고 승인 혹은 반려처리
    - 들어온 출고 요청 현황을 알 수 있는 실시간 알림기능
  - 출하검수
    - 출고 승인된 상품들 중 출하검수 등록 현황을 한눈에 볼 수 있음
    - 출하검수와 관련된 정보들의 CRUD를 관리 
  - 출고
    - 출고와 관련된 상품들을 조회하는 기능

> #### 개발환경 
- Language : Java, JavaScript(JQuery : jquery-3.6.0), HTML, CSS<br>
- DB : MySQL<br>
- DB관리툴 : HeidiSQL 10.1.0.5464<br>
- 서버 : apache - 9.0.1<br>
- WAS : Tomcat - 9.0.1<br>
- 협업툴 : GitHub, google공유드라이브, ERDCloud<br>
- 프레임워크 : Eclipse Oxygen.1a Release (4.7.1a), STS4 4.2.1, springframework 5.3.7, spring-webmvc 5.3.7, Maven, mybatis-3.5.6, mybatis-spring 2.0.6, bootstrap 
  API : jackson.core 2.11.4, spring-jdbc-5.3.7, mysql-connector-java 8.0.25 , log4j 2.13.3, thymeleaf-3.0.12, jstl 1.2


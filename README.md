# kosa_spring_mvc

Using Spring MVC in 2024  
📌: KOSA 전자정부 표준 프레임워크 기반 공공프로젝트 개발 전문가 양성과정 - Spring MVC 실습 코드 모음

[![Last Commit](https://img.shields.io/github/last-commit/GuideCode/kosa_spring_mvc)](https://github.com/GuideCode/kosa_spring_mvc/commits/main)

## 🚀 Introduction
KOSA 전자정부 표준 프레임워크 기반 공공프로젝트 개발 전문가 양성과정에서 진행한 Spring MVC 실습 프로젝트 모음입니다. 스프링 프로젝트 초기 설정부터 게시판 CRUD, 댓글, AOP, 파일 업로드까지 단계별로 기능을 확장하며 학습한 과정을 담고 있습니다.

---

## ✨ Features

* 📂 **단계별 실습 프로젝트 구조**
  `ex00`부터 `ex06`까지 번호 순서대로 기능을 확장해가며 학습 (각 폴더는 독립된 Maven 프로젝트)

* 🌱 **Spring 프로젝트 초기 설정**
  루트 컨텍스트 구성, MyBatis 연동(`TimeMapper`), DI 기본 예제(`Chef`, `Restaurant`) (`ex00`)

* 🎯 **Spring MVC 기본 & 파라미터 바인딩**
  `SampleController`, `SampleDTO`를 통한 요청 파라미터 처리와 뷰 연동 실습 (`ex01`)

* ⚠️ **예외 처리**
  `@ControllerAdvice`를 활용한 공통 예외 처리와 커스텀 404 페이지 구현 (`ex02`)

* 📋 **게시판 CRUD & 페이징**
  `BoardController`, `BoardMapper`, `Criteria`/`PageDTO`를 활용한 게시판 등록/조회/페이징 처리, 관리자 템플릿 UI 적용 (`ex03`)

* 💬 **댓글(Reply) 기능**
  게시글에 대한 댓글 등록/조회 기능과 댓글 페이징 처리 추가 (`ex04`)

* 🔍 **AOP & 트랜잭션 관리**
  `LogAdvice`를 통한 관점 지향 프로그래밍(AOP)과 `SampleTxService`를 통한 트랜잭션 처리 실습 (`ex05`)

* 📎 **파일 업로드**
  `UploadController`, `AttachFileDTO`를 활용한 Ajax 기반 파일 업로드 및 게시글 첨부파일 처리 (`ex06`)

* 🖥️ **Tomcat 서버 설정**
  로컬 Tomcat 9.0 서버 구동을 위한 설정 파일 모음 (`Servers`)

---

## 📂 Folder Structure

```plaintext
kosa_spring_mvc/
├── ex00/    # 프로젝트 초기 설정 & MyBatis 연동
├── ex01/    # Spring MVC 기본 & 파라미터 바인딩
├── ex02/    # 공통 예외 처리
├── ex03/    # 게시판 CRUD & 페이징
├── ex04/    # 댓글 기능
├── ex05/    # AOP & 트랜잭션 관리
├── ex06/    # 파일 업로드
└── Servers/ # Tomcat 서버 설정
```

각 `exXX` 프로젝트는 아래와 같은 공통 Maven 구조를 따릅니다.

```plaintext
exXX/
├── pom.xml
└── src/
    ├── main/
    │   ├── java/org/zerock/       # Controller, Service, Mapper, Domain
    │   ├── resources/
    │   └── webapp/
    │       └── WEB-INF/
    │           ├── spring/         # root-context.xml
    │           ├── views/          # JSP
    │           └── web.xml
    └── test/
```

---

## 🛠️ Built With

* **Language**: Java
* **Framework**: Spring Framework (Spring MVC), MyBatis
* **Build Tool**: Maven
* **View**: JSP
* **Server**: Apache Tomcat 9.0
* **IDE**: Eclipse (Spring Tool Suite 기반)

---

## 📧 Contact

* **Name**: Eunseo Yu
* **E-mail**: [eunseoyu0825@gmail.com](mailto:eunseoyu0825@gmail.com)
* **GitHub**: [221B0825](https://github.com/221B0825)

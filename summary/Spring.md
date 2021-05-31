# Spring
---

## IoC/DI
- `IoC`(Inversion Of Control)
  - 개발자에서 프레임워크로 제어의 객체 관리 권한이 넘어 갔음 = __제어의 역전__

- `DI`(Dependency Injection)
  - 의존성으로부터 격리시켜 코드 테스트에 용이
  - DI를 통해 불가능한 상황을 Mock과 같은 기술을 통해 안정적 테스트 가능
  - 코드 확장, 변경 시 영향 최소화
  - 순환 참조 방지


## AOP(Aspect Oriented Programming)
- __관점지향 프로그래밍__
  - `Web Layer`: REST API 제공, Client 중심의 로직 적용
  - `Business Layer`: 내부 정책에 따른 logic 개발, 해당 부분 개발
  - `Data Layer`: 데이터 베이스 및 외부와의 연동 처리

- 주요 Annotation
  Annotation|의미
  --|--
  `@Aspect`|자바에서 널리 사용하는 AOP 프레임워크에 포함 / AOP를 정의하는 Class에 할당
  `@Pointcut`|기능을 어디에 적용시킬지 / AOP를 적용 시킬 지점 설정
  `@Before`|메소드 실행하기 이전
  `@After`|메소드 성공적으로 실행 후, 예외가 발생하더라도 실행
  `@AfterReturning`|메소드 호출 성공 실행 시(Not Throws)
  `@AfterThrowing`|메소드 호출 실패 예외 발생(Throws)
  `@Around`|Before / after 모두 제어
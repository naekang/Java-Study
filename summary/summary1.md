# Spring Boot 
---

## 정리
구분|의미|CRUD|멱등성|안정성|Path Variable|Query Parameter|DataBody
--|--|--|--|--|--|--|--
GET|리소스 취득|R|O|O|O|O|X
POST|리소스 생성, 추가|C|X|X|O|▲|O
PUT|리소스 갱신, 생성|C/U|O|X|O|▲|O
DELETE|리소스 삭제|D|O|X|O|O|X
HEAD|헤더 데이터 취득|-|O|O|-|-|-
OPTIONS|지원하는 메소드 취득|-|O|-|-|-|-
TRACE|요청메시지 반환|-|O|-|-|-|-
CONNECT|프록시 동작의 터널 접속으로 변경|-|X|-|-|-|-


## 많이 사용하는 Annotation
- `@RestController`: Rest API 설정
- `@RequestMapping`: 리소스 설정(method로 구분 가능)
- `@PostMapping`: Post Resource 설정
- `@RequestBody`: Request Body 부분 Parsing
- `@PathVariable`: URL Path Variable Parsing
- `@JsonProperty`: Json naming
- `@JsonNaming`: class Json naming

- `@PutMapping`: Put Resource 설정
- `@RequestBody`: Request Body 부분 Parsing
- `@PathVariable`: URL Path Variable
SHOW databases;
-- 하이픈2개 : 한줄 주석
# : 한줄 주석  
/*여러줄 주석*/
-- 화면 확대/축소 : ctrl + 마우스휠	/ ctrl + (+/-)
-- ctrl + 엔터 : 커서 위치에 있는 sql 실행


/*
	컴퓨터
		1. 0,1 : 기계어, 2진 코드, 2진수
		2. 자료[데이터] : 01010101 이용한 데이터 저장
        3. 데이터 정리 저장소[표] --> 데이터베이스 : 자료들의 모임
        4. DB 조작 --> DBMS : 데이터베이스 관리 시스템
        5. DBMS 관리자 --> DBA : 데이터베이스 관리자
        
        컴퓨터[0,1]	<--------- DBMS	<----------------DBA
			DB[ 표 ]			1. MYSQL				1.관리자[본인]
							2. 
		6. 용어
			table 테이블 = 표
            record = 행, 가로 , 튜플
            field = 열, 세로 , 속성
            
		7. 목적
			1. 영구 저장
				컴퓨터 저장소 [ 메모리 ]
					1. RAM : 주 기억장치
						* 현재 실행중인 메모리 [ 휘발성 ]
                        1. JVM
                    2. ROM : 보조 기억장치
						* 영구 저장 [ 비휘발성 ]
						1. 데이터베이스
				* 바둑 게임 설치
					1. 설치 한 모든 파일은 c드라이브 [ 보조기억장치 ]
                    2. 바둑 게임 실행 [ 보조기억장치에서 실행한 만큼 필요한 데이터 -> 주기억장치 ]
                    
			2. 동시 공유
            3. 관리가 편하다. [ 빅데이터, 통계 등 ]
				- 가계부 [ 사람 ]
					날짜		내용		가격
                    9/13	커피		2000
                    9/20	스무디	1500
				- 가계부	[ 컴퓨터 ]
					9/13			2000
							커피		9/20		1500 
					1500			스무디
				- 가계부 [ 컴퓨터 DB 적용 ]
					날짜		내용		가격
                    9/13	커피		2000
                    9/20	스무디	1500

*/

/*
	1. 데이터베이스 생성
		1. MYSQL
			1. 왼쪽 메뉴 -> Schemas
            2. 메뉴 빈 공간 오른쪽 클릭 -> Create Schemas
            3. db 이름 작성 후 -> APPLY
		2. 코드 작성
			create database db이름 ;
	2. 테이블 생성[p.71]
		1. MYSQL
			1. 왼쪽 메뉴 -> 해당 스키마의 TABLES 오른쪽 클릭 -> CREATE TABLE
            2. 테이블 이름과 필드명과 속성 설정 후에 Apply
	2. 코드 작성
		CREATE TABLE DB명.테이블명( 필드명 자료형[데이터타입] 속성, 
			필드2 자료형 속성, 
			필드3 자료형 속성 );			->  마지막은 , X
	3.테이블 확인
		1. MYSQL
			1. 해당 테이블 오른쪽 클릭
		2. 코드 작성
			SELECT * FROM 테이블명;
	4. 테이블에 데이터 입력하기
		1. MYSQL
			1. 해당 테이블을 오른쪽 클릭 -> SELECT ROWS
            2. 테이블에 직접 입력 -> apply
		2. INSERT INTO DB명.테이블명 VALUES( 값1, 값2, 값3 );
	5. 테이블 데이터 수정하기 [ p. 78 ]
		1. 해당 테이블 오른쪽 클릭 -> SELECT ROWS
        2. 테이블 직접 수정
	6. 테이블 데이터 삭제하기 [ p.79 ]
		1. MYSQL
			1. 해당 테이블을 오른쪽 클릭 -> SELECT ROWS
            2. 테이블 내 삭제할 행[레코드] 우클릭 -> DELETE ROWS 클릭 -> APPLY
    
*/

/*
	SQL [ 명령어 ]
		1. DDL : Data Definition : 데이터베이스 정의어[만들기]
				1. CREATE : 데이터베이스 DB / TABLE / 뷰 등을 생성할 때 사용
						EX) CREATE TABLE 가계부();
				2. ALTER : 데이터베이스 DB/테이블/뷰 등 수정할 때 사용
						ALTER TABLE 가계부();
                3. DROP : 데이터베이스 DB/테이블/뷰 등 삭제
						DROP TABLE 가계부();
                4. RENAME : 데이터베이스 DB/테이블/뷰 등 이름 변경
                5. TRUNCATE : 선택한 DB/테이블/뷰 데이터 초기화
                
                
        2. DML : Data Manipulation L : 데이터베이스 조작어
				1. SELECT : 표 출력
						SELECT 필드명 FROM 테이블명
                2. INSERT : 레코드 추가
						INSERT INTO 테이블명 VALUES(데이터1, 데이터2, 데이터3);
                3. UPDATE : 값 수정
						UPDATE 테이블명 SET 필드명 = 새로운 데이터
                4. DELETE : 레코드 삭제
						 DELETE FROM 테이블명 WHERE 조건
				
        3. DCL : Data Control L : 데이터베이스 제어어
				1. GRANT : 데이터베이스 계정에 권한 부여 [ROLE 부여]
                2. REVOKE : 데이터베이스 계정에 권한 해제 [ROLE 제거]
                
        4. TCL : Transation Control L : 트랜잭션 제어어
				1. COMMIT		: 작성된 SQL 실행 [ apply ]
                2. ROLEBACK		: 작성된 SQL 취소
                3. SAVEPOINT	: 작성된 SQL에 이름 지정




*/

CREATE DATABASE shop_db2;

CREATE TABLE shop_db2.MEMBER(	
    member_ID CHAR(8) PRIMARY KEY not null ,
    member_name char(5) not null,
    mamber_addr char(20)    
);

SELECT * FROM shop_db.member;
SELECT * FROM shop_db2.member;

INSERT INTO shop_db2.member values('tess' , '나훈아', '경기 부천시 중동');
INSERT INTO shop_db2.member values('hero' , '임영웅', '어디사는지 알바냐');
INSERT INTO shop_db2.member values('eight' , '아이유', '사랑합니다');
INSERT INTO shop_db2.member values('swing' , '박진영', '릴라형');

-- 데이터 수정

UPDATE shop_db2.member SET mamber_addr = '경기 안산시 상록구 이동' where member_id = 'TESS';

-- 데이터 삭제

DELETE FROM shop_db2.member WHERE member_ID = 'tess' ;



create database shop_db3;

/* db 선택 */
use shop_db3; 

create table shop_db3.member(
	member_id char(8) primary key not null, 
    member_name char(5) not null,
    member_addr char(20)
);

SELECT * FROM shop_db3.member;

/* 테이블 확인 */
select * from member;

/* 4 테이블에 데이터 추가 */

/* 5 제품 테이블 생성 */

create table product(
	product_name char(4) primary key not null,
    -- 필드명 char : 문자(4글자) primary key : 식별키 not null : 공백 불가
    cost int not null,
    make_date date ,
    company char(5),
    amount int not null
);

/* 7. Select */
select * from member;
select member_id from member;
select member_id, member_name from member;
select member_id, member_name, member_addr from member;
select member_id as 아이디 from member; -- as : 별칭 [ 원본수정 x, 출력만 다르게 ]
select member_id as 아이디, member_name as 이름, member_addr as 주소 from member;
select * from member where member_id ='팔레트' ;


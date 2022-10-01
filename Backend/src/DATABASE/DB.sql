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
						EX1) ALTER TABLE 테이블명 ADD COLUMN 필드명 데이터타입 제약조건
						EX2) ALTER TABLE 테이블명 MODIFY COLUMN 필드명 새로운타입 새로운 제약조건
						EX3) ALTER TABLE 테이블명 CHAGE COLUMN 기본필드명 NEW필드명 NEW타입 NEW제약조건
						EX4) ALTER TABLE 테이블명 RENAME COLUMN 기존필드명 TO NEW필드명
						EX5) ALTER TABLE 테이블명 DROP COLUMN 필드명
						
						[제약조건 수정]
						EX6) ALTER TABLE 테이블명 ADD CONSTRAINT 제약조건명 제약조건[EX) PK,FK]
							 ALTER TABLE 테이블명 DROP COLUMN
						
                3. DROP : 데이터베이스 DB/테이블/뷰 등 삭제
						DROP TABLE 가계부();
                4. RENAME : 데이터베이스 DB/테이블/뷰 등 이름 변경
                5. TRUNCATE : 선택한 DB/테이블/뷰 데이터 초기화
               
               -constraint 제약조건명 [ ex)pk, fk ] 필드명 references 기준테이블
                
        2. DML : Data Manipulation L : 데이터베이스 조작어
				1. SELECT : 표 출력
						SELECT 필드명 FROM 테이블명
							ㄴ 테이블명, 테이블명2 ... 테이블 2개 이상 검색 가능
							ㄴ 2개 이상 검색하는 경우 조건식을 통해 필요한 값을 지정해줘야 불필요한 데이터가 출력되지 않는다							
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



	*char -> 고정길이 // varchar -> 가변길이 (메모리 할당 차이)


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


drop database market_db;
drop database if exists market_db;

create database market_db;

use market_db;

create table member (						-- (필드명 자료형 속성)
	mem_id	char(8) not null primary key,
    mem_name varchar(10) not null,
    mem_number int not null,
    addr char(2) not null,
    phone1 char(3),
    phone2 char(8),
    height smallint,
    debut_date date
);

select * from member;

INSERT INTO member VALUES('TWC', '트와이스', 9, '서울', '02', '11111111', 167, '2015.10.19');
INSERT INTO member VALUES('BLK', '블랙핑크', 4, '경남', '055', '22222222', 163, '2016.08.08');
INSERT INTO member VALUES('WMN', '여자친구', 6, '경기', '031', '33333333', 166, '2015.01.15');
INSERT INTO member VALUES('OMY', '오마이걸', 7, '서울', NULL, NULL, 160, '2015.04.21');
INSERT INTO member VALUES('GRL', '소녀시대', 8, '서울', '02', '44444444', 168, '2007.08.02');
INSERT INTO member VALUES('ITZ', '잇지', 5, '경남', NULL, NULL, 167, '2019.02.12');
INSERT INTO member VALUES('RED', '레드벨벳', 4, '경북', '054', '55555555', 161, '2014.08.01');
INSERT INTO member VALUES('APN', '에이핑크', 6, '경기', '031', '77777777', 164, '2011.02.10');
INSERT INTO member VALUES('SPC', '우주소녀', 13, '서울', '02', '88888888', 162, '2016.02.25');
INSERT INTO member VALUES('MMU', '마마무', 4, '전남', '061', '99999999', 165, '2014.06.19');


create table buy(
	num	int auto_increment not null primary key,
    mem_id char(8) not null, 
    prod_name char(6) not null, 
    group_name char(4) ,
    price int not null,
    amount smallint not null,
    foreign key(mem_id) references member(mem_id)	-- member 테이블의 mem_id(pk)필드와 연길 (관계)
    /*
		references = 참조
		foreign key (외래키) references 테이블명 (기본키)
    */
);
use market_db;

select * from buy;

INSERT INTO buy VALUES(NULL, 'BLK', '지갑', NULL, 30, 2);
INSERT INTO buy VALUES(NULL, 'BLK', '맥북프로', '디지털', 1000, 1);
INSERT INTO buy VALUES(NULL, 'APN', '아이폰', '디지털', 200, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '아이폰', '디지털', 200, 5);
INSERT INTO buy VALUES(NULL, 'BLK', '청바지', '패션', 50, 3);
INSERT INTO buy VALUES(NULL, 'MMU', '에어팟', '디지털', 80, 10);
INSERT INTO buy VALUES(NULL, 'GRL', '혼공SQL', '서적', 15, 5);
INSERT INTO buy VALUES(NULL, 'APN', '혼공SQL', '서적', 15, 2);
INSERT INTO buy VALUES(NULL, 'APN', '청바지', '패션', 50, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '지갑', NULL, 30, 1);
INSERT INTO buy VALUES(NULL, 'APN', '혼공SQL', '서적', 15, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '지갑', NULL, 30, 4);

select * from member;

select addr as 주소, debut_date as '데뷔 일자' , mem_name as '회원명' from member; -- 별칭 지정

select * from member where mem_name ='블랙핑크';
select * from member where mem_number = 4; 
select mem_id, mem_name from member where height <= 162;
select mem_name, height, mem_number from member where height >=165 and mem_number > 6;
select mem_name, height, mem_number from member where height >=165 or mem_number > 6;

select mem_name, height , mem_number from member where height between 163 and 165;
select mem_name, height , mem_number from member where height >= 163 and 165 <= height;

select mem_name, addr from member where addr = '경기' or addr='전남' or addr='경남';
select mem_name, addr from member where addr  in( '경기', '전남', '경남');

/*
	like : 패턴 검색 ---> = 아님...! like 후 '조건'
		-- % : 모든 문자 대응 vs _ : _개수만큼 문자 대응
        -- 김% : 김으로 시작하는 모든 글자		vs		김_ : 김으로 시작하는 2글자
        -- %김% : 김이 포함된 문자			vs		_김_ : 2번째 글자가 '김'인 3글자
        -- %김 : 김으로 끝나는 모든 글자		vs		_김 : 김으로 끝나는 2글자
*/
select * from member where mem_name = '우주소녀';
select * from member where mem_name like '우%';
select * from member where mem_name like '__핑크';

/*
	where 조건식
		1. 산술연산자 : 
				1. + - * /
                2. div : 몫
                3. MOD : 나머지
		2. 비교연산자
				>= <= > < =(여기선 ==, === 아님) != <>(!=와 같음)
		3. 논리연산자
				AND OR NOT
		4. 기타연산자
				IN(값1, 값2, 값3 ...) -> OR과 같음
                between 값1 and 값2  -> 값1~값2 사이에 존재하면
                like -> 패턴 검색
                % : 모든 문자 수 대응 / _ : _개수만큼 대응
		5. NULL 관련 연산자
				is null : null 이면 [필드명 = null(x) vs 필드명 is null(o)]
                is not null : null이 아니면 [ 필드명!=null(x) vs 필드명 is not null(o)]

*/

/*
	p.125 ORDER BY : 정렬
		* SELECT * FROM 테이블명 ORDER BY 기준필드 ASC/DESC; [ ASC : 오름차순(생랼시) / DESC : 내림차순 ]

*/

select mem_id, mem_name, debut_date from member order by debut_date;
select mem_id, mem_name, debut_date from member order by debut_date desc ;

select mem_id, mem_name, debut_date, height from member where height>=164 order by height desc;
/* 
	다수정렬
		첫번째 order by 실행 후, 같은 값 내에서 2번째 조건 실행
*/
select mem_id, mem_name, debut_date, height from member where height>=164 order by height desc, debut_date asc;

/*

*/

-- 출력 개수 제한
select * from member limit 3;
select * from member limit 0, 3; -- 0부터 1씩 증가 3개
select * from member limit 2, 3; -- 2부터 1씩 증가 3개

select mem_name, height from member order by height desc limit 3, 2;

-- 결과에서 중복 제거
select addr from member;
select distinct addr from member;


-- 특정 필드 그룹
select mem_id, amount from buy order by mem_id;
-- 집계 함수
select sum(amount) from buy;
select avg(amount) from buy;
select max(amount) from buy;
select min(amount) from buy;
select count(amount) from buy;		-- 수량의 레코드 개수
select count(*) from buy;			-- 모든 레코드 개수 [null 포함]
select count(distinct amount) from buy;

-- 특정 집계
select mem_id, sum(amount) from buy group by mem_id;
select mem_id as 회원_아이디, sum(amount*price) as '총 구매금액' from buy group by mem_id;
select mem_id, avg(amount) as 평균 from buy group by mem_id;
select mem_id, count(phone1) as 연락처 from member group by mem_id;
select mem_id, count(*) as 회원수 from member group by mem_id;


-- having
	-- where 일반조건 (그룹 전) vs having 그룹조건(그룹 후)
select mem_id as '회원 아이디', sum(price * amount) as '총 구매급액'
from buy
where sum(price * amount) > 1000			-- sum은 group by 뒤에 와야함. 앞에 있는 경우 오류.
group by mem_id;

select mem_id as '회원 아이디', sum(price * amount) as '총 구매급액'
from buy
group by mem_id
having sum(price * amount) > 1000;


use market_db;

create table hongong1 ( toy_id int, toy_name char(4), age int);
insert into hongong1 values(1, '우디',25); -- 넣으려는 값의 개수와 필드 수가 일치할 경우 필드 명 생략 가능

select * from hongong1;

insert into hongong1 (toy_id, toy_name) values (2, '버즈');

insert into hongong1(toy_name, age, toy_id) values ('제시',20,3);

CREATE TABLE HONGONG2(
	toy_id int auto_increment primary key,
    toy_name char(4),
    age int
);

insert into hongong2 values( null, '보핍', 25 );
select * from hongong2;
insert into hongong2 values (3, '메롱', 26 );
insert into hongong2 values (null, '뭐지', 27 );

create table member_addr(mem_id char(8) not null, addr char(2));

select mem_id, addr from member limit 5 ; 
insert into member_addr select mem_id, addr from member limit 5; -- insert into 에서 value를 select로 찾은 데이터로 지정 가능
select * from member_addr;

select * from member;
update member set addr = 'seoul' where addr='서울'; -- 오류 / [워크벤치 설정 변경(update/delete 사용 불가)] + [table addr 속성 char(2) 글자 수 오류]
update member set addr = 'Se' where addr='서울';
update member set addr = '서울' where addr='Se';

update member set addr = '경기' , phone1 = '031' where addr='수도';
update member set addr = '수도' , phone1 = '032' where addr='경기';

/*
	pk <----> fk [ 연결 ]
		-- 연결이 되어있는 상태에서 삭제 시도 시 경고
        -- 연결되어 있지 않은 테이블은 삭제 가능
*/

create table hongong4 ( 
	tinyint_col tinyint,		-- 1바이트 +- 128 -> 범위 2^8
    smallint_col smallint,		-- 2바이트 +- 30000 범위 2^16
    int_col int,				-- 4바이트 +- 21억 범위 2^32
    bigint_col bigint,			-- 8바이트 +- 많이 / 범위 2^64
    char_col char(10),			-- char (1~255) 사이
    varchar_col varchar(10),	-- varchar(1~16383) 사이
    text_col text,				-- text(1~65535)
    longtext_col longtext,		-- longtext(1~42억)
    Blob_col blob,				-- blob(1~65535)
    longblob_col longblob,		-- longblob(1~42억)
    float_col float,			-- float : 소수점 7자리 표현
    double_col double,			-- double : 소수점 15자리 표현
    date_col date,				-- Date : 날짜 [yyyy-mm-dd]
    time_col time,				-- time : 시간 [hh:mm:ss]
    datetime_col datetime		-- datetime :날짜 시간 저장 [YYYY-MM-DD-HH-MM-SS]
);


/*
	DB설계
		제품 테이블
		장바구니 테이블
		회원 테이블

*/

create database 쿠팡DB;
















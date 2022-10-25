create table pcategory(
	pcno int primary key auto_increment,
    pcname varchar(100)
);

create table product(
	pno int primary key auto_increment,
	pname varchar(100),
    pcomment varchar(1000),
    pprice int unsigned,
    pdiscount float,
    pactive tinyint, -- ex) 0 : 준비중 , 1 : 판매중 , 2 : 매진
    pimg longtext,
    pdate datetime default now(),
    pcno int,
    constraint pcno_fk foreign key (pcno) references pcategory (pcno)
);
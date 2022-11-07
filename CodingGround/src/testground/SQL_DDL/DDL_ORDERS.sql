CREATE TABLE ORDERS {
  ORDER_DATE TIMESTAMP,
  CUSTOMER_ID NUMERIC(3,0),
  AMOUNT NUMERIC(13,2)
}

alter table sys.orders add MEMBERSHIP varchar(1);

insert into sys.ORDERS (ORDER_DATE,CUSTOMER_ID,AMOUNTS,MEMBERSHIP) values ('2022-11-02 22:10:23', 102, 20000,'G');
insert into sys.ORDERS (ORDER_DATE,CUSTOMER_ID,AMOUNTS,MEMBERSHIP) values ('2022-11-04 22:10:23', 102, 30000,'G');
insert into sys.ORDERS (ORDER_DATE,CUSTOMER_ID,AMOUNTS,MEMBERSHIP) values (NOW(), 102, 20000,'G');

insert into sys.ORDERS (ORDER_DATE,CUSTOMER_ID,AMOUNTS,MEMBERSHIP) values (NOW(), 103, 10200,'S');
insert into sys.ORDERS (ORDER_DATE,CUSTOMER_ID,AMOUNTS,MEMBERSHIP) values (NOW(), 103, 10000,'S');
insert into sys.ORDERS (ORDER_DATE,CUSTOMER_ID,AMOUNTS,MEMBERSHIP) values (NOW(), 104, 200,'B');

select * from sys.ORDERS


delete from sys.ORDERS where CUSTOMER_ID = 102 order by ORDER_DATE desc limit 1;


select * from sys.orders

update sys.orders set
membership = 'G'
where customer_id = 102

select membership,count(1), avg(amounts) as number from sys.orders group by MEMBERSHIP;
select membership,count(1), sum(amounts) as number from sys.orders group by MEMBERSHIP;

select membership,count(1) as count, avg(AMOUNTS) as number from sys.orders group by MEMBERSHIP having count > 1;

select MEMBERSHIP, count(MEMBERSHIP) from sys.orders
where ORDER_DATE > '2022-11-05'
group by MEMBERSHIP
having count(MEMBERSHIP) > 1;


select * from sys.orders;

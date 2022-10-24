create database JDBCDemo

use JDBCDemo

create table item(
 id int primary key,
  [name] varchar(50),
  quantity int,
  price float,
  createdOn date,
  modifiedDate date
)

select * from item

 
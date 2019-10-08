
create table member(
level number(1) check (level between 1 and 2) constraint member_level_NN not null,
id varchar2(400) constraint member_id_PK primary key (id),
pw varchar2(400) constraint member_pw_NN not null,
name varchar2(400) constraint member_name_NN not null,
email varchar2(400) constraint member_email_PK primary key (email),
phone varchar2(400) constraint member_phone_PK primary key (phone),
bid varchar2(400) constraint member_bid_FK references ban (bid)
)

create table point (
num number(8) constraint point_num_NN not null,
id varchar(400) constraint point_id_FK references member (id),
kor number(3) constraint point_kor_NN not null,
eng number(3) constraint point_eng_NN not null,
math number(3) constraint point_math_NN not null,
total number(3) constraint point_total_NN not null,
avg number(3) constraint point_avg_NN not null,
term number(1) constraint point_term_NN not null,
bid varchar(400) constraint point_bid_FK references ban (bid)
)

create sequence point_seq
start with 1
increment by 1
nomaxvalue

create table ban(
bid varchar2(400) constraint ban_bid_NN not null,
bnum number(2) constraint ban_bnum_NN not null,
tname varchar2(400) constraint ban_tname_NN not null
)



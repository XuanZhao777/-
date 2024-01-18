# - 代码使用
第一步 下载代码解压。

第二步 在src->Utils 里把数据库的用户和密码改成自己的。(用户名一般都为root)

第三步 在终端或者平台创建数据库。具体步骤为:

1. mysql -u root -p
2. 输入自己的密码
3. create database pro_stumanage;
4. use pro_stumanage;
5. CREATE TABLE stu (
    stu_num INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(8) NOT NULL,
    gender CHAR(2) NOT NULL,
    id CHAR(8) NOT NULL,
    PRIMARY KEY (stu_num),
    UNIQUE KEY id (id)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

   这步是创建stu表。包括姓名，性别和学号。其中stu_num(注意不是学号,相当于索引)是用来把stu表里的id(学号)连接后面classes表里的class_id的。
   
7. CREATE TABLE classes (
    class_id INT NOT NULL,
    subject VARCHAR(20) NOT NULL,
    score INT NOT NULL,
    teacher VARCHAR(10) NOT NULL,
    PRIMARY KEY (class_id, subject),
    CONSTRAINT fk_classes_stu FOREIGN KEY (class_id) REFERENCES stu (stu_num) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


  这步是创建classes表，其中“CONSTRAINT fk_classes_stu FOREIGN KEY (class_id) REFERENCES stu (stu_num) ON DELETE CASCADE”这个指令代表当学生删除时，他关联的成绩也会被删除。

# - 更正后 添加用户注册表
1. 在终端输入 mysql -u root -p;
2. 输入密码
3. use pro_stumanage;
4. create table user(
   username varchar(20),
   password varchar(20));

 5修改stu_num编号错误问题
 
 alter table stu auto_increment =1;
 alter table classes auto_increment = 1;






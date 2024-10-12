# Book_Manage_Web
图书馆管理系统，带web页面

> 前端模版是真的难找啊，大部分是收费的，免费的已经是凤毛麟角了。
>
> Copyright 2021 © SplashDash All Rights By [bootstrapmb](http://www.bootstrapmb.com/).
>
> 额，好像本身就是付费模版

技术栈：

- Mybaits
- Servlet
- Thymeleaf
- Tomcat

> 将数据库查询的操作和结构融入到前端页面中

## 1.前端模版资源寻找

从教学中的资源将前端页面拉取过来，按照相同的路径保存即可。

启动Tomcat，代理下webapp中的静态页面查看效果。

![image-20241012141740986](images/image-20241012141740986.png)

放到resources目录下实现Servlet直接代理相关页面

## 2.创建数据库

直接使用之前的数据库book_manage添加admin表即可

一次选择多张表即可可以一次将多个表转换为模型

<img src="images/image-20241012141909787.png" alt="image-20241012141909787" style="zoom:50%;" />

## 3.编写初始Servlet实现直接代理静态网页


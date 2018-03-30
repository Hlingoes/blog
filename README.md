## Blog
fork from [blog](https://github.com/zhisheng17/blog) 该作者对项目做了详尽的描述，出于对项目的喜爱，给原作者提了issue，同时自己做了修改。
项目启动后，访问：localhost:8081, 可以看到发布的文章；
访问：localhost:8081/administrator/login，登录账号：admin，密码：123456；进入后台管理页面；
访问：localhost:8081/swagger-ui.html，可以看到swagger风格的api接口。
## 更新纪录
2018-3-18 fork项目[blog](https://github.com/zhisheng17/blog)，升级到spring-boot2.0.0<br>
2018-3-25 修复因静态文件的路径地址和管理页面的路径地址一致，造成初始化登录时，静态文件被拦截，页面显示和跳转异常的bug<br>
2018-3-26 加入对swagger的支持<br>
2018-3-27 采用注解引入DataSource的方式，优化SQL数据备份功能
2018-3-31 便于部署发布，分离springboot的打包方式
## 参考文献
[Springboot 打jar包分离lib，配置文件正确方式 ](https://my.oschina.net/xiaozhutefannao/blog/1624092)<br>
[通过Maven构建打包Spring boot，并将config配置文件提取到jar文件外](https://blog.csdn.net/dgzjkxha/article/details/52397289)
## 感谢
[zhisheng17](https://github.com/zhisheng17/blog), [ZHENFENG13](https://github.com/ZHENFENG13), [otale](https://github.com/otale)

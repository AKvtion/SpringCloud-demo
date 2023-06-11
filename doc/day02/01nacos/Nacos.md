# Nacos指南

Nacos是阿里巴巴的产品，现在是SpringCloud中的一个组件。相比Eureka功能更加丰富，在国内受欢迎程度较高。

服务注册到Nacos
1. 在cloud-demo父工程中添加spring-cloud-alilbaba的管理依赖：
```java
<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-alibaba-dependencies</artifactId>
    <version>2.2.6.RELEASE</version>
    <type>pom</type>
    <scope>import</scope>
</dependency>
```
2. 注释掉order-service和user-service中原有的eureka依赖。
3. 添加nacos的客户端依赖：
```java
<!-- nacos客户端依赖 -->
<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
</dependency>
```
4.修改user-service&order-service中的application.yml文件，注释eureka地址，添加nacos地址：
```java
  cloud:
    nacos:
      server-addr: localhost:8848
```
5. 启动测试 localhost:8848

### 总结
Nacos服务搭建
- 下载安装包 
- 解压 
- 在bin目录下运行指令：startup.cmd -m standalone

Nacos服务注册或发现
- 引入nacos.discovery依赖 
- 配置nacos地址spring.cloud.nacos.server-addr
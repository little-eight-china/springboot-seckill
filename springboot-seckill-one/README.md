# springboot秒杀系统———第一阶段 初建模型


## 包架构

```
└─ sql 建表sql
└─src
    └─bdbk
        └─seckill
            ├─config 配置类
            ├─constant 常量类
            ├─controller 控制类
            ├─dao 数据库类
            ├─domain 实体类
            ├─service 逻辑类
            ├─util 工具类
            ├─validator 校验类
            ├─vo 前端vo
```

## 实现部分

### 登录功能（后面章节不准备实现注册功能）

* 校验输入内容是否合理
* 成功失败处理
* 成功登录后，token作为key，用户信息作为value存到redis

### 拦截器
* 拦截不携带token的非法请求

##主要代码说明

### 登录校验
* 使用HandlerMethodArgumentResolver实现token校验跟保存用户信息到redis
* 用户密码用MD5校验
* 自定义注解@isMobile，手机号码校验

## 启动说明
* 执行sql文件夹的建表sql
* 启动项目前，启动好数据库跟redis
* 修改application.yml里以上相关连接信息
* 运行run方法，打开http://localhost:8080

## 部分截图

### 登录界面
![one-login](https://github.com/little-eight-china/image/blob/master/springboot-seckill/one-login.jpg?raw=true)

### 商品列表
![one-goodsList](https://github.com/little-eight-china/image/blob/master/springboot-seckill/one-goodsList.jpg?raw=true)

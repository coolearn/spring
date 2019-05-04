## HikariCP 数据源
1. 字节码级别优化(很多⽅方法通过 JavaAssist ⽣生成)
2. ⼤大量量⼩小改进

- ⽤用 FastStatementList 代替 ArrayList
- ⽆无锁集合 ConcurrentBag
- 代理理类的优化(⽐比如，⽤用 invokestatic 代替了了 invokevirtual)

## Spring Boot 2.x
- 默认使⽤用 HikariCP
- 配置 spring.datasource.hikari.* 配置

## Spring Boot 1.x
- 默认使⽤用 Tomcat 连接池，需要移除 tomcat-jdbc 依赖
- spring.datasource.type=com.zaxxer.hikari.HikariDataSource


其他配置详⻅见 HikariCP [官⽹](https://github.com/brettwooldridge/HikariCP) 
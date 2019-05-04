# 多数据源

## 重点

### 不不同数据源的配置要分开
### 关注每次使⽤用的数据源

- 有多个DataSource时系统如何判断 
- 对应的设施(事务、ORM等)如何选择DataSource

### ⼿手⼯工配置两组 
DataSource 及相关内容 与Spring Boot协同⼯作(二选⼀一)

配置@Primary类型的Bean 
排除Spring Boot的⾃自动配置
>   DataSourceAutoConfiguration   
> DataSourceTransactionManagerAutoConfiguration
> JdbcTemplateAutoConfiguration


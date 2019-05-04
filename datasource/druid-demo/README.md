Druid连接池是阿⾥里里巴巴开源的数据库连接池项⽬目。Druid连接池为监控⽽而⽣生， 内置强⼤大的监控功能，监控特性不不影响性能。功能强⼤大，能防SQL注⼊入，内置 Logging能诊断Hack应⽤用⾏行行为。

经过阿⾥里里巴巴各⼤大系统的考验，值得信赖
实⽤用的功能
- 详细的监控(真的是全⾯面)
- ExceptionSorter，针对主流数据库的返回码都有⽀支持
- SQL 防注⼊入
- 内置加密配置
- 众多扩展点，⽅方便便进⾏行行定制

## 数据源配置


spring.datasource.druid.*

spring.datasource.url=jdbc:h2:mem:foo
spring.datasource.username=sa
// 密码加密
spring.datasource.password=n/z7PyA5cvcXvs8px8FVmBVpaRyNsvJb3X7YfS38DJrIg25EbZaZGvH4aHcnc97Om0islpCAPc3MqsGvsrxVJw==

spring.datasource.druid.initial-size=5
spring.datasource.druid.max-active=5
spring.datasource.druid.min-idle=5
spring.datasource.druid.filters=conn,config,stat,slf4j

spring.datasource.druid.connection-properties=config.decrypt=true;config.decrypt.key=${public-key}
spring.datasource.druid.filter.config.enabled=true

spring.datasource.druid.test-on-borrow=true
spring.datasource.druid.test-on-return=true
spring.datasource.druid.test-while-idle=true

public-key=MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBALS8ng1XvgHrdOgm4pxrnUdt3sXtu/E8My9KzX8sXlz+mXRZQCop7NVQLne25pXHtZoDYuMh3bzoGj6v5HvvAQ8CAwEAAQ==

// sql防注入
spring.datasource.druid.filter.wall.enabled=true spring.datasource.druid.filter.wall.db-type=h2 spring.datasource.druid.filter.wall.config.delete-allow=false spring.datasource.druid.filter.wall.config.drop-table-allow=false

## Druid Filter
- ⽤用于定制连接池操作的各种环节
- 可以继承 FilterEventAdapter 以便便⽅方便便地实现 Filter
- 修改 META-INF/druid-filter.properties 增加 Filter 配置
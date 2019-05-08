
## 我在配置文件里，没有看到配饰spring.jpa.database啊，JPA怎么知道数据源是H2的？

> Spring Boot自己会在Classpath里查找的，它对内嵌数据库做了自动配置，发现了H2的包后，它就知道要配置H2的数据源，这个在后续Spring Boot的章节里会提到的。
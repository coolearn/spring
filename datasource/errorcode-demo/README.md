# Spring 的 JDBC 异常抽象

Spring 会将数据操作的异常转换为 DataAccessException 无论使用何种数据访问方式，都能使用一样的异常

## Spring是怎么认识那些错误码的
通过 SQLErrorCodeSQLExceptionTranslator 解析错误码
ErrorCode 定义
- org/springframework/jdbc/support/sql-error-codes.xml
- Classpath 下的 sql-error-codes.xml

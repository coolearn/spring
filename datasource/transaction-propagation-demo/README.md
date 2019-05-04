## 事务传播特性
PROPAGATION_REQUIRED
| 传播性      |    值 | 描述  |
| :-------- | --------:| :--: |
| PROPAGATION_REQUIRED  | 0 |  当前有事务就用当前的，没有就用新的   |
| PROPAGATION_SUPPORTS     |   1 |  事务可有可⽆，不是必须的  |
| PROPAGATION_MANDATORY      |    2 | 当前⼀定要有事务，不然就抛异常  |
| PROPAGATION_REQUIRES_NEW      |    3 | ⽆论是否有事务，都起个新的事务  |
| PROPAGATION_NOT_SUPPORTED      |    4 | 不支持事务，按非事务⽅式运行  |
| PROPAGATION_NEVER      |    5 | 不支持事务，如果有事务则抛异常   |
| PROPAGATION_NESTED      |    6 | 当前有事务就在当前事务⾥再起⼀一个事务   |

## 事务隔离特性
| 隔离性      |    值 | 脏读  | 不可重复读| 幻读 |
| :-------- | --------:| --------:| :--: |:--: |
ISOLATION_READ_UNCOMMITTED | 1 | TRUE | TRUE | TRUE |
ISOLATION_READ_COMMITTED | 2| FALSE | TRUE | TRUE |
ISOLATION_REPEATABLE_READ | 3| FALSE | FALSE | TRUE |
ISOLATION_SERIALIZABLE |4 | FALSE | FALSE | FALSE |

## 编程式事务
TransactionTemplate
- TransactionCallback
- TransactionCallbackWithoutResult

## PlatformTransactionManager
- 可以传⼊入TransactionDefinition进⾏行行定义
- 
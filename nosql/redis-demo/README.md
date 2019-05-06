
## Redis 的哨兵与集群模式
 
 ### Redis Sentinel 是 Redis 的⼀一种⾼高可⽤用⽅方案
 - 监控、通知、⾃自动故障转移、服务发现

 ### JedisSentinelPool

 ## Redis 的集群模式

### Redis Cluster
 - 数据⾃自动分⽚片(分成16384个 Hash Slot )
 - 在部分节点失效时有⼀一定可⽤用性

### JedisCluster
- Jedis 只从 Master 读数据，如果想要⾃自动读写分离，可以定制
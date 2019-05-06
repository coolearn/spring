
https://redis.io


## Spring 对 Redis的支持
- spring Data Redis 
- 支持客户端 Jedis /Lettuce 
- RedisTemplate
- Repository支持

## Jedis 客户端的简单使⽤用
- Jedis 不是线程安全的
- 通过JedisPool获得Jedis实例
- 直接使用Jedis中的方法

## Docker 启动 Redis

[官方镜像](https://hub.docker.com/_/redis)

``` sh 
docker pull redis
docker run --name redis -d -p 6379:6379 redis
```
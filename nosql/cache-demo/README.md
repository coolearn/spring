### 为不同的缓存提供⼀一层抽象
- 为 Java 方法增加缓存，缓存执⾏结果
- 支持ConcurrentMap、EhCache、Caffeine、JCache(JSR-107)
## 接⼝
- org.springframework.cache.Cache
- org.springframework.cache.CacheManager
  
>分布式缓存（Redis、MemCacheed）、本地缓存()

## 基于注解的缓存
### @EnableCaching 开启缓存支持
- @Cacheable  存在直接取缓存
- @CacheEvict  缓存清理
- @CachePut    直接做缓存设置
- @Caching     缓存打包
- @CacheConfig  缓存设置



## 开启注解
@EnableMongoRepositories

## 对应接⼝口
- MongoRepository<T, ID>
- PagingAndSortingRepository<T, ID>
- CrudRepository<T, ID>

## Template 与 Repository的区别
> Template能做各式各样的操作，比较灵活，但什么都得自己写；Repository则更符合DDD里数据仓库的习惯，做了很好的封装，用起来比较方便，但有些复杂的，还是得靠Template
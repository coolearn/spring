
## 依赖

lombok、mongodb.

``` mongo
show dbs;
use springbucks;
# 创建用户并赋予springbucks库权限
db.createUser(
{
      user: "springbucks",
      pwd: "springbucks",
      roles: [
         { role: "readWrite", db: "springbucks" }
      ]
} )
#查看用户
show users;

# 查看库中的表
use springbucks;
show collections;
# 查询所有
db.coffee.find(); 
db.coffee.remove({"name":"espresso"});


```
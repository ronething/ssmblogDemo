# ssm博客系统

其中原作者分页查询貌似写错了。

```java
@Test
public void  listByPage(){
    Integer page = 1;  //第一页
    Integer pageSize = 2;  //一页显示两条
    Integer start =(page-1)*pageSize;
    //Integer end = page*pageSize;
    //这里修改为
    Integer end = pageSize;
    List<BlogType> blogTypeList = blogTypeDao.listByPage(start,end);
    for (BlogType b: blogTypeList) {
        System.out.println(b);
    }
}
```

下面同理。

```java
public PageBean(int currPage, int pageSize) {
    this.currPage = currPage;
    this.pageSize = pageSize;
    this.start = (currPage-1)*pageSize;
    this.end = pageSize;
}
```

[【ssm个人博客项目实战04】mybatis实现博客类别的增删改查分页](https://blog.csdn.net/xp541130126/article/details/70175208)

[【ssm个人博客项目实战05】easy ui datagrid实现数据的分页显示](https://blog.csdn.net/xp541130126/article/details/70215736)
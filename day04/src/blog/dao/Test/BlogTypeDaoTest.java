package blog.dao.Test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import blog.dao.BlogTypeDao;
import blog.entity.BlogType;

/**
 * @author Administrator
 * 类别Dao测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:beans.xml")
public class BlogTypeDaoTest {

	@Resource
	private BlogTypeDao blogTypeDao;
	
    @Test
    public void addBlogType() throws Exception {
        BlogType blogType = new BlogType("hello",11);
        BlogType blogType1 = new BlogType("demo",12);
        int result = blogTypeDao.addBlogType(blogType);
        int result1 = blogTypeDao.addBlogType(blogType1);
        System.out.println(result+" "+result1);
    }

    @Test
    public void deleteBlogType() throws Exception {
        int result = blogTypeDao.deleteBlogType(17);
        System.out.println(result);
    }

    @Test
    public void updateBlogType() throws Exception {
        // 先查询出要更新的记录然后修改
        BlogType blogType = blogTypeDao.getById(16);
        //然后提交更新
        blogType.setTypeName("更新mysql哈哈哈哈哈哈哈哈");
        //更新
        blogTypeDao.updateBlogType(blogType);
        //查询更新后的值 并且打印
        System.out.println(blogTypeDao.getById(16));

    }

    @Test
    public void getById() throws Exception {
        BlogType blogType = blogTypeDao.getById(16);
        System.out.println(blogType);
    }

    @Test
    public void  listByPage(){
        Integer page = 2;  //第一页
        Integer pageSize = 5;  //一页显示两条
        Integer start =(page-1)*pageSize;
        Integer end = pageSize;
        List<BlogType> blogTypeList = blogTypeDao.listByPage(start,end);
        for (BlogType b: blogTypeList) {
            System.out.println(b);
        }
    }

    @Test
    public void getTotal(){
        long total = blogTypeDao.getTotal();
        System.out.println(total);
    }
}

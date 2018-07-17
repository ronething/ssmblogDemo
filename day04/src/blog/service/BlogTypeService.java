package blog.service;

import java.util.List;

import blog.entity.BlogType;
import blog.util.PageBean;

/**
 * @author Administrator
 * 类别service接口
 */
public interface BlogTypeService {

	/**
	 * 分页查询
	 * @param pageBean
	 * @return
	 */
	public PageBean<BlogType> listByPage(PageBean<BlogType> pageBean);
	
    // 添加博客类别
    public Integer addBlogType(BlogType blogType);

    // 更新博客类别
    public Integer updateBlogType(BlogType blogType);

    // 删除博客类别
    public Integer deleteBlogType(Integer id);

//    public List<BlogType> getBlogTypeData();
	
}

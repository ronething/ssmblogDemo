package blog.service;

import java.util.List;
import java.util.Map;

import blog.entity.Blog;
import blog.util.PageBean;

/**
 * @author Administrator
 * 博客service接口
 */
public interface BlogService {
	
	/**
	 * 分页查询
	 * @param map
	 * @return
	 */
	public List<Blog> listBlog(Map<String,Object> map);
	
	/**
	 * 分页查询
	 * @param title
	 * @param pageBean
	 * @return
	 */
	public PageBean<Blog> listBlog(String title,PageBean<Blog> pageBean);
	
	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * 根据博客类型的id查询该类型下的博客数量
	 * @param typeId
	 * @return
	 */
	public Integer getBlogByTypeId(Integer typeId);
	
	/**
	 * 添加博客
	 * @param blog
	 * @return
	 */
	public Integer saveBlog(Blog blog);
	
	/**
	 * 更新博客
	 * @param blog
	 * @return
	 */
	public Integer updateBlog(Blog blog);
	
	/**
	 * 删除博客
	 * @param id
	 * @return
	 */
	public Integer deleteBlog(Integer id);
	
	/**
	 * 通过id获取博客
	 * @param id
	 * @return
	 */
	public Blog getById(Integer id);
}

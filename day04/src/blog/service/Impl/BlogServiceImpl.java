package blog.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import blog.dao.BlogDao;
import blog.entity.Blog;
import blog.service.BlogService;
import blog.util.PageBean;

@Service("blogService")
public class BlogServiceImpl implements BlogService{
	
	@Resource
	private BlogDao blogDao;
	
	@Override
	public List<Blog> listBlog(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return blogDao.listBlog(map);
	}

	@Override
	public PageBean<Blog> listBlog(String title, PageBean<Blog> pageBean) {
		// TODO Auto-generated method stub
		Map<String,Object> map = new HashMap<String,Object>();
		//设置查询条件
		map.put("title", title);
		//总记录
		pageBean.setTotal(blogDao.getTotal(map));
		
		map.put("start",pageBean.getStart());
		map.put("end",pageBean.getEnd());
		
		//分页结果放入pageBean
		pageBean.setResult(blogDao.listBlog(map));
		
		return pageBean;
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return blogDao.getTotal(map);
	}

	@Override
	public Integer getBlogByTypeId(Integer typeId) {
		// TODO Auto-generated method stub
		return blogDao.getBlogByTypeId(typeId);
	}

	@Override
	public Integer saveBlog(Blog blog) {
		// TODO Auto-generated method stub
		return blogDao.saveBlog(blog);
	}

	@Override
	public Integer updateBlog(Blog blog) {
		// TODO Auto-generated method stub
		return blogDao.updateBlog(blog);
	}

	@Override
	public Integer deleteBlog(Integer id) {
		// TODO Auto-generated method stub
		return blogDao.deleteBlog(id);
	}

	@Override
	public Blog getById(Integer id) {
		// TODO Auto-generated method stub
		return blogDao.getById(id);
	}
	

}

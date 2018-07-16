package blog.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import blog.dao.BlogTypeDao;
import blog.entity.BlogType;
import blog.service.BlogTypeService;
import blog.util.PageBean;

/**
 * @author Administrator
 * 类别service接口实现类
 */
@Service
public class BlogTypeServiceImpl implements BlogTypeService{
	
	@Resource
	private BlogTypeDao blogTypeDao;

	@Override
	public PageBean<BlogType> listByPage(PageBean<BlogType> pageBean) {
		// TODO Auto-generated method stub
		pageBean.setResult(blogTypeDao.listByPage(pageBean.getStart(), pageBean.getEnd()));
		pageBean.setTotal(blogTypeDao.getTotal());
		
		return pageBean;
	}

	@Override
	public Integer addBlogType(BlogType blogType) {
		// TODO Auto-generated method stub
		return blogTypeDao.addBlogType(blogType);
	}

	@Override
	public Integer updateBlogType(BlogType blogType) {
		// TODO Auto-generated method stub
		return blogTypeDao.updateBlogType(blogType);
	}

	@Override
	public Integer deleteBlogType(Integer id) {
		// TODO Auto-generated method stub
		return blogTypeDao.deleteBlogType(id);
	}

//	@Override
//	public List<BlogType> getBlogTypeData() {
//		// TODO Auto-generated method stub
//		return blogTypeDao;
//	}
}

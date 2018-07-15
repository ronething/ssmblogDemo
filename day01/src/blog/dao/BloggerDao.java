package blog.dao;

import org.springframework.stereotype.Repository;

import blog.entity.Blogger;

@Repository("bloggerDao")
public interface BloggerDao {
	/**
	 * @return
	 * 查询博主信息
	 */
	Blogger getBloggerData();
}

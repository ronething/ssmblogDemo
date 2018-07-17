package blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import blog.entity.BlogType;

/**
 * @author Administrator
 * 类别Dao类
 */
@Repository("blogTypeDao")
public interface BlogTypeDao {
	
	/**
	 * 添加类别
	 * @param blogType
	 * @return
	 */
	Integer addBlogType(BlogType blogType);

	/**
	 * 删除类别
	 * @param id
	 * @return
	 */
	Integer deleteBlogType(Integer id);

	/**
	 * 更新类别信息
	 * @param blogType
	 * @return
	 */
	Integer updateBlogType(BlogType blogType);
	
	/**
	 * 根据id查询类别信息
	 * @param id
	 * @return
	 */
	BlogType getById(Integer id);

	/**
	 * 分页查询类别信息
	 * @param start
	 * @param end
	 * @return
	 */
	// 目前还有一点疑问 不知道是要查询第几页还是查询第几页到第几页。
	List<BlogType> listByPage(@Param("start") Integer start,@Param("end") Integer end);

	/**
	 * 查询总记录数
	 * @return
	 */
	//Integer getTotal();
	Long getTotal();
}

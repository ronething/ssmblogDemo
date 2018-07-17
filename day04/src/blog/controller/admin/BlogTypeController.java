package blog.controller.admin;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import blog.entity.BlogType;
import blog.service.BlogTypeService;
import blog.util.PageBean;
import blog.util.ResponseUtil;

/**
 * @author Administrator
 * 分类控制层
 */
@Controller
@RequestMapping("/admin/blogType")
public class BlogTypeController {

	@Resource
	private BlogTypeService blogTypeService;
	
	@RequestMapping("/list")
	public String listBlogType(@RequestParam(value="page",required=false) String page,@RequestParam(value="rows",required=false) String rows,HttpServletResponse response) throws Exception{
		PageBean<BlogType> pageBean = new PageBean<BlogType>(Integer.parseInt(page),Integer.parseInt(rows));
		pageBean = blogTypeService.listByPage(pageBean);
		
		JSONObject result = new JSONObject();
		
		String jsonArray = JSON.toJSONString(pageBean.getResult());
		JSONArray array = JSONArray.parseArray(jsonArray);
		
		result.put("rows",array);
		result.put("total",pageBean.getTotal());

		ResponseUtil.write(response, result);
		
		return null;
	}
	
    // 添加和更新博客类别
    @RequestMapping("/save")
    public String save(BlogType blogType, HttpServletResponse response)
            throws Exception {

        int resultTotal = 0; // 接收返回结果记录数
        if (blogType.getId() == null) { // 说明是第一次插入
            resultTotal = blogTypeService.addBlogType(blogType);
        } else { // 有id表示修改
            resultTotal = blogTypeService.updateBlogType(blogType);
        }

        JSONObject result = new JSONObject();
        if (resultTotal > 0) {
            result.put("success", true);
        } else {
            result.put("success", false);
        }
        ResponseUtil.write(response, result);
        return null;
    }

    // 博客类别信息删除
    /*
    通过required=false或者true来要求@RequestParam配置的前端参数是否一定要传
    required=false表示不传的话，会给参数赋值为null，required=true就是必须要有
     */
    @RequestMapping("/delete")
    public String deleteBlog(
            @RequestParam(value="ids", required=false) String ids,
            HttpServletResponse response) throws Exception {
        //分割字符串得到id数组
        String[] idsStr = ids.split(",");
        JSONObject result = new JSONObject();
        for (int i = 0; i < idsStr.length; i++) {
            int id = Integer.parseInt(idsStr[i]);
            //其实在这里我们要判断该博客类别下面是否有博客 如果有就禁止删除博客类别，等我们完成博客对应的操作再来完善
            blogTypeService.deleteBlogType(id);
        }
        result.put("success",true);
        ResponseUtil.write(response,result);
        return null;
    }
}

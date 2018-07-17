package blog.entity;

import java.io.Serializable;

/**
 * @author Administrator
 * 类别实体类
 */
public class BlogType implements Serializable {
	
	private Integer id;
	
	private String typeName;
	
	private Integer orderNum;
	
	public BlogType(){
		
	}
	
	public BlogType(String typeName, Integer orderNum) {
		super();
		this.typeName = typeName;
		this.orderNum = orderNum;
	}

	public BlogType(Integer id, String typeName, Integer orderNum) {
		super();
		this.id = id;
		this.typeName = typeName;
		this.orderNum = orderNum;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	@Override
	public String toString() {
        return "BlogType{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                ", orderNum=" + orderNum +
                '}';
    }

}

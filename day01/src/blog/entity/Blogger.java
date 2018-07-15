package blog.entity;

import java.io.Serializable;

/**
 * @author Administrator
 * 博主信息实体类
 */
public class Blogger implements Serializable{
	
	private Integer id;
	private String userName;
	private String password;
	private String profile;
	private String nickName;
	private String sign; //个性签名
	private String imageName;
	
	public Blogger(){
		
	}

	public Blogger(Integer id, String userName, String password, String profile, String nickName, String sign,
			String imageName) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.profile = profile;
		this.nickName = nickName;
		this.sign = sign;
		this.imageName = imageName;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	@Override
	public String toString() {
        return "Blogger{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", profile='" + profile + '\'' +
                ", nickName='" + nickName + '\'' +
                ", sign='" + sign + '\'' +
                ", imageName='" + imageName + '\'' +
                '}';
	}
	
}

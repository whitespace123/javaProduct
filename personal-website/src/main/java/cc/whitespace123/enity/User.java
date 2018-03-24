package cc.whitespace123.enity;

import java.sql.Date;

public class User {
	private Integer id;
	private String username;
	private String password;
	private Date jointime;
	private String instroduction;
	private String imagePath;
	private Integer sex;
	//用户的角色
	private Integer role;

	public User() {
		super();
	}

	public User(Integer id, String username, String password, Date jointime, String instroduction, String imagePath,
			Integer sex, Integer role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.jointime = jointime;
		this.instroduction = instroduction;
		this.imagePath = imagePath;
		this.sex = sex;
		this.role = role;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getJointime() {
		return jointime;
	}

	public void setJointime(Date jointime) {
		this.jointime = jointime;
	}

	public String getInstroduction() {
		return instroduction;
	}

	public void setInstroduction(String instroduction) {
		this.instroduction = instroduction;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((imagePath == null) ? 0 : imagePath.hashCode());
		result = prime * result + ((instroduction == null) ? 0 : instroduction.hashCode());
		result = prime * result + ((jointime == null) ? 0 : jointime.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (imagePath == null) {
			if (other.imagePath != null)
				return false;
		} else if (!imagePath.equals(other.imagePath))
			return false;
		if (instroduction == null) {
			if (other.instroduction != null)
				return false;
		} else if (!instroduction.equals(other.instroduction))
			return false;
		if (jointime == null) {
			if (other.jointime != null)
				return false;
		} else if (!jointime.equals(other.jointime))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", jointime=" + jointime
				+ ", instroduction=" + instroduction + ", imagePath=" + imagePath + ", sex=" + sex + ", role=" + role
				+ "]";
	}

}


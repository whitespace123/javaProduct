package cc.whitespace123.enity;

import java.sql.Date;

public class Message {
	private Integer id;
	private String content;
	private Date sendTime;
	private User userId;
	private User otherId;

	public Message() {
		super();
	}

	public Message(Integer id, String content, Date sendTime, User userId, User otherId) {
		super();
		this.id = id;
		this.content = content;
		this.sendTime = sendTime;
		this.userId = userId;
		this.otherId = otherId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public User getOtherId() {
		return otherId;
	}

	public void setOtherId(User otherId) {
		this.otherId = otherId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((otherId == null) ? 0 : otherId.hashCode());
		result = prime * result + ((sendTime == null) ? 0 : sendTime.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		Message other = (Message) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (otherId == null) {
			if (other.otherId != null)
				return false;
		} else if (!otherId.equals(other.otherId))
			return false;
		if (sendTime == null) {
			if (other.sendTime != null)
				return false;
		} else if (!sendTime.equals(other.sendTime))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", content=" + content + ", sendTime=" + sendTime + ", userId=" + userId
				+ ", otherId=" + otherId + "]";
	}

}

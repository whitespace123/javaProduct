package cc.whitespace123.service;

import java.util.List;

import cc.whitespace123.enity.Message;

public interface MessageService {
	void saveMessage(Message message);

	void removeMessage(Message message);

	void modifyMessage(Message message);

	Message findMessage(Message message);

	List<Message> findMessagees(Message message);
}

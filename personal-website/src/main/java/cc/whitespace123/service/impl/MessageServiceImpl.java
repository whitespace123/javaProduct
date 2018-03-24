package cc.whitespace123.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cc.whitespace123.enity.Message;
import cc.whitespace123.mapper.MessageMapper;
import cc.whitespace123.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {
	@Autowired
	@Qualifier(value = "messageMapper")
	private MessageMapper messageMapper;

	@Override
	public void saveMessage(Message message) {
		messageMapper.insertMessage(message);
	}

	@Override
	public void removeMessage(Message message) {
		messageMapper.deleteMessage(message);
	}

	@Override
	public void modifyMessage(Message message) {
		messageMapper.updateMessage(message);
	}

	@Override
	public Message findMessage(Message message) {
		Message target = messageMapper.selectMessage(message);
		return target;
	}

	@Override
	public List<Message> findMessagees(Message message) {
		List<Message> messages = messageMapper.selectMessages(message);
		return messages;
	}

}

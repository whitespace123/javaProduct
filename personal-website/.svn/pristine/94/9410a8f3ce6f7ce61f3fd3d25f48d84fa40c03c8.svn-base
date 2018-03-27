package cc.whitespace123.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cc.whitespace123.enity.Reply;
import cc.whitespace123.mapper.ReplyMapper;
import cc.whitespace123.service.ReplyService;

@Service
public class ReplyServiceImpl implements ReplyService {
	@Autowired
	@Qualifier(value = "replyMapper")
	private ReplyMapper replyMapper;

	@Override
	public void saveReply(Reply reply) {
		replyMapper.insertReply(reply);
	}

	@Override
	public void removeReply(Reply reply) {
		replyMapper.deleteReply(reply);
	}

	@Override
	public void modifyReply(Reply reply) {
		replyMapper.updateReply(reply);
	}

	@Override
	public Reply findReply(Reply reply) {
		Reply target = replyMapper.selectReply(reply);
		return target;
	}

	@Override
	public List<Reply> findReplyies(Reply reply) {
		List<Reply> replies = replyMapper.selectReplies(reply);
		return replies;
	}

}

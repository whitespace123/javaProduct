package cc.whitespace123.service;

import java.util.List;
import cc.whitespace123.enity.Reply;

public interface ReplyService {
	void saveReply(Reply reply);

	void removeReply(Reply reply);

	void modifyReply(Reply reply);

	Reply findReply(Reply reply);

	List<Reply> findReplyies(Reply reply);
}

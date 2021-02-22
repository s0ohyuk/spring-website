package kr.co.service;

import java.util.List;

import kr.co.vo.ReplyVO;

public interface ReplyService {

	public List<ReplyVO> readReply(int bno) throws Exception;
	
	public void writeReply(ReplyVO vo) throws Exception;
	
	//댓글 수정
	public void updateReply(ReplyVO vo) throws Exception;
		
	//댓글 삭제
	public void deleteReply(ReplyVO vo) throws Exception;

	//선택된 댓글 조회 
	public ReplyVO selectReply(int rno) throws Exception;
}

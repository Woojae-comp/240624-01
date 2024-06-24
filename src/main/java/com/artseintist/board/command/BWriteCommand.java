package com.artseintist.board.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.artseintist.board.dao.BoardDao;

public class BWriteCommand implements BComannd {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		// 내용만 넣으면 됨
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		
		String bname = request.getParameter("bname");
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");

		BoardDao boardDao = new BoardDao();
		boardDao.writeOk(bname, btitle, bcontent);
		
	}

}

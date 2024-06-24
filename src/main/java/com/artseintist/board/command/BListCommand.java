package com.artseintist.board.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.artseintist.board.dao.BoardDao;
import com.artseintist.board.dto.BoardDto;

public class BListCommand implements BComannd {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

		BoardDao boardDao = new BoardDao();
		ArrayList<BoardDto> bDtos = boardDao.list();
		
		model.addAttribute("boardList",bDtos);
		
		
	}

}

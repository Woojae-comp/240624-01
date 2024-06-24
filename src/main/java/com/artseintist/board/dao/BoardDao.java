package com.artseintist.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

import com.artseintist.board.dto.BoardDto;
import com.artseintist.board.util.Constant;

public class BoardDao {

	
	// 멤버변수(멤버객체)?
	DataSource dataSource;
	JdbcTemplate template;

	public BoardDao() {
		this.template = Constant.template;
			
	}
	
	
	public void writeOk(final String bname, final String btitle, final String bcontent) {
			this.template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				// TODO Auto-generated method stub
				String sql = "INSERT INTO springboard (bname, btitle, bcontent, bhit) Values(?, ?, ?, 0)";

				PreparedStatement pstmt = con.prepareStatement(sql);

				pstmt.setString(1, bname);
				pstmt.setString(2, btitle);
				pstmt.setString(3, bcontent); // 중간에 입력받은 것을 바뀌지 않게 하기 위해서 final로 선언

				return pstmt;
			}
		});
			
		
		
		
	}
	
	public ArrayList<BoardDto> list() {
		String sql = "SELECT * FROM springboard ORDER BY bnum DESC";
		
		ArrayList<BoardDto> boardDtos = 
				(ArrayList<BoardDto>) this.template.query(sql, new BeanPropertyRowMapper(BoardDto.class));
		// 첫째 sql 둘째 bean으로 해서 형변환이 필요함
		
		return boardDtos;
	}
}

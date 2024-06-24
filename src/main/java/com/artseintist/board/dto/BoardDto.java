package com.artseintist.board.dto;

public class BoardDto {
	private int bnum; // 게시판 글번호
	private String bname; // 게시판 글쓴이
	private String btitle; // 게시판 글제목
	private String bcontent; // 게시판 글내용
	private int bhit; // 게시판 조회수
	private String bdate; // 게시판 등록일시
	
	public BoardDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BoardDto(int bnum, String bname, String btitle, String bcontent, int bhit, String bdate) {
		super();
		this.bnum = bnum;
		this.bname = bname;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bhit = bhit;
		this.bdate = bdate;
	}

	public int getBnum() {
		return bnum;
	}

	public void setBnum(int bnum) {
		this.bnum = bnum;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public int getBhit() {
		return bhit;
	}

	public void setBhit(int bhit) {
		this.bhit = bhit;
	}
	
	
	
}

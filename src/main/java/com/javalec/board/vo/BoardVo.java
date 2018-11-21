package com.javalec.board.vo;

public class BoardVo {
	private int seq;
	private String Title;
	private String Writer;
	private String Content;
	private String Regdate;
	private int Cnt;
	private String id;
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getWriter() {
		return Writer;
	}
	public void setWriter(String writer) {
		Writer = writer;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public String getRegdate() {
		return Regdate;
	}
	public void setRegdate(String regdate) {
		Regdate = regdate;
	}
	public int getCnt() {
		return Cnt;
	}
	public void setCnt(int cnt) {
		Cnt = cnt;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "BoardVO [seq=" + seq + ", title=" + Title + ", writer=" + Writer + ", content=" + Content + ", regdate="
				+ Regdate + ", cnt=" + Cnt + ", id=" + id + "]";
	}
	
	
}

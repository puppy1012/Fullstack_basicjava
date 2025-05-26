package jdbc.board;
//Table의 레코드를 구성하는 컬럼을 멤버필드로 정의한다.
//View데이터 -> 테이블의 레코드
//테이블의 레코드 -> View로 전달

import java.util.Date;

public class BoardDTO {
	private int id;
	private int hit;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	public BoardDTO() {}
	public BoardDTO(int id, int hit, String title, String writer, String content, Date regDate) {
		super();
		this.id = id;
		this.hit = hit;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regDate = regDate;
	}
	
	public BoardDTO(int id, int hit, String title, String writer, String content) {
		super();
		this.id = id;
		this.hit = hit;
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	@Override
	public String toString() {
		return "BoardDTO [id=" + id + ", hit=" + hit + ", title=" + title + ", writer=" + writer + ", content="
				+ content + ", regDate=" + regDate + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
	
	
}

package com.example.lastlibrary.models;

public class Book {
	int bookid;
	int publisherid;
	String isbnnumber;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookid, int publisherid, String isbnnumber) {
		super();
		this.bookid = bookid;
		this.publisherid = publisherid;
		this.isbnnumber = isbnnumber;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public int getPublisherid() {
		return publisherid;
	}
	public void setPublisherid(int publisherid) {
		this.publisherid = publisherid;
	}
	public String getIsbnnumber() {
		return isbnnumber;
	}
	public void setIsbnnumber(String isbnnumber) {
		this.isbnnumber = isbnnumber;
	}
	

}

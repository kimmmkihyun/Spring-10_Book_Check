package com.spring.ex;


import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class BookDTO {
	
	@NotEmpty(message="이름 누락")
	private String title;
	
	//@Min(value = 5 , message="") // 값을 의미 최소 5이상을 입력해야 한다
	@Length(min=5, message = "5이상으로 입력") //개수를 의미
	@NotEmpty(message="저자 누락")	  
	private String author;
	
	@Pattern(regexp="^[0-9]+$", message="숫자만 입력가능합니다.")
	private String price; 
	
	@NotEmpty(message="출판사 누락")
	private String publisher;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	} 
	
	
	
	
}


/*
 * 제목누락 
 * 저자누락 
 * 5글자이상 
 * price숫자
 */
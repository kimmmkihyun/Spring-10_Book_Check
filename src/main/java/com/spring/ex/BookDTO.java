package com.spring.ex;


import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class BookDTO {
	
	@NotEmpty(message="�̸� ����")
	private String title;
	
	//@Min(value = 5 , message="") // ���� �ǹ� �ּ� 5�̻��� �Է��ؾ� �Ѵ�
	@Length(min=5, message = "5�̻����� �Է�") //������ �ǹ�
	@NotEmpty(message="���� ����")	  
	private String author;
	
	@Pattern(regexp="^[0-9]+$", message="���ڸ� �Է°����մϴ�.")
	private String price; 
	
	@NotEmpty(message="���ǻ� ����")
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
 * ���񴩶� 
 * ���ڴ��� 
 * 5�����̻� 
 * price����
 */
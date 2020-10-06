<%@page import="com.spring.ex.BookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
resultView.jsp<br>

title : ${ bookDTO.title } <br>
author : ${ bookDTO.author } <br>
price : <%=((BookDTO)request.getAttribute("bookDTO")).getPrice() %> <br>
publisher : ${ bookDTO.publisher } <br>


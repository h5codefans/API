<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Date" %>
<%@taglib uri="/simpletag" prefix="sitcast" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>开发带属性的标签</title>
</head>
<body>

   <sitcast:demo5 count="9" date="<%=new Date() %>">
      aaaaaaaaaa
   </sitcast:demo5>
</body>
</html>
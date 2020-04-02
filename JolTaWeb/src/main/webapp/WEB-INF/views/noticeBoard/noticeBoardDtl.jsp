<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	@SuppressWarnings("unchecked")
	Map<String, String> noticeBoardDtl = (Map<String, String>)request.getAttribute("noticeBoardDtl");
%>
<html>
<link rel="stylesheet" href="/css/noticeBoard.css">
<body>
	<div class="notice_frame">
		<div class="notice_header">
			<h1><%=noticeBoardDtl.get("CBM_SUBJECT")%></h1>
		</div>
		<div class="notice_body">
			<%=noticeBoardDtl.get("CBM_DTL_SUBJECT")%>
			<%=noticeBoardDtl.get("CBM_DTL_CONTENT")%>
		</div>
		<div class="notice_bottom">
			
		</div>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h3>�α���</h3>
		<hr>
		<form action="joinpage.do">
			<table border="1" cellpadding="0" cellspacing="0" width=700px>
				<tr>
					<td width=20%>���̵�</td>
					<td>&nbsp;&nbsp;<input type="text" name="id" size="20" /></td>
				</tr>
				<tr>
					<td>��й�ȣ</td>
					<td>&nbsp;&nbsp;<input type="password" name="password"
						size="20" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="�α���" /></td>
				</tr>
			</table>
			<%if(session.getAttribute("error")!=null){%>
			<%=session.getAttribute("error") %>
			<% }%>
			<a href="joinform.jsp">ȸ������</a>
			<a href="findpassword.jsp">��й�ȣã��</a>
		</form>
		<hr>
	</center>
</body>
</html>
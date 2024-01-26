<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<body>
<h2>Hello World!</h2>

<button onclick="javascript:location.href='./home.do'">처음 요청</button>

<form action="./home.do" method="post">
	<input type="text" name="param" value="한글">
	<input type="submit" value="전송">
</form>
</body>
</html>

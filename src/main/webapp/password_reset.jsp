<<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>パスワード再設定</title>
</head>
<body>
        <h1>あぁわシステム</h1>
        <h2>パスワード再設定</h2>
        <form method="POST" action="menu.jsp">
            従業員番号<input type="number" name="id"><br>
            <!-- エラー表示-->  
            メールアドレス<input type="email" name="mail"><br>
			<!-- エラー表示-->
        </form>
        <button type="submit" value="メール送信"></button>
        <button onclick="location.href='menu.jsp'">戻る</button>
</body>
</html>
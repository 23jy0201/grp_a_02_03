<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン</title>
</head>
<body>
        <h1>あぁわシステム</h1>
        <h2>ログイン</h2>
        <form method="POST" action="menu.jsp">
            メールアドレス<input type="email" name="mail"><br>
			<!-- エラー表示-->
            パスワード<input type="text" name="pass"><br>
            <!-- エラー表示-->
            <input type="submit" value="ログイン"><br>
        </form>
        <a href="">パスワードを忘れた方はこちら</a>
</body>
</html>
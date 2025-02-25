<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">

<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="../css/systemp.css">
<title>シフト表</title>
</head>
<header>
	<h1>あぁわシステム</h1>
	<h2>シフト表</h2>
</header>
<body>
	<%
	//データベースからデータを取り出す用のスペース
	%>
	<menu>
		<button onclick="location.href='menu.jsp'">メニューに戻る</button>
	</menu>
	<main>
		<h2><%=//年月%></h2>
		<button onclick="">前の月へ</button>
		<button onclick="">次の月へ</button>
		<%
		//テーブルを作成する為のスペース
		%>
	</main>
	<button onclick="location.href='shift_change_date_entry.jsp'">シフトを変更する</button>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">

<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="../css/systemp.css">
<title>変更依頼内容確認</title>
</head>
<header>
	<h1>あぁわシステム</h1>
	<h2>変更依頼内容確認</h2>
</header>
<body>
	<%
	//データベースからデータを取り出す用のスペース
	%>
	<menu>
		<button onclick="location.href='menu.jsp'">メニューに戻る</button>
	</menu>
	<main>
		<%
		//テーブルを作成する為のスペース
		%>
		<p><%= %></p>
		<p><%= %></p>
		<p>上記の内容で変更を依頼します。</p>
	</main>
	<button onclick="location.href='agent_selection_complete.jsp'">確定</button>
	<button onclick="location.href='./agent_selection.jsp'">戻る</button>
</body>
</html>
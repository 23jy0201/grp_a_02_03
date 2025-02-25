<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">

<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="../css/systemp.css">
<title>予定給料明細</title>
</head>
<header>
	<h1>あぁわシステム</h1>
	<h2>予定給料明細</h2>
</header>
<body>
	<%
	//データベースからデータを取り出す用のスペース
	%>
	<main>
		<p>名前:<%=%></p>
		<p><%=%>年<%=%>月の推定勤務時間</p>
		<p>約<%=%>時間</p>
		<p><%=%>年<%=%>月の予定給料</p>
		<p>約<%=%>円</p>
		<p></p>
		<p>今年の推定勤務時間</p>
		<p>約<%=%>時間</p>
		<p>今年の予定給料</p>
		<p>約<%=%>円</p>

	</main>
	<button onclick="location.href='menu.jsp'">メニューに戻る</button>
</body>
</html>
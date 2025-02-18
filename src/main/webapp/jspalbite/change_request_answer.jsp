<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">

<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="../css/systemp.css">
<title>変更依頼回答</title>
</head>
<header>
	<h1>あぁわシステム</h1>
	<h2>変更依頼</h2>
</header>
<body>
	<main>
		<%
		//データベースからデータを取り出す用のスペース
		%>
		<menu>
			<button onclick="location.href='menu.jsp'">メニューに戻る</button>
		</menu>
		<table border="1">
			<thead>
				<tr>
					<th>日時</th>
					<th>変更依頼者</th>
					<th>""</th>
				</tr>
			</thead>
			<%
			//テーブルを作成する為のスペース
			%>
		</table>
	</main>
</body>
</html>
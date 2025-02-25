<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="../css/menu.css">
        <title>メニュー</title>
    </head>
    <body>
    	<h1>あぁわシステム</h1>
        <h2>メニュー</h2>
    	<%
		HttpSession hs =request.getSession(true);
		boolean shifts = (boolean)request.getAttribute("DesiredShifts");
		Object replacement_requestObj = request.getAttribute("replacement_request");
	    int replacement_request = 0; // デフォルト値

	    if (replacement_requestObj != null) {
	        try {
	            replacement_request = Integer.parseInt(replacement_requestObj.toString());
	        } catch (NumberFormatException e) {
	            replacement_request = 0; // パースエラー時も 0 にする
	        }
	    }
		boolean state = false;
		%>
		<%
		if (state == shifts){
		%>
        <p>18日までにシフト希望を提出してください</p>
        <%} %>
        <%
        if (replacement_request >= 1){
        %>
        <p>変更依頼が<%= replacement_request %>件届いています</p>
        <%} %>
        <div class="container">
            <div class="item"><a href="schedule.jsp">シフト表</a></div>
            <div class="item"><a href="">変更依頼</a></div>
            <div class="item"><a href="shiftRequest.html">シフト希望入力</a></div>
            <div class="item"><a href="">予定給料確認</a></div>
            <div class="item"><a href="Person_info_change">従業員情報変更</a></div>
            <div class="item"><a href="index.jsp">ログアウト</a></div>
          </div>
    </body>
</html>

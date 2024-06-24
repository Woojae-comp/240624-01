<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자유 게시판</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f9f9f9;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }
    .container {
        background-color: #fff;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        width: 600px;
    }
    h2 {
        color: #333;
        text-align: center;
    }
    table {
        width: 100%;
        border-collapse: collapse;
        margin-top: 20px;
    }
    td {
        padding: 10px;
    }
    td:first-child {
        text-align: right;
        font-weight: bold;
        color: #555;
    }
    input[type="text"], textarea {
        width: calc(100% - 20px);
        padding: 8px;
        margin: 5px 0;
        border: 1px solid #ccc;
        border-radius: 4px;
    }
    input[type="submit"], input[type="button"] {
        padding: 10px 20px;
        color: #fff;
        background-color: #007BFF;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        margin: 10px 5px;
    }
    input[type="submit"]:hover, input[type="button"]:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
    <div class="container">
        <h2>자유게시판 글쓰기</h2>
        <hr>
        <form action="writeOk">
            <table>
                <tr>
                    <td>이 름</td>
                    <td><input type="text" name="bname"></td>
                </tr>
                <tr>
                    <td>제 목</td>
                    <td><input type="text" name="btitle"></td>
                </tr>
                <tr>
                    <td>내 용</td>
                    <td><textarea rows="10" cols="45" name="bcontent"></textarea></td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align: center;">
                        <input type="submit" value="글입력">
                        <input type="button" value="글목록">
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>

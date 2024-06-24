<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 리스트</title>
<style>
    body {
        font-family: Arial, sans-serif;
    }
    h2 {
        color: #333;
    }
    table {
        width: 800px;
        border-collapse: collapse;
        margin: 20px 0;
    }
    table, th, td {
        border: 1px solid #ddd;
    }
    th, td {
        padding: 10px;
        text-align: center;
    }
    th {
        background-color: #f4f4f4;
    }
    .btn {
        padding: 5px 10px;
        margin: 2px;
        border: none;
        color: white;
        background-color: #5cb85c;
        cursor: pointer;
    }
    .btn-delete {
        background-color: #d9534f;
    }
</style>
</head>
<body>
    <h2>자유게시판 글 목록</h2>
    <hr>
    <table>
        <tr>
            <th>글번호</th>
            <th>글쓴이</th>
            <th width="400">글제목</th>
            <th>등록일</th>
            <th>조회수</th>
        </tr>
        
        <c:choose>
            <c:when test="${not empty boardList}">
                <c:forEach items="${boardList}" var="boardDto">
                <tr>
                    <td>${boardDto.bnum}</td>
                    <td>${boardDto.bname}</td>
                    <td>${boardDto.btitle}</td>
                    <td>${boardDto.bdate}</td>
                    <td>${boardDto.bhit}</td>
                </tr>
                </c:forEach>
            </c:when>
            <c:otherwise>
                <tr>
                    <td colspan="6">게시물이 없습니다.</td>
                </tr>
            </c:otherwise>
        </c:choose>
    </table>
</body>
</html>

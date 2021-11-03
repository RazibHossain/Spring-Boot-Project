<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 11/2/2021
  Time: 4:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create User</title>
</head>
<body>
<link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<h2 align="center">Create User </h2>

    <form class="form-horizontal" action='/User/Edit/' method="POST" modelAttribute="userform">
        <input type="hidden" name="id" value="${userform.id}">
       <br><br> User Name: <input type="text" id="username" name="userName" placeholder="" value="${userform.userName}"><br><br>
        Password: <input type="text" id="password" name="password" placeholder="" value="${userform.password}"><br><br>
       Role:  <input type="text" id="role" name="role" placeholder="" value="${userform.role}"><br><br>
        Enabled: <input type="int" id="enabled" name="enabled" placeholder="" value="${userform.isenabled()}"><br><br>

        <div class="control-group">
            <!-- Button -->
            <div class="controls">
                <button class="btn btn-success">Add User</button>
            </div>
        </div>
    </form>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
             "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <h1>Выберите город</h1>
<form:form modelAttribute="formData" method="POST">
    <form:select path="city">
        <form:option value="samara">Samara</form:option>
        <form:option value="moscow">Moscow</form:option>
        <form:option value="ufa">Ufa</form:option>
    </form:select>
    <input type="submit" />
</form:form>
</body>
</html>
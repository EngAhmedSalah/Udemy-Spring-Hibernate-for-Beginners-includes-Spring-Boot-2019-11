<html>
<head>
    <title>Hello World</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/CSS/style.css">
</head>
<body>
    <div class="home">
        Student Name : ${param.studentName} <br><br>
        Message : ${message}
    </div>
</body>
</html>

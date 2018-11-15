<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\11\13 0013
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .loginbackground{
            background-color: #B7D4FF;
            height: 70%;
            width: 100%;
            padding-top: 50px;
        }
        .logincss{
            position: absolute;
            background-color: #FFFFFF;
            border-radius: 15px;
            height: 280px;
            width: 300px;
            padding: 30px;
            margin-top: 10%;;
            margin-left: 60%;
            top: 0;
            left: 0;
            right: 100px;
            bottom: 0;
        }

        .loginbtn{
            background-color: #3795FF;
            width:240px;
            height: 40px;
            text-align: center;
            color: #FFFFFF;
            font-size: 21px;
            font-family: 微软雅黑;
            border-radius: 6px;
            margin: auto;
            padding: 5px;
            cursor: pointer;
        }
        .loginbtn:hover{
            background-color:#26BEFF ;
        }

    </style>
</head>
<body>
<div style="background: #1F686D;width: 100%;height: 100%">
    <div class="logincss">
        <div style="font-weight: bold;font-family:黑体;font-size: 23px;text-align: center;padding-bottom: 30px">
            <span >用户登录</span>
        </div>
        <form method="post" id="log_in" action="${pageContext.request.contextPath}/login">
            <div class="input-group" style="padding-bottom: 20px">
                <span class="input-group-addon" id="basic-addon1" style="width: 50px">
                    <span class="glyphicon glyphicon-user"></span>
                </span>
                <input type="text" name="username" class="form-control"  aria-describedby="sizing-addon1">
            </div>
            <div class="input-group" style="padding-bottom: 20px">
                <span class="input-group-addon" id="basic-addon2" style="width: 50px">
                    <span class="glyphicon glyphicon-lock"></span>
                </span>
                <input type="password" name="password" class="form-control"  aria-describedby="sizing-addon1">
            </div>
            <div id="loading" class="loginbtn" onclick="fo_sunbimt()">
                登陆
            </div>
        </form>
    </div>
</div>

<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script>


    function fo_sunbimt() {
        var f = document.getElementById("log_in") ;
        f.submit() ;

    }


</script>

</body>
</html>

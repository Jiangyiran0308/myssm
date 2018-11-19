<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\11\13 0013
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    // 获得项目完全路径（假设你的项目叫MyApp，那么获得到的地址就是http://localhost:8080/MyApp/）:
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>

    <base href=" ${pageContext.request.contextPath}">

    <title>用户认证</title>
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <link rel="shortcut icon" href="/static/favicon.ico">
    <link href="/assets/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .logo{
            float: left;
            background: url("/assets/hyt/hytlogo.png");
            height: 34px;
            width: 110px;
            margin-top: 2%;
            margin-left: 2%;
        }
        .loginbackground{
            background: url("/assets/wall.jpg");
            width: 100%;
            height: 100%
        }
        .loginFrame{
            float: right;
            padding: 1.7%;
            margin-top: 10%;
            margin-right: 15%;
            width: 20%;
            min-width: 300px;
            height: 40%;
            background: rgba(255,255,255,0.2);
            /*background: #ffffff;*/
            color: #FFFFFF;
        }
        .logincss{
            position: absolute;
            background-color: #FFFFFF;
            border-radius: 15px;
            height: 280px;
            width: 300px;
            padding: 30px;
            margin-top: 10%;;
            margin-right: 20%;
            top: 0;
            left: 0;
            right: 100px;
            bottom: 0;
        }

        .loginbtn{
            background-color: #3795FF;
            width:100%;
            /*height: 16%;*/
            /*line-height: 16%;*/
            padding-top: 3%;
            padding-bottom: 3%;
            text-align: center;
            color: #FFFFFF;
            font-size: 2vh;
            font-family: 微软雅黑;
            border-radius: 6px;
            margin: auto;
            /*padding: 5px;*/
            cursor: pointer;
        }
        .loginbtn:hover{
            background-color:#26BEFF ;
        }

    </style>
</head>
<body>
<div class="loginbackground">
    <div class="logo"></div>
    <div class="loginFrame">
        <div style="font-weight: bold;font-family:黑体;font-size: 3vh;text-align: center;margin-bottom: 10%;">
            <span >用户认证</span>
        </div>
        <form method="post" id="log_in" action="/login">
            <div class="input-group" style="margin-bottom: 10%;width: 98%">
                <span class="input-group-addon" id="basic-addon1" style="width: 40px">
                    <span class="glyphicon glyphicon-user"></span>
                </span>
                <input type="text" name="username" class="form-control"  aria-describedby="sizing-addon1">
            </div>
            <div class="input-group" style="margin-bottom: 13%;width: 98%">
                <span class="input-group-addon" id="basic-addon2" style="width: 40px">
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
<%--<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>--%>
<script src="/assets/jquery-3.3.1.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="/assets/bootstrap/js/bootstrap.min.js"></script>
<%--<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>--%>

<script>


    function fo_sunbimt() {
        var f = document.getElementById("log_in") ;
        f.submit() ;

    }


</script>

</body>
</html>

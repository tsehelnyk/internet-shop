
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>Login page</title>
    </head>
    <body>
        Hello)
        <p style="color:red;">${errorMessage}</p>

        <form action="/internet_shop_war_exploded/login" method="post">
            <div class="container">
                <h1>Login page</h1>
                <p>Enter login and password to enter in account.</p>
                <hr>

                <label for="login"><b>Login</b></label>
                <input type="text" placeholder="Enter login" name="login" required>

                <label for="psw"><b>Password</b></label>
                <input type="password" placeholder="Enter Password" name="psw" required>

                <button type="submit" class="loginbtn">Login</button>
            </div>
        </form>
        <div class="container signin">
            <p>Already haven't an account? <a href="/internet_shop_war_exploded/registration">Sign up</a>.</p>
            <a href="/internet_shop_war_exploded/inject">Inject</a>
            <hr>
            <a href="/internet_shop_war_exploded/servlet/index">Main menu</a>
            <hr>
        </div>
    </body>
</html>

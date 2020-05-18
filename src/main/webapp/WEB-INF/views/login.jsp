<!DOCTYPE html>
<html>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <title>Registration</title>
    </head>
    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed"
                            data-toggle="collapse" data-target="#navbar" aria-expanded="false"
                            aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span> <span
                            class="icon-bar"></span> <span class="icon-bar"></span> <span
                            class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="<c:url value="/" />">Registration and Login Module</a>
                </div>
            </div>
        </nav>
        <br>
        <br>
        <div class="container">
            <div class="row">
                <div class="col-md-6 col-md-offset-3">
                    <h1>Login page</h1>
                    <form action="<c:url value="/login"/>" method="post">
                        <c:if test="${param.error}">
                            <div class="${error}">
                                <div class="alert alert-danger">Invalid username or
                                    password.</div>
                            </div>
                        </c:if>
                        <c:if test="${param.logout}">
                            <div class="${logout}">
                                <div class="alert alert-info">You have been logged out.</div>
                            </div>
                        </c:if>    
                        <div class="form-group">
                            <label for="username">Username</label>: <input type="text"
                                                                           id="username" name="username" class="form-control"
                                                                           autofocus="autofocus" placeholder="Username" />
                        </div>
                        <div class="form-group">
                            <label for="password">Password</label>: <input type="password"
                                                                           id="password" name="password" class="form-control"
                                                                           placeholder="Password" />
                        </div>
                        <div class="form-group">
                            <div class="row">
                                <div class="col-sm-6 col-sm-offset-3">
                                    <input type="submit" name="login-submit" id="login-submit"
                                           class="form-control btn btn-primary" value="Log In" />
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <span>New user? <a href="<c:url value="/registration" />" >Register
                                    here</a></span>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    </body>
</html>

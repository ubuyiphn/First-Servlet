<%-- 
    Document   : sigup
    Created on : Dec 12, 2021, 4:20:22 AM
    Author     : Himanshu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Signup</title>
        <!-- Compiled and minified CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

        <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
            
            
    </head>
    <body style="background: url(img/wallpaper.jpg)">
        <div class="container">
            <div class="row">
                <div class="col m6 offset-m3">
                    <div class="card">
                        <div class="card-content">
                            <h3>Register here ...!!</h3>
                            <div class="form center-align">
                                <form action="Register">
                                    <input type="text" placeholder="Enter your name here" name="user_name">
                                    <input type="password" placeholder="Enter your password here" name="user_password">
                                    <input type="email" placeholder="Enter your email here" name="user_email">
                                    <br><br>
                                    <button type="submit" class="btn #64dd17">Register</button>
                                </form>
                                <div class="loader" style="margin-top: 10px; display: none">
                                    <div class="preloader-wrapper big active">
                                        <div class="spinner-layer spinner-blue-only">
                                            <div class="circle-clipper left">
                                                <div class="circle"></div>
                                            </div>
                                            <div class="gap-patch">
                                                <div class="circle">
                                                    
                                                </div>
                                            </div>
                                                <div class="circle-clipper right">
                                                    <div class="circle">
                                                        
                                                    </div>
                                                </div>
                                        </div>
                                    </div>
                                    <h5>Please wait...</h5>
 
                                </div>
                            </div>
                        </div>
                    </div>
                   
                        
                    </div>
                    
                </div>
                
            </div>
            
        </div>
        <script
           src="https://code.jquery.com/jquery-3.6.0.min.js"
           integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
           crossorigin="anonymous">
        </script>
        <script>
            $(document).ready(function(){
                console.log("Page is ready..")
            })
        </script>
    </body>
</html>

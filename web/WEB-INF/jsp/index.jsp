<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project1</title>
    </head>

    <body>
        <form>
            <h1> Registration Form</h1>
 <form:for<m method="post" action="save">
   <tr>  Name <input type="text" name="Name" maxlength="8" required><br><br></tr>
    <tr>
        
     Email-id <input type="text" name="Email-id" required><br><br>    </tr>

     Password <input type="password" name="password"  maxlength="8" required><br><br>    </tr>

Course <select>
<option value="select course"> select course </option>
<option value="B.E/B.Tech">B.E/B.Tech</option>
<option value="M.E/M.Tech">M.E/M.Tech</option>
<option value="B.Sc">B.Sc</option>
<option value="M.Sc">M.Sc</option>
<option value="MCA">MCA</option></select><br><br>
    </tr>

Specilization<select>
 <option value=""select specilization"> select specilization</option>
<option value="Computer Science">Computer Science</option>
<option value="Electrical and Electronics">Electrical and Electronics</option>
<option value="Electronics and Communication">Electrical and communication</option>
<option value="Electrical and Instrumentation">Electrical and Instrumentation</option>
<option value="Maths">Maths</option></select><br><br>
</tr>
<tr>
Year Of Passing<select>
<option value="2013">2013</option>
<option value="2014">2014</option>
<option value="2015">2015</option>
<option value="2016">2016</option>
<option value="2017">2017</option></select>
<br><br></tr>
<tr>
Total Experience in years<select>
<option value="0">0</option>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option></select>
<br><br></tr>
<tr>
    Key Skills<input type="text" name="Key Skill"><br><br></tr>
<tr>
    Current Location<input type="text" name="Current Location"><br><br></tr>
<tr>Resume<input type="file" name="fileupload" value="fileupload"></tr>

<br><br>
<tr>
<input type="submit" value="submit"><tr>
    </form>
<form:for<m method="post" action="view">
    <tr><input type="button" value="view"></tr>
</form>
    </body>
</html>

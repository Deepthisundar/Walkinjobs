<%-- 
    Document   : viewdetails
    Created on : Jul 14, 2017, 10:49:26 AM
    Author     : mvaikundam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="2" width="70%" cellpadding="2">  
         
          <c:forEach var="jobseeker" items="${list}">   
            <tr>
                <td>Name:</td>
                <td>${jobseeker.name}</td>  
            </tr>
            <tr> 
                <td>Email Id:</td>
                <td>${jobseeker.emailid}</td>
            </tr>
            <tr>
                <td> Password:</td>
                <td>${jobseeker.password}</td>
            </tr>
            <tr>
                <td>Mobile:</td>
                <td>${jobseeker.mobile}</td>
            </tr>
            <tr>
                <td>Course</td>
                <td>${jobseeker.course}</td>
            </tr>
            <tr>
                <td>Specilization</td>
                <td>${jobseeker.specilization}</td>
            </tr>
            <tr>
                <td>Year of Passing</td>
                <td>${jobseeker.yearofpassing}</td>
            </tr>
            <tr>
                <td>experience</td>
                <td>${jobseeker.experience}</td>
            </tr>
            <tr>
                <td>KeySkills</td>
                <td>${jobseeker.keyskills}</td>
            </tr>
            <tr>
                <td>CurrentLocation</td>
                <td>${jobseeker.currentlocation}</td>
            </tr>              
                
                
            </tr>  
         </c:forEach> 
   </table>  
    </body>
</html>

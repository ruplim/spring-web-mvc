<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>

<html>
  <head>
     <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
     <title>Welcome Message</title>
     
     <style>
       .error {
          color : #ff0000;
       }
       
       .errorblock {
          color: #000;
          background-color: #ffEEEE;
          border : 3px solid #ff0000;
          padding : 8px;
          margin : 16px;
       }
     </style>
     
   </head>
   <body>
     <form:form modelAttribute="message" action="init" method="POST">
       <form:errors path="*" cssClass="errorBlock" element="div"/>
        <table>
           <tr>
             <td colspan="2">Language: <a href="?language=en">English</a> | <a href="?language=es">Spanish</a></td>
           </tr>        
           <tr>
             <td><spring:message code="initial.message"/></td>
             <td><form:input path="welcomeMsg" /></td>
           </tr>
           <tr>
             <td><spring:message code="initial.count"/></td>
             <td><form:input path="count" cssErrorClass="error"/></td>
             <td><form:errors path="count" cssClass="error" /></td>
           </tr>           
           <tr>
             <td colspan="3"><input type="submit" value="Post Message"></td>
           </tr>
        </table>
     </form:form>
   </body>
</html>
<%@ page language="java" import="java.util.*" pageEncoding="utf8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>BookManageSystem</title>
    
	
  </head>
  
  <body bgcolor='#71CABF'>
    <form action="loginServlet" method="post">
    	<table>
    		<caption>User Login</caption>
    		<tr>
    		<td>Name</td>
    		<td><input name="name" type="text" size="20"/></td>
    		</tr>
    		<tr>
    			<td>Password</td>
    			<td><input name="password" type="password" size="21"/></td>
    		</tr>
    	</table>
    	<input type="submit" value="login" />
    	<input type="reset" value="reset"/>
    </form>
  </body>
</html>

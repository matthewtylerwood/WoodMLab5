<%-- 
    Document   : index
    Created on : Oct 9, 2013, 5:22:32 PM
    Author     : Matthew
--%>

<?xml version = "1.0" encoding = "utf-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!-- index.jsp
Form for salary calculator
-->
<html xmlns = "http://www.w3.org/1999/xhtml">
	<head> <title> Salary Analyzer </title>
    </head>
	<body>
    <h1> Salary Analyzer </h1>
    <p> Use this to project you salary over the years. </p>
	<hr />
    <form action = "http://pluto.cse.msstate.edu:10015/Lab5/SalaryCalc" method = "get">
   	  <table>
      	<tr>
        	<td>
            	Starting Salary: 
            </td>
            <td>
            	<input type = "text" name = "start" />
            </td>
        </tr>
        <tr>
        	<td>
            	Raise Percentage: 
            </td>
            <td>
            	<input type = "text" name = "raise" />
            </td>
        </tr>
        <tr>
        	<td>
            	Years Planning to Work: 
            </td>
            <td>
            	<input type = "text" name = "years" />
            </td>
        </tr>
      </table>
      <p>
        	<input type = "submit" value = "Submit" />
            <input type = "reset" value = "Reset" />
        </p>
    </form>
    </body>
</html>

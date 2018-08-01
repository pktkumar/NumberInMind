<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>spring boot form submit example</title>
</head>
<body>

<form method="post" action="PageThree" > 
<br>


<table>
	<tr>
		<td> <h1><label for="One">2,</label></h1></td>
		
		<td> <h1><label for="Two">4,</label></h1></td>

		<td> <h1><label for="Four">5,</label></h1></td>

		<td><h1> <label for="Five">7,</label></h1></td>
		
		<td><h1> <label for="Six">9,</label></h1></td>
		
		<td><h1> <label for="Ten">10</label></h1></td>


</tr>


<tr>
<td><font color="green"> <strong><a href="PageThree?value=2&currentValue=${currentValue}" >Yes</a></strong> </font></td>
<td></td>
<td></td>
<td></td>
<td><font color="red"> <strong><a href="PageThree?value=0&currentValue=${currentValue}" >No</a></strong> </font></td>
</tr>
</table>

 






<br>
<br>

 
 


</form>
</body>
</html>
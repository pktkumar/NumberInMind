<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>spring boot form submit example</title>
</head>
<body>






<form method="post" action="PageTwo"> 
<br>


<table>
	<tr>
		<td> <h1><label for="One">1,</label></h1></td>
		
		<td> <h1><label for="Two">3,</label></h1></td>

		<td> <h1><label for="Four">4,</label></h1></td>

		<td> <h1><label for="Five">6,</label></h1></td>
		
		<td> <h1><label for="Six">7</label></h1></td>



</tr>

<tr>
<td><font color="green"> <strong><a href="PageTwo?value=1" >Yes</a></strong> </font></td>
<td></td>
<td></td>
<td></td>
<td><font color="red"> <strong><a href="PageTwo?value=0" >No</a></strong> </font></td>
</tr>
</table>













<br>
<br>

 


</form>
</body>
</html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>spring boot form submit example</title>
</head>
<body>






<form> 
<br>

<table>
	<tr>
		<td> <h1><label for="One">1,</label></h1></td>
		
		<td> <h1><label for="Two">3,</label></h1></td>

		<td> <h1><label for="Four">4,</label></h1></td>

		<td> <h1><label for="Five">5,</label></h1></td>
		
		<td> <h1><label for="Six">8</label></h1></td>
</tr>		
		
<tr>
<td><font color="green"> <strong><a href="PageFour?value=3&currentValue=${currentValue}" >Yes</a></strong> </font></td>
<td></td>
<td></td>
<td></td>
<td><font color="red"> <strong><a href="PageFour?value=0&currentValue=${currentValue}" >No</a></strong> </font></td>
</tr>




</table>




<br>
<br>

 


</form>
</body>
</html>
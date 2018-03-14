<html>
<body>
<h2>Jersey RESTful Web Application!</h2>
<p><a href="home/index">Jersey resource</a>
<p><a href="home/messages/comment">Messages</a>
<p><a href="home/test">Year</a>
<p><a href="home/employee">Employee</a>
<p>Visit the <a href="http://jersey.java.net">Project Jersey website</a>
for more information on Jersey!
</body>
<form action="home/product/add" method="post">
    Enter Id:<input type="text" name="id"/><br/><br/>
    Enter Name:<input type="text" name="name"/><br/><br/>
    Enter Price:<input type="text" name="price"/><br/><br/>
    <input type="submit" value="Add Product"/>
</form>
</html>

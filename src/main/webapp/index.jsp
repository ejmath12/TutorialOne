<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page  isELIgnored="false" %> 
 
<html>
<body>
<h2>Hello World!</h2>
 
I am feeling: ${ mood.feeling }.
<form action="/one/why" method="post">
        <input type="hidden" name="mood" value=${ mood.feeling } />
                <input type="submit" value="Why is tomcat feeling this way?" />
</form>
</body>
</html>
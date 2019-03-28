<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
    <title><tiles:insertAttribute name="title" /></title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
</head>
<body>
<c:set var = "currentURL" value ="${requestScope['javax.servlet.forward.request_uri']}"/>
	<c:if test="${currentURL ne '/one/'}">
<a id = "homelink" href="/one">Home</a>
	</c:if>
      	<c:if test="${currentURL ne '/one/about'}">
<a id = "aboutlink" href="/one/about">About</a>
	</c:if>
    <tiles:importAttribute name="currentPage" scope="request" />
 
    <!-- Main -->
    <tiles:insertAttribute name="content" />
 
    <!-- Footer -->
    <div>
        <tiles:insertAttribute name="footer" />
    </div>
</body>
</html>
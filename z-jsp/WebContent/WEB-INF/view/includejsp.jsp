<html>
<body>
//including two pages in the directive
<%@ include file="include1.html"%>
<%@ include file="include1.jsp"%>
<hr color="blue">

//including two pages in the action mode
<jsp:include page="include1.html" flush="true"/><br>
<jsp:include page="include1.jsp" flush="true"/><br>
</body>
</html>
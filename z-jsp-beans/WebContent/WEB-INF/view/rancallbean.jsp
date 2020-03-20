<html><body>

<h3> Getting value from bean</h3>

<jsp:useBean id="ran" class="ranbean.rancallbean"/>
My Name is: <jsp:getProperty name="ran" property="name"/> <br>
My Area is: <jsp:getProperty name="ran" property="area"/> <br>

</body><html>
<%@tag description="Default Layout Tag" pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@attribute name="title" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>
        <c:if test="${not empty title}" > :: ${title}</c:if>
    </title>

    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.0/css/font-awesome.min.css">

    <!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">

    <!-- Material Design Bootstrap -->
    <link href="<c:url value="/resources/css/mdb.min.css"/>" rel="stylesheet">

    <script src="webjars/jquery/1.9.1/jquery.js"></script>
    <!-- Bootstrap tooltips -->
    <script type="text/javascript" src="<c:url value="/resources/js/bootstrap.js"/>"></script>

    <!-- Bootstrap core JavaScript -->
    <script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/tether.min.js"/>"></script>
    <!-- MDB core JavaScript -->
    <script type="text/javascript" src="<c:url value="/resources/js/mdb.min.js"/>"></script>

</head>
<body>
<jsp:include page="/WEB-INF/jsp/blocks/menu.jsp"/>


<jsp:doBody/>
</body>
</html>

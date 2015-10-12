<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <!-- Meta -->
        <meta charset="utf-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <meta name="keywords" content="MediaCenter, Template, eCommerce">
        <meta name="robots" content="all">

        <title>Smart Shopping - Buy Right, Buy Smart...</title>

        <jsp:include page="css.jsp" />
 
    </head>
<body>
    
    <div class="wrapper">

        <tiles:insertAttribute name="header" />

        <div class="container">
        
            <tiles:insertAttribute name="navigationVertical" ignore="true" />

            <tiles:insertAttribute name="content" />

        </div><!-- /.container -->
    </div><!-- /#top-banner-and-menu -->

    <tiles:insertAttribute name="extras" ignore="true" />

    <tiles:insertAttribute name="footer" ignore="true" />

    <jsp:include page="js.jsp" />

</body>
</html>
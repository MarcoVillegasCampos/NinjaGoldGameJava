<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" href="./css/styles.css"/>
	</head>
	<body>
	<div class="mainContainer">

        <div class="topNavy">
            <label for="gold">Your Gold: </label>
            <input type="text" value="${gold}">
        </div>

    <div class="containers">
    	<form action="/farm" method="post">
        	<div class="cube">
            <h1>Farm</h1>
            <h2>(earns 10-20 gold)</h2>
            <button type="submit">Find Gold</button>
        </form>

        </div>
        <div class="cube">
        <form action="/cave" method="post">
            <h1>Cave</h1>
            <h2>(earns 5-10 gold)</h2>
            <button type="submit">Find Gold</button>
		</form>
        </div>
        <div class="cube">
        <form action="/house" method="post">
            <h1>House</h1>
            <h2>(earns 2-5 gold)</h2>
            <button type="submit">Find Gold</button>
		</form>
        </div>
        <div class="cube">
        <form action="/casino" method="post">
            <h1>Casino</h1>
            <h2>(earns/takes 0-50 gold)</h2>
            <button type="submit">Find Gold</button>
        </form>


        </div>



    </div>
   
    <div class="activities">
    	<h2>Activities</h2>		
    	<div class="activityContainer">
 
    	
    	<c:forEach var="log" items="${log}">
    		<c:choose>
    	
    			
    			<c:when test="${log.contains('earned')}">
    			<p class="green">"${log }"</p>
    			</c:when>
    			<c:otherwise>
    			<p style="color:red">"${log }"</p>
    			</c:otherwise>
    	
    
    		</c:choose> 	  		
   		</c:forEach>
   		
   	
   		
    	</div>
    </div>




    

	</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
</head>

<body>
	<input type="text" id="bzwr_ttl" name="name" />
	<input type="text" id="bzwr_cntn" name="name" />
	<input type="text" id="last_chng_usrno" name="name" />
	<button type="button" id="submit">test button</button>
</body>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$('#submit').click(function(){
	var bzwr_ttl=$('#bzwr_ttl').val();
	var bzwr_cntn=$('#bzwr_cntn').val();
	var last_chng_usrno=$('#last_chng_usrno').val(); 
	var form={
		bzwrDstc : "ABC",
		bzwrTtl : bzwr_ttl,
		bzwrCntn : bzwr_cntn,
		lastChngUsrno : last_chng_usrno
	};
	console.log(form);
	
	$.ajax({
	    type:'POST',
	    url: '/board/write',
	    dataType: 'json',
	    contentType:"application/json",
	    data: JSON.stringify(form),
	    
	    success: function(data){
	       console.log("success post test");
	       console.log(data);
	    },
	    error: function(request, status, error){
			console.log("fail...");
	    }  
	 })
});
</script>
</html>
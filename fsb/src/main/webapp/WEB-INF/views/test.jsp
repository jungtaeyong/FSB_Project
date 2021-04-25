<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
</head>

<body>
	<input type="text" id="BZWR_DSTC" name="name" />
	<input type="text" id="JOB_CD" name="name" />
	<button type="button" id="submit">test button</button>
</body>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$('#submit').click(function(){
	var BZWR_DSTC=$('#BZWR_DSTC').val();
	var JOB_CD=$('#JOB_CD').val();
	var testdata={
		BZWR_DSTC : BZWR_DSTC,
		JOB_CD : JOB_CD 
	};
	console.log(testdata);
	
	$.ajax({
	    type:'POST',
	    url: '/board/test',
	    dataType: 'json',
	    contentType:"application/json",
	    data: JSON.stringify(testdata),
	    
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
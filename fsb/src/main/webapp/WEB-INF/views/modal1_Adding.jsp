<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<!-- jquery  -->
	<script type="text/javascript" src="resources/js/jquery-3.6.0.min.js"></script>
	
	<!-- bootstrap -->
	<link rel="stylesheet" type="text/css" href="resources/lib/Bootstrap-4-4.1.1/css/bootstrap.min.css"/>
	<script type="text/javascript" src="resources/lib/Bootstrap-4-4.1.1/js/bootstrap.min.js"></script>
	


    
<!-- 드롭다운 style -->
    <style>
	.dropbtn {
	  background-color: #4CAF50;
	  color: white;
	  padding: 16px;
	  font-size: 16px;
	  border: none;
	}
	
	.dropdown {
	  position: relative;
	  display: inline-block;
	}
	
	.dropdown-content {
	  display: none;
	  position: absolute;
	  background-color: #f1f1f1;
	  min-width: 160px;
	  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
	  z-index: 1;
	}
	
	.dropdown-content a {
	  color: black;
	  padding: 12px 16px;
	  text-decoration: none;
	  display: block;
	}
	
	.dropdown-content a:hover {background-color: #ddd;}
	
	.dropdown:hover .dropdown-content {display: block;}
	
	.dropdown:hover .dropbtn {background-color: #3e8e41;}
	</style>

  </head>
  <script>
	function setData(data){
		let dataObjFromMain; //dataObjFromMain.JOB_CD 처럼 접근해서 사용.
		dataObjFromMain=data;
		console.log('dataObjFromMain',dataObjFromMain); //확인용
		
		/* 여기에 DB에 데이터 요청하고 받아오고 view에 적용하는 로직 작성 */
	}
  </script>
  <body>
    <!--
    <h1>In Page</h1>
	<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal" data-whatever="@mdo">담당자 추가</button> 
	-->
	
	
	<!-- 	### 담당자 추가 -->
	<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="exampleModalLabel">담당자 추가</h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      
	      <div class="modal-body">
		    <b>최초 지시자&emsp;</b> <em>OOO</em>
		    &emsp;&emsp;&emsp;&emsp;&emsp;
		    <b>현재 담당자&emsp;</b> <em>OOO</em>
	     	
	     	<br/><br/>
	     	
			<table>				
				<tr><!--행(row)선언-->
	                <th><b>추가 담당자</b></th>
	                	
	               
	                	<!-- <input type="text" name = "UserID" value="" placeholder = "담당자 입력" style="width:100px; right:30%;"/> -->
	                	<!-- <input type="text" class="form-control" id="recipient-name" style="width:100px; padding-left:10px"> -->
	                	<td>
	                	&emsp;
	                		<select name="solar_birth_yn" id="solar_birth_yn">
		                		<option value="none">부 서</option>
		 				       	<option value="1">IT</option>
					       	 	<option value="2">일반본부</option>
					   		</select>
					   	&emsp;
					   		<select name="solar_birth_yn" id="solar_birth_yn">
		                		<option value="none">팀</option>
		 				       	<option value="1">계정운영팀</option>
					       	 	<option value="2">계정개발팀</option>
					   		</select>
					   	&emsp;
					   		<select name="solar_birth_yn" id="solar_birth_yn">
		                		<option value="none">사원</option>
		 				       	<option value="1">홍길동</option>
					       	 	<option value="2">김동율</option>
					   		</select>
					    </td>

	                <!-- <th rowspan="2"><input type="submit" value="로그인"/></th> -->
        	    </tr>
			</table>
			
			
			<hr>
	      
	        <form>
	          <div class="form-group">
	            <label for="recipient-name" class="col-form-label">제 목</label>
	            <input type="text" class="form-control" id="recipient-name">
	          </div>
	          <div class="form-group">
	            <label for="message-text" class="col-form-label">내 용</label>
	            <textarea class="form-control" id="message-text" style="height:100px"></textarea>
	          </div>
	        </form>
	      </div>
	      
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">닫기</button>
	        <button type="button" class="btn btn-primary">등록</button>
	      </div>
	    </div>
	  </div>
	</div>

	<!-- 	### 지시현황 체크 -->
		<!-- Button trigger modal -->
	<!--  
	<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModalCenter">
	  지시현황
	</button>
	-->
	
	<!-- Modal -->
	<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
	  <div class="modal-dialog modal-dialog-centered" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="exampleModalCenterTitle">지시현황</h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      
	      <div class="modal-body">
		     <table class="table">
				 <thead>
				   <tr>
				      <th>지시자</th>
				      <th>담당자</th>
				      <th>처리 상태</th>
   				      <th>지시 일자</th>
				   </tr>
				 </thead>
				 <tbody>
				   <tr>
				      <td>John</td>
				      <td>Doe</td>
				      <td>진행중</td>
				      <td>2021.03.01</td>
				   </tr>
				   <tr>
				      <td>Doe</td>
				      <td>Moe</td>
				      <td>진행중</td>
   				      <td>2021.04.02</td>
				   </tr>
				   <tr>
				      <td>Moe</td>
				      <td>Ryul</td>
				      <td>완료</td>
				      <td>2021.04.10</td>
				   </tr>
				 </tbody> 
			</table>
	      </div>
	      
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">닫기</button>
	      </div>
	    </div>
	  </div>
</div>




 </body>
</html>
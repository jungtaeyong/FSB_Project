<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/WEB-INF/views/modal1_Adding.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>업무 관리</title>
</head>
<body>
<!-- jquery  -->
<script type="text/javascript" src="resources/js/jquery-3.6.0.min.js"></script>

<!-- bootstrap -->
<link rel="stylesheet" type="text/css" href="resources/lib/Bootstrap-4-4.1.1/css/bootstrap.min.css"/>
<script type="text/javascript" src="resources/lib/Bootstrap-4-4.1.1/js/bootstrap.min.js"></script>

<!-- datatables -->
<link rel="stylesheet" type="text/css" href="resources/lib/DataTables-1.10.24/css/dataTables.bootstrap4.min.css"/>
<script type="text/javascript" src="resources/lib/DataTables-1.10.24/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="resources/lib/DataTables-1.10.24/js/dataTables.bootstrap4.min.js"></script>
<script>
$(document).ready(function() {
	/* 초기 조회 조건 세팅 */
	$('#REQUEST_TYPE').val('1'); //구분
	$('#BZWR_STS').val('01'); //처리상태
	$('#BZWR_DSTC').val('2'); //업무구분
	
	let befor7days= new Date();
	befor7days.setDate(befor7days.getDate()-5);
	document.getElementById('FROM_DATE').valueAsDate = befor7days; //FROM_DATE
	document.getElementById('TO_DATE').valueAsDate = new Date(); //TO_DATE
	
	/* 테이블 초기 로딩 */
	let jobList = loadTableData();
	
	/* 테이블 Index 생성을 위한 함수 */
	jobList.on( 'order.dt search.dt', function () {
		jobList.column(0, {search:'applied', order:'applied'}).nodes().each( function (cell, i) {
	        cell.innerHTML = i+1;
	    } );
	} ).draw();

	/* 테이블 클릭 이벤트  -> 클릭한 row에 해당하는 데이터를 상세 정보에 보여줌*/
	$('#job_list tbody').on('click', 'td:nth-child(-n+7)', function () {
		let data = jobList.row( this ).data();
	    console.log('Table Click Event',data);
	   	
		if($('#REQUEST_TYPE').val()!='2'){ //"구분-등록" 상태면 반응 없음.
	        $('#BZWR_INDC_CHGR').text(data.BZWR_INDC_CHGR_TXT); //지시자
	        $('#BZWR_EXC_CHGR').text(data.BZWR_EXC_CHGR_TXT); //담당자
	        $('#BZWR_STS_2').val(data.BZWR_STS); //처리상태(업무상태)
	        $('#BZWR_TTL').val(data.BZWR_TTL); //제목
	        $('#BZWR_CNTN').val(data.BZWR_CNTN); //내용 
	        if($('#REQUEST_TYPE').val()=='1' || data.BZWR_STS=='02'){
	        	$('#BZWR_EXC_CHGR_BTN').hide();
				$('#BZWR_STS_2').attr("disabled",true);
				$('#BZWR_TTL').attr("disabled",true);
				$('#BZWR_CNTN').attr("disabled",true);
	        }else{
	        	$('#BZWR_EXC_CHGR_BTN').show();
				$('#BZWR_STS_2').removeAttr("disabled");
				$('#BZWR_TTL').removeAttr("disabled");
				$('#BZWR_CNTN').removeAttr("disabled");
	        }
		}
	} );

	/* 선택된  row 하이라이트 */
	$('#job_list tbody').on('click', 'tr', function() {
		$('#job_list tbody > tr').css('background-color','#ffffff');
		$(this).css('background-color','#f0f5f5');
	});

	/* 테이블 버튼 이벤트(담당자입력) */
	$('#job_list tbody').on( 'click', 'button[name="first_btn"]', function () {
	    let data = jobList.row( $(this).parents('tr') ).data();
		//console.log("First Button",data);
		setData(data); //모달 페이지로 데이터를 전달하기 위한 함수
		$('#exampleModal').modal();
	} );

	/* 테이블 버튼 이벤트(전체진행상황) */
	$('#job_list tbody').on( 'click', 'button[name="second_btn"]', function () {
	    let data = jobList.row( $(this).parents('tr') ).data();
		//console.log("Second Button",data);
	    setData(data); //모달 페이지로 데이터를 전달하기 위한 함수
		$('#exampleModalCenter').modal();
	} );
	
	
	/* 송신버튼 */
	$('#action_submit').click(function(){
		let dvcd = $('#REQUEST_TYPE').val();
		if(dvcd=='1'){
			console.log('조회');
			loadTableData();
		}else if(dvcd=='2'){
			console.log('등록');
			createNewJob();
		}else if(dvcd=='3'){
			console.log('변경');
			updateJob();
		}
	});

	/* 구분 변경 이벤트 처리 */
	$('#REQUEST_TYPE').change(function() {
		let dvcd = $('#REQUEST_TYPE').val();
		if(dvcd=='1'){
			$('#BZWR_EXC_CHGR_BTN').hide();
			$('#BZWR_STS_2').attr("disabled",true);
			$('#BZWR_TTL').attr("disabled",true);
			$('#BZWR_CNTN').attr("disabled",true);
		}else if(dvcd=='2'){
			$('#BZWR_INDC_CHGR').text('로그인 유저');
			$('#BZWR_EXC_CHGR').text('');
			$('#BZWR_EXC_CHGR_BTN').show();
			$('#BZWR_STS_2').attr("disabled",true);
			$('#BZWR_TTL').val("");
			$('#BZWR_CNTN').val("");
			$('#BZWR_TTL').removeAttr("disabled");
			$('#BZWR_CNTN').removeAttr("disabled");
		}else if(dvcd=='3'){
			$('#BZWR_EXC_CHGR_BTN').show();
			$('#BZWR_STS_2').removeAttr("disabled");
			$('#BZWR_TTL').removeAttr("disabled");
			$('#BZWR_CNTN').removeAttr("disabled");
			alert('변경할 데이터를 선택해주세요.');
		}
	});

} );


function loadTableData(){
	/* 테이블 데이터 로딩 및 세팅 */
	let sendData = {
    		REQUEST_TYPE:$('#REQUEST_TYPE').val(),
    		FROM_DATE:$('#FROM_DATE').val(), 
    		TO_DATE:$('#TO_DATE').val(),
    		BZWR_STS:$('#BZWR_STS').val(),
    		BZWR_DSTC:$('#BZWR_DSTC').val()
    };
	console.log('sendData',sendData);
	return jobList = $('#job_list').DataTable( {
        ajax : {
        	url : 'resources/lib/testJson2.json',
        	type : 'GET',
        	data : sendData
        },
        responsive: true,
        columns : [
			{data: null },
			{data: "BZWR_TTL" },
            {data: "BZWR_STS", render : function ( data, type, row, meta ) {
            	if(data=="01"){
            		return '진행중';
            	}else if(data=="02"){
            		return '완료';
            	}
            }},
            {data: "BZWR_INDC_CHGR_TXT" },
            {data: "BZWR_EXC_CHGR_TXT" },
            {data: "BZWR_REG_DT" },
            {data: "BZWR_CMPL_DT" },
            {data: null , render : function ( data, type, row, meta ) {
                return '<button name="first_btn" class="btn btn-sm btn-default">입력</button>'
            }},
            {data: null , render : function ( data, type, row, meta ) {
                return '<button name="second_btn" class="btn btn-sm btn-default">확인</button>'
            }}
        ],
        columnDefs: [{ className: 'text-center', targets: [0,2,3,4,5,6,7,8] }],
        order: [[ 1, 'asc' ]]
    });
}

	
/* 등록 */
function createNewJob(){
	let sendData = { 
			REQUEST_TYPE:$('#REQUEST_TYPE').val(), //구분(조회,등록,변경)
			BZWR_DSTC:$('#BZWR_DSTC').val(), //업무구분
			BZWR_INDC_CHGR:'로그인 유저', //업무지시담당자
			BZWR_EXC_CHGR:'담당자', //업무수행담당자
			BZWR_STS:'1', //업무상태 (등록 시 진행으로 세팅)
			BZWR_TTL:$('#BZWR_TTL').val(), //업무제목
			BZWR_CNTN:$('#BZWR_CNTN').val() //업무내용
		};
	console.log('sendData',sendData);
	$.ajax({
		url:'',
		dataType:'application/json',
		data : sendData,
		success:function(data){
			alert('등록 되었습니다.');
	   }
	})
}


/* 변경 */
function updateJob(){
	let sendData = { 
			REQUEST_TYPE:$('#REQUEST_TYPE').val(), //구분(조회,등록,변경)
			BZWR_DSTC:$('#BZWR_DSTC').val(), //업무구분
			BZWR_EXC_CHGR:'담당자', //업무수행담당자
			BZWR_STS:$('#BZWR_STS_2').val(), //업무상태
			BZWR_TTL:$('#BZWR_TTL').val(), //업무제목
			BZWR_CNTN:$('#BZWR_CNTN').val() //업무내용
		};
	console.log('sendData',sendData);
	if(sendData.BZWR_STS=='02'){ //완료된 업무인 경우 변경 불가
		alert('이미 완료된 업무입니다.');
	}else{
		$.ajax({
			url:'',
			dataType:'application/json',
			data : sendData,
			success:function(data){
				alert('변경 되었습니다.');
		   }
		})
	}
}
</script>
<div class="container" style="margin-top:30px">
	<!-- 조회 조건 -->
	<div>
		<div>
			<label style="font-weight:bold;">구분&nbsp;</label>
			<select id="REQUEST_TYPE" style="margin-right:25px">
			    <option value="1">조회</option>
			    <option value="2">등록</option>
			    <option value="3">변경</option>
			</select>
			<label style="font-weight:bold">조회기간&nbsp;</label>
			<input type="date" id="FROM_DATE" style="width:145px" value=""/>
			<label style="font-weight:bold">~&nbsp;</label>
			<input type="date" id="TO_DATE" value=""  style="margin-right:25px;width:145px"/>
			<label style="font-weight:bold;">처리상태&nbsp;</label>
			<select id="BZWR_STS" style="margin-right:25px">
			    <option value="01">진행</option>
			    <option value="02">완료</option>
			    <option value="03">전체</option>
			</select>
			<label style="font-weight:bold;">업무구분&nbsp;</label>
			<select id="BZWR_DSTC">
			    <option value="1">지시업무</option>
			    <option value="2">담당업무</option>
			</select>
			<input type='button' id="action_submit" class="btn btn-sm btn-primary" style="float:right" value='송신'/>
		</div>
	</div>
	<hr/>
	<!-- 목록 -->	
	<div>
		<table id="job_list" class="table table-sm responsive table-bordered" width="100%">
	        <thead>
	            <tr>
	            	<th>No</th>
	                <th>제목</th>
	                <th>처리상태</th>
	                <th>지시자</th>
	                <th>담당자</th>
	                <th>등록일자</th>
	                <th>완료일자</th>
	                <th>담당자입력</th>
	                <th>전체진행상황</th>
	            </tr>
	        </thead>
	    </table>
	</div>
	<hr/>
	<!-- 상세 -->
	<div>
		<table class="table table-bordered table-sm display nowrap" style="text-align:center;">
			<tr>
				<th scope="col" width="10%">지시자</th>
				<td scope="col" id="BZWR_INDC_CHGR" width="10%"></td>
				<th scope="col" width="10%">담당자</th>
				<td scope="col" width="10%">
					<span id="BZWR_EXC_CHGR"></span>
					<button id="BZWR_EXC_CHGR_BTN" class="btn btn-sm btn-info" style="display:none">선택</button>
				</td>
				<th scope="col" width="10%">처리상태</th>
				<td scope="col" width="10%">
					<select id="BZWR_STS_2" class="form-control" disabled>
					    <option value="01">진행중</option>
					    <option value="02">완료</option>
					</select>
				</td>
				<td scope="col"></td>
			</tr>
			<tr>
				<th scope="row">제목</th><td colspan="6"><input type="text" id="BZWR_TTL" class="form-control input-sm" disabled/></td>
			</tr>
			<tr>
				<th scope="row">내용</th><td colspan="6"><textarea ID="BZWR_CNTN" class="form-control input-sm" rows="5" disabled></textarea></td>
			</tr>
		</table>
	</div>
</div>
</body>
</html>
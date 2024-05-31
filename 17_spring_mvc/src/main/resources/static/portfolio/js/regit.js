// 변수 선언
let isValidPassword = false;
let isValidConfirmPasswd = false;
let isValidId = false;

// 다음(카카오)우편번호 시스템 사용
function execDaumPostcode() {
	new daum.Postcode({
		oncomplete: function(data) {
			let fullRoadAddr = data.roadAddress;
			let extraRoadAddr = '';

			if (data.bname !== '' && /[동|로|가]$/g.test(data.bname)) {
				extraRoadAddr += data.bname;
			}
			if (data.buildingName !== '' && data.apartment === 'Y') {
				extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
			}
			if (extraRoadAddr !== '') {
				extraRoadAddr = ' (' + extraRoadAddr + ')';
			}
			if (fullRoadAddr !== '') {
				fullRoadAddr += extraRoadAddr;
			}

			document.getElementById('zipcode').value = data.zonecode;
			document.getElementById('roadAddress').value = fullRoadAddr;
			document.getElementById('jibunAddress').value = data.jibunAddress;
		}
	}).open();
}

// 패스워드 검증
$(function() {

	$("#passwd").blur(function() {
		let password = $(this).val();
		if (/^(?=.*\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&*]).{8,}$/.test(password)) {
			$("#passwordMsg").html("<span style='color:green;'>패스워드 조건 충족</span>");
			isValidPassword = true;
			// 비밀번호가 유효할 때 비밀번호 확인란을 활성화
			$("#confirmPasswd").prop("disabled", false);
			checkFormData(); // 패스워드 조건 충족 후 폼 데이터 검증
		} else {
			$("#passwordMsg").html("<span style='color:red;'>특수문자, 영문, 숫자 조합 8글자 이상이어야 합니다.</span>");
			isValidPassword = false;
			$("#confirmPasswd").prop("disabled", true).val("");
			isValidConfirmPasswd = false; 
			checkFormData(); 
		}
	});
	

	$("#confirmPasswd").blur(function() {
		let confirmPassword = $(this).val();
		let password = $("#passwd").val();
		if (confirmPassword == password) {
			$("#confirmPasswordMsg").html("<span style='color:green;'>패스워드 일치</span>");
			isValidConfirmPasswd = true;
		} else {
			$("#confirmPasswordMsg").html("<span style='color:red;'>패스워드 불일치</span>");
			isValidConfirmPasswd = false;
		}
	});



	// 아이디 검증
	$("#id").blur(function() {
		let id = $(this).val();
		if (id.length < 5 || !/^[a-zA-Z0-9]+$/.test(id)) {
			$("#configId").html("<span style='color:red;'>아이디는 영문과 숫자의 조합으로 5글자 이상이어야 합니다.</span>");
			isValidId = false;
		} else {
			$("#configId").html("<span style='color:green;'>사용가능한 아이디</span>");
			isValidId = true;
		}
	});

	// 아이디 중복 체크
	$("#btnOverlapped").click(function() {
		$.ajax({
			url: "미정", // jsp 이용할 때는 servlet 생성 ,spring boot getMapping or RequestParameter??
			type: "get",
			data: { "id": $("#id").val() },
			success: function(result) {
				if (result == "isDuple") {
					$("#overlappedIdMsg").html("<span style='color:red;'>사용할 수 없는 아이디 입니다.</span>");
					isValidId = false;
				} else {
					$("#overlappedIdMsg").html("<span style='color:green;'>사용할 수 있는 아이디 입니다.</span>");
					isValidId = true;
				}
			}
		});
		
	});
});

// 폼 데이터 확인
function checkFormData() {
	if (!isValidPassword) {

		$("#passwd").blur();
		return false;
	}

	if (!isValidConfirmPasswd) {

		$("#confirmPasswd").blur();
		return false;
	}

	if (!isValidId) {

		$("#id").blur();
		return false;
	}

	return true;
}

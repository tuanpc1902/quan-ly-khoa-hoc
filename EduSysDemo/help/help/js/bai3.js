var app = angular.module("myApp",[]);
app.controller("myCtrl", function($scope) {
	$scope.myFunction = function() {
		if ($scope.mySelect == '1') {
			document.getElementById("table1").style.display = "block";
			document.getElementById("table").style.display = "none";
		} else if ($scope.mySelect == '2') {
			document.getElementById("table1").style.display = "none";
			document.getElementById("table").style.display = "block";
		} else {
			document.getElementById("table1").style.display = "none";
			document.getElementById("table").style.display = "none";
		}
	}
	
	$scope.hienthi = function(){
	   if(document.getElementById("check1").checked){
			document.getElementById("table").style.display = "block";
	   }
	   else{
		   document.getElementById("table").style.display = "none";
	   }
		
	}
	$scope.hienthi1 = function(){
		if(document.getElementById("check2").checked){
			document.getElementById("table1").style.display = "block";
		}
		else{
		   document.getElementById("table1").style.display = "none";
		}
		 
	 }

	$scope.checkbox = function(){
		
		// iphone
		if(document.getElementById("iphone").checked == true){
			document.getElementById("inputIphone").disabled = false;
		}
		else{
			$scope.soluong1 = '';
			document.getElementById("inputIphone").disabled = true;
			document.getElementById("inputIphone").value = "";
		}
		//samsung
		if(document.getElementById("samsung").checked == true){
			document.getElementById("inputSamsung").disabled = false;
		}
		else{
			$scope.soluong2 = '';
			document.getElementById("inputSamsung").disabled = true;
			document.getElementById("inputSamsung").value = "";
		}
		// sony
		if(document.getElementById("sony").checked == true){
			document.getElementById("inputSony").disabled = false;
		}
		else{
			$scope.soluong3 = '';
			document.getElementById("inputSony").disabled = true;
			document.getElementById("inputSony").value = "";
		}
		// oppo
		if(document.getElementById("oppo").checked == true){
			document.getElementById("inputOppo").disabled = false;
		}
		else{
			$scope.soluong4 = '';
			document.getElementById("inputOppo").disabled = true;
			document.getElementById("inputOppo").value = "";
		}
		// nokia
		if(document.getElementById("nokia").checked == true){
			document.getElementById("inputNokia").disabled = false;
		}
		else{
			$scope.soluong5 = '';
			document.getElementById("inputNokia").disabled = true;
			document.getElementById("inputNokia").value = "";
		}
		// motorola
		if(document.getElementById("motorola").checked == true){
			document.getElementById("inputMotorola").disabled = false;
		}
		else{
			$scope.soluong6 = '';
			document.getElementById("inputMotorola").disabled = true;
			document.getElementById("inputMotorola").value = "";
		}
		// bphone
		if(document.getElementById("bphone").checked == true){
			document.getElementById("inputBphone").disabled = false;
		}
		else{
			$scope.soluong7 = '';
			document.getElementById("inputBphone").disabled = true;
			document.getElementById("inputBphone").value = "";
		}
		//
		if(document.getElementById("realme").checked == true){
			document.getElementById("inputRealme").disabled = false;
		}
		else{
			$scope.soluong8 = '';
			document.getElementById("inputRealme").disabled = true;
			document.getElementById("inputRealme").value = "";
		}
		// check all tầm trung
		if((document.getElementById("iphone") && document.getElementById("samsung") && document.getElementById("sony") && document.getElementById("oppo")).checked == false){
			document.getElementById("allsanpham1").checked = false;
		}
		else if((document.getElementById("iphone") || document.getElementById("samsung") || document.getElementById("sony") || document.getElementById("oppo")).checked == true){
			document.getElementById("allsanpham1").checked = true;
		}
		// check all giá rẻ
		if((document.getElementById("nokia") && document.getElementById("motorola") && document.getElementById("bphone")).checked == false){
			document.getElementById("allsanpham").checked = false;
		}
		else if((document.getElementById("nokia") || document.getElementById("motorola") || document.getElementById("bphone")).checked == true){
			document.getElementById("allsanpham").checked = true;
		}  
	}
	$scope.checkall1 = function(){
		if(document.getElementById("allsanpham1").checked == true){
			document.getElementById("iphone").checked = true;
			document.getElementById("samsung").checked = true;
			document.getElementById("sony").checked = true;
			document.getElementById("oppo").checked = true;
			$scope.checkbox();
		}
		else{
			document.getElementById("samsung").checked = false;
			document.getElementById("sony").checked = false;
			document.getElementById("oppo").checked = false;
			document.getElementById("iphone").checked = false;
			$scope.checkbox();
		}
	}
	$scope.checkall = function(){
		if(document.getElementById("allsanpham").checked == true){
			document.getElementById("nokia").checked = true;
			document.getElementById("motorola").checked = true;
			document.getElementById("bphone").checked = true;
			document.getElementById("realme").checked = true;
			$scope.checkbox();
		}
		else{
			document.getElementById("nokia").checked = false;
			document.getElementById("motorola").checked = false;
			document.getElementById("bphone").checked = false;
			document.getElementById("realme").checked = false;
			$scope.checkbox();
		}
	}
	$scope.myreset = function(){
		document.getElementById("table").reset();
		document.getElementById("table1").reset();
	}
});
	
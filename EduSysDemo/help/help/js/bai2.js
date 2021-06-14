function hienthi(visible){
    var khac = document.getElementById("khac");
    khac.style.display = visible ? "": "none";
} 
var sokytu = "200";
function demkytu(){
    var kytunhan = document.frm.comment.value;
    var dodai = kytunhan.length;
    if(dodai > sokytu){
        kytunhan = kytunhan.substring(0,sokytu);
        document.frm.comment.value =kytunhan;
        return false;
    }
    document.frm.gioihantu.value = (sokytu-dodai);
}
function checkEmail() { 
    var email = document.getElementById('email'); 
    var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/; 
    if (!filter.test(email.value)) { 
            document.getElementById("erroemail1").innerHTML = ' (Email không hợp lệ - Vui lòng nhập đúng định dạng)';
            email.focus; 
      		document.getElementById("email").style.background = "yellow";
            document.getElementById("email").style.borderColor = "red";
            return false; 
    }
    else{
        document.getElementById("erroemail1").innerHTML = "";
      	document.getElementById("email").style.background = "none";
      	document.getElementById("email").style.borderColor = "green";
    }
} 
function textArea(){
    var x = document.createElement("TEXTAREA");
    var t = document.createTextNode("");
    x.appendChild(t);
    document.getElementById("errokhac").appendChild(x).innerHTML = "Mời bạn nhập sở thích của mình";
}
function displaythongtin(){
    document.getElementById("masv").style.display = "block";
}
function thongtin(){
    // thông tin giới tính
    if(document.getElementById("Nam").checked){
        document.getElementById("xuatgioitinh").innerText = "Nam";
    }
    else if((document.getElementById("Nam") && document.getElementById("Nu")).checked == false){
        document.getElementById("xuatgioitinh").innerText = "";
    }
    else{
        document.getElementById("xuatgioitinh").innerText = "Nữ";
    }
    // thông tin quốc tịch
    var x = document.getElementById("list").value;
        document.getElementById("xuatquoctich").innerHTML = x;
    //
    // var y = document.getElementById("sothich1").value;
    // document.getElementById("xuatsothich").innerHTML = y;
    // thông tin sở thích
    var y = document.getElementById("sothich1").value;
        if(document.getElementById("docsach").checked){
            document.getElementById("xuatsothich").innerText = "Đọc sách";
        }
        else if(document.getElementById("dulich").checked){
            document.getElementById("xuatsothich").innerText = "Du lịch";
        }
}


function getInfo(){
    // check mã sinh viên
    if(document.getElementById("masinhvien").value == 0){
        document.getElementById("erroname").innerHTML = "Vui lòng nhập mã sinh viên";
        document.getElementById("masinhvien").style.background = "yellow";
        document.getElementById("masinhvien").style.borderColor = "red";
    }
    else{
        document.getElementById("erroname").innerHTML = "";
        document.getElementById("masinhvien").style.background = "none";
      	document.getElementById("masinhvien").style.borderColor = "green";
        
    }
    // check họ tên
    if(document.getElementById("hoten").value == 0){
        document.getElementById("errohoten").innerHTML = "Vui lòng nhập họ tên";
        document.getElementById("hoten").style.background = "yellow";
        document.getElementById("hoten").style.borderColor = "red";
    }
    else{
        document.getElementById("errohoten").innerHTML = "";
        document.getElementById("hoten").style.background = "none";
      	document.getElementById("hoten").style.borderColor = "green";
    }
    // // check email
    // if(document.getElementById("email").value == 0){
    //     document.getElementById("erroemail").innerHTML = "Vui lòng nhập email";
    //     document.getElementById("email").style.background = "yellow";
    //     document.getElementById("email").style.borderColor = "red";
    // }
    // else{
    //     document.getElementById("erroemail").innerHTML = "";
    //     document.getElementById("email").style.background = "";
    //     document.getElementById("email").style.borderColor = "#000";
    // }
    // check giới tính
    if(document.getElementById("Nam").checked || document.getElementById("Nu").checked){
        document.getElementById("errogioitinh").innerHTML = "";
    }
    else{
        document.getElementById("errogioitinh").innerHTML = "Vui lòng chọn giới tính của bạn";
    }
    // check quốc tịch
    if(document.getElementById("vietnam").selected || document.getElementById("hoaky").selected || document.getElementById("anh").selected){
        document.getElementById("erroquoctich").innerHTML = "";
    }
    else{
        document.getElementById("erroquoctich").innerHTML = "Vui lòng chọn quốc tịch";
    }
}
function checksothich(){
    // check sở thích
    if(document.getElementById("docsach").checked || document.getElementById("dulich").checked || document.getElementById("amnhac").checked || document.getElementById("amthuc").checked || document.getElementById("khac1").checked){
        document.getElementById("errosothich").innerHTML = "";
    }
    else{
        document.getElementById("errosothich").innerHTML = "Vui lòng chọn sở thích"
    }
    if(document.getElementById("khac1").checked){
        hienthi(true);
    }
    else{
        hienthi(false);
    }
}
function LoginButton(){
    var button=document.getElementById("loginbutton");
    var hideinput=document.getElementsByClassName("errorhide");

    for(var i=0;i!=hideinput.length;i++){
        if(button.click){
            hideinput[i].style.display="block";

        }
        else{
            hideinput[i].style.display="none";
        }
    }
    
}
function Forgotpassword(){
    window.location.replace("HTML_Div_ForgotPassword.html");
}
function clearrequest(){
    window.location.replace("HTML_Div_Myrequest9.html");
}

function Loginrequest(){
    if(document.getElementById("dis").style.display === "none" ){
        LoginButton();
    }
   else{
      Requestnext();
   }
    
}
function Requestnext(){
    window.location.replace("HTML_Div_Myrequest9.html");
}
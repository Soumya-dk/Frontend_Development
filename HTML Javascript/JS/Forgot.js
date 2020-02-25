function ForgotButton(){
    var button=document.getElementById("forgotbutton");
    var hideinput=document.getElementsByClassName("errorhideforgot");

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
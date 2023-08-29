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
function Savedraft(url){
    window.location = url;
}
function popuprequest(l,k) {
    var container = document.getElementById("l");
    var popuprequest = document.getElementById("k");
    if (popuprequest.style.display === "none") {
      container.style.position = "relative";
      popuprequest.style.position = "absolute";
      popuprequest.style.display = "block";
      popuprequest.style.top = "60%";
      popuprequest.style.left = "2%";
      popuprequest.style.zIndex = "1";
    } else {
      container.style.position = "initial";
      popuprequest.style.display = "none";
    }
  }
function Forgotalert(){
    if(document.getElementById("dis").style.display === "none" ){
        ForgotButton();
    }
   else{
     Forgotnext();
   }
    
}
function Forgotnext() {
    var dialog = document.getElementById("alert");
    var container = document.getElementById("cont");
    if (dialog.style.display === "none") {
        dialog.style.display = "block";
        dialog.style.zIndex = "1";
        container.style.position = "relative";
        dialog.style.position = "absolute";
    } else {
        dialog.style.display = "none";
    }
}
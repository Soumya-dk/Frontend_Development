function Savedraft(url){
    window.location = url;
}
function Additem(){
    window.location.replace("HTML_Div_Additem10.html");
}
function Nextitems(){
    window.location.replace("HTML_Div_Requisitionform2_items.html");
}
function Nextbrowse(){
    window.location.replace("HTML_Div_Requisitionform3_browse.html");
}
function Backnote(){
    window.location.replace("HTML_Div_Requisitionform1_note.html");
}
function Doneitem(){
    window.location.replace("HTML_Div_Requisitionform2_items.html");
}
function Backupload(){
    window.location.replace("HTML_Div_Requisitionform2_items.html");
}
function Upload(){
    window.location.replace("HTML_Div_Requisitionform3_upload.html");
}
function Uploadnext(){
    window.location.replace("HTML_Div_Requisitionform4_invitepeople.html");
}
function Addpeople(){
    window.location.replace("HTML_Div_Addpeople19_search.html");
}
function search(){
    window.location.replace("HTML_Div_Addpeople25_noresult.html");
}
function noresults(){
    window.location.replace("HTML_Div_Addpeople26_resultfound.html");
}
function results(){
    window.location.replace("HTML_Div_Addpeople24_personfound.html");
}
function nextinvite(){
    window.location.replace("HTML_Div_Requisitionform5_approval.html");
}
function approved(){
    window.location.replace("HTML_Div_Myrequest7.html");
}
function clearrequest(){
    window.location.replace("HTML_Div_Myrequest9.html");
}
function approval(){
    window.location.replace("HTML_Div_Requisitionform6_preview.html");
}
function preview(){
    window.location.replace("HTML_Div_Requisitionform5_approval.html");
}
function awaiting(){
    window.location.replace("HTML_Div_Requestview27.html");
}
function requestview(){
    window.location.replace("HTML_Div_inboxpublic28.html");
}
function private(){
    window.location.replace("HTML_Div_inboxprivate29.html");
}
function popup(l,k) {
    var container = document.getElementById("l");
    var popup = document.getElementById("k");
    if (popup.style.display === "none") {
      container.style.position = "relative";
      popup.style.position = "absolute";
      popup.style.display = "block";
      popup.style.top = "90%";
      popup.style.right = "0%";
      popup.style.zIndex = "1";
    } else {
      container.style.position = "initial";
      popup.style.display = "none";
    }
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
function Browse(){
    var browse=document.getElementById("browsebtn");
    var hideinput=document.getElementsByClassName("menuhide");
    for(var i=0;i!=hideinput.length;i++){
        if(browse.click){
            hideinput[i].style.display="block";
        }
        else{
            hideinput[i].style.display="none";
        }
    }
}
function Readmore() {
    var dots = document.getElementById("dots");
    var moreText = document.getElementById("menuhide");
    var lessText = document.getElementById("moreread");
  
    if (dots.style.display === "none") {
      dots.style.display = "inline";
      lessText.innerHTML = "READ MORE"; 
      moreText.style.display = "none";
    } else {
      dots.style.display = "none";
      lessText.innerHTML = "READ LESS"; 
      moreText.style.display = "inline";
    }
  }
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
    window.location.replace("HTML_Div_Requisitionform4_invitepeople.html");
}
function Addpeople(){
    window.location.replace("HTML_Div_Addpeople19_search.html");
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


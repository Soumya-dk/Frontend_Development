var ajaxRequest = new XMLHttpRequest();
ajaxRequest.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
    var jsondata = JSON.parse(ajaxRequest.responseText);
    var info = jsondata.hits;

    var parent = document.getElementById('parent');
    var cont = document.createElement("div");
    parent.appendChild(cont);

  for(i=0;i<info.length;i++){

  var card=document.createElement("div");
  cont.appendChild(card);
  cont.style="background:#FFF456;margin:20px";
  card.style="border-bottom:0.25px solid #ffffff";

  var image = document.createElement("img");
  card.appendChild(image);
  image.src= info[i].webformatURL;
  image.style="width:150px;float:left;width:15%;padding:1%";


  
  var text = document.createElement("div");
  card.appendChild(text);
  text.innerHTML = info[i].user;
  text.style="clear:both;margin-left:20%";

  
  var button = document.createElement("div");
  card.appendChild(button);
  button.id="btn";
  button.innerHTML="Button"
  button.style="padding:1%;width:10%;background:#FFFF5F";
  button.onclick= function myFunction(){
   window.location.replace("Soumya_HTML_js_json_movielocalnext.html");
  }
 
}
}
  };

   ajaxRequest.open(
    "GET","Movielocal.json",true
  );
  ajaxRequest.send();

  
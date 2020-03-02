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
  card.style="border-bottom:0.25px solid #ffffff;display:inline-block";
  card.style="background:#FBC567;margin:20px;height:20vh";

  var image = document.createElement("img");
  card.appendChild(image);
  image.src= info[i].webformatURL;
  image.style="float:left;width:10vw;height:10vh;padding:1%;;display:inline-block";

  
  var text = document.createElement("div");
  card.appendChild(text);
  text.innerHTML = info[i].user;
  text.style="float:left;display:inline-block";

  var button = document.createElement("button");
  card.appendChild(button);
  button.id="btn";
  button.innerHTML="Button"
  button.style="padding:2%;width:10vw;height:3vh;background:#FFFF5F;float:right";
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

  
   
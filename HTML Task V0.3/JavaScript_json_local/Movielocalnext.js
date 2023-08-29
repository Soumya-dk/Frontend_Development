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
    card.style="background:#FB945C;margin:20px;height:20vh";
  
    var image = document.createElement("img");
    card.appendChild(image);
    image.src= info[i].webformatURL;
    image.style="float:left;width:10vw;height:16vh;padding:1%;;display:inline-block";
  
    
    var text = document.createElement("div");
    card.appendChild(text);
    text.innerHTML = info[i].user;
    text.style="float:left;display:inline-block";
  

    var text =document.createElement("div");
    card.appendChild(text);
    text.innerHTML = info[i].tags;
    text.style="padding:2%";

    var text = document.createElement("div");
    card.appendChild(text);
    text.innerHTML = info[i].type;

  }
  }
  };

   ajaxRequest.open(
    "GET","Movielocal.json",true
  );
  ajaxRequest.send();

 
var ajaxRequest = new XMLHttpRequest();
 ajaxRequest.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
        var jsondata = JSON.parse(ajaxRequest.responseText);
        var info = jsondata.lists;
                                
        var parent = document.getElementById('parent');
        var cont = document.createElement("div");
        parent.appendChild(cont);
                                
        for(i=0;i<info.length;i++){
                                
        var card=document.createElement("div");
        cont.appendChild(card);
        cont.style="border: 1px solid #F0F0F0;height:30%";
                                 
        var text = document.createElement("div");
        card.appendChild(text);
       text.innerHTML = info[i].data;
                                  text.className="textfont"
                                  text.style="float:left;padding-right:30px;width:50%;padding-bottom:50px;color: #747474";
                                 
                                
                                  var text = document.createElement("div");
                                  card.appendChild(text);
                                  text.innerHTML = info[i].no;
                                  text.className="textfont"
                                  text.style="float:left;padding-right:30px;color: #707070";
                        
                                
                                  var text = document.createElement("div");
                                  card.appendChild(text);
                                  text.innerHTML = info[i].date;
                                  text.className="textfont"
                                  text.style="float:left;padding-right:30px;";
                                
                                  var text = document.createElement("div");
                                  card.appendChild(text);
                                  text.innerHTML = info[i].amount;
                                  text.className="textfont"
                                  text.style="float:left;padding-right:30px;padding-bottom:30px;";

                                  var image = document.createElement("img");
                                  card.appendChild(image);
                                  image.src= info[i].imagepng;
                                  image.style="float:right;width:3%;padding:1%;padding-right:6%";


                                  

                                 
                                    }
                                  }
                                  };
                                
                                   ajaxRequest.open(
                                    "GET","Requisitionform2.json",true
                                  );
                                  ajaxRequest.send();
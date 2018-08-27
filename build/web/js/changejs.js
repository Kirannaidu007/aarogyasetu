
 
  function abc(arg){
      var check=arg;
     
      var x=document.getElementById(arg).value;
     
      if(check==="min")
      {
      if(x==="Add new ministry")
      {
         
          newdiv.innerHTML= newdiv.innerHTML +"<br><input type='text' id='mytext' placeholder='enter your ministry' onchange='addmin(this.value)'+ i>";
       }
   }
     else if(check==="dep")
     {
        if(x==="Add new department")
      {
         
          mydiv.innerHTML= mydiv.innerHTML +"<br><input type='text' id='mytext' placeholder='enter your department' onchange='adddep(this.value)'+ i>";
       } 
     }
  }
  
 function addmin(opt)
 {
    var sel=document.getElementById("min");
    var o=document.createElement('option');
   o.value=opt;
   o.innerHTML=opt;
   sel.add(o);
   newdiv.innerHTML=" ";
   alert('your ministry has been successfully added. please select it');
 }
 function adddep(opt)
 {
    var sel=document.getElementById("dep");
    var o=document.createElement('option');
   o.value=opt;
   o.innerHTML=opt;
   sel.add(o);
   mydiv.innerHTML=" ";
   alert('your department has been successfully added. please select it');
 }
 
 function xyz()
 {
 
 var a=document.getElementById("cat").value;

  if(a==="Psu" || a==="Nkn" || a==="Others" || a==="Const")
  {
      var elem = document.getElementById("my");
      elem.hidden=true;
       var elem1 = document.getElementById("mydiv");
      elem1.hidden=true;
 }
  else
  {
      var elem = document.getElementById("my");
      elem.hidden=false;
      var elem1 = document.getElementById("mydiv");
      elem1.hidden=false;
  }
 }     
   $(document).ready(function()
   {
       var check=0;
        $('#cat').change(function() {
                    var category = document.getElementById("cat").value; 
                    var select=document.getElementById("min");
                    
                    $.ajax({
                        url:"cascading",
                        type:"post",
                        data:{cat:category,check:0},
                       success:function(data) 
                       {
                           
                           var i;
                           for(i=select.length;i>1;i--)
                           {
                             select.remove(i-1);  
                           }
                           for(i=0;i<data.length;i++)
                           {
                             
                             var option=document.createElement("option");
                             option.value=data[i];
                             option.innerHTML=data[i];
                             select.add(option);
                           }
                           
                            var option=document.createElement("option");
                             option.value="Add new ministry";
                             option.innerHTML="Add new ministry";
                             select.add(option);
                       },
                       error: function (data, status, er) {
                            console.log(data + "_" + status + "_" + er);
                        }
                    });
            });
         $('#min').change(function() {
                    var mini = document.getElementById("min").value; 
                    var sele=document.getElementById("dep");
                   
                    $.ajax({
                        url:"cascading",
                        type:"post",
                        data:{min:mini,check:1},
                       success:function(data) 
                       {
                          
                            var i;
                            for(i=sele.length;i>1;i--)
                           {
                             sele.remove(i-1);  
                           }
                           for(i=0;i<data.length;i++)
                           {
                             
                             var option=document.createElement("option");
                             option.value=data[i];
                             option.innerHTML=data[i];
                             sele.add(option);
                           }
                            
                            var option=document.createElement("option");
                             option.value="Add new department";
                             option.innerHTML="Add new department";
                             sele.add(option);
                       },
                       error: function (data, status, er) {
                            console.log(data + "_" + status + "_" + er);
                        }
                    });
            });    
      });


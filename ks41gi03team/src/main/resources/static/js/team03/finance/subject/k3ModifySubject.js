 $( document ).ready(){
	 console.log('docu ready');
	 
 }
 
 $.ajax({ 
	 url: "/team03/finance/subject/k3ModifySubject",
	 type: "json",
	 //dataType: "",
	 data: JSON.stringify(data),
	 type: "POST",
	 success: function(result){
		 console.log(result, 'result');
		 
	 },
	 error: function (request, status, error){
		 
	 }
 });

 

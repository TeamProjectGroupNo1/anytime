function generalUserLogin(){
	form = {
		"id" : $("#id").val(),
		"pwd" : $("#pwd").val()
	}
	
	$.ajax({
		url : '/root/generalUserLogin', type: 'POST', dataType: 'json',
		data : JSON.stringify(form),
		contentType: "application/json;charset=utf-8",
		success:function(result){
			console.log('반응확인')
			console.log(result)
		}
		
		
		
	})
	
}
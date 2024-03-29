/**
 * 
 */


$(document).on("submit", "form", (event)=>{
	event.preventDefault();
	let form = event.target;   //this쓰면 안된다 화살표함수기 때문에 익명함수면 써도됨
	let queryString = $(form).serialize();
	
	$.ajax({
		url:form.action,
		method:form.method,
		data:queryString,
		dataType:"html",
		success:function(html){
			let $div =  $("#resultArea");
			if($div.length==0){
				$div = $("<div>").prop("id", "resultArea")
				$(form).after($div)
			}
			let elementArray = $.parseHTML(html);	
			let $elementArray = $(html);
			let $filteredElements = $elementArray.filter((index, ele)=>{
//				ele.classList.contains("people_info")
				return $(ele).hasClass("people_info")
			});
			$div.html($filteredElements);
		}
	});
	
	return false;
});

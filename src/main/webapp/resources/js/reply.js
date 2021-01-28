// console.log("reply module...");

var replyService = (function() {

	function add(reply, callback, error) {
		// console.log("add1 method");
		console.log(reply);
		
		$.ajax({
			type: "post",
			url: "/controller/replies/new",  // context root로 변경
			data: JSON.stringify(reply),     // form data를 json
			contentType: "application/json; charset=utf-8",
			success: function(result, stauts, xhr) {
				if (callback) {
					callback(result);
				}
			},
			error: function(xhr, status, er) {
				if (error) {
					error(er);
				}
				
			}
		});
	}


	return {
//		name:"AAAA",
		add: add	
	};
})();
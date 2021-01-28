console.log("reply module...");

var replyService = (function() {

	function add1() {
		console.log("add1 method");
	}


	return {
		name:"AAAA",
		add: add1	
	};
})();
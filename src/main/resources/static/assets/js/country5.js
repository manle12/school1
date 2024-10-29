
		function toggleDiv() {
			//event.preventDefault();
			setTimeout(function() {
		const div = document.getElementById("myDiv");
		const stat =5
		
		if (div.style.display === "none") {
		   div.style.display = "block"; // Show the div
		 } else {
		   div.style.display = "none"; // Hide the div
		 }
		 
		 setTimeout(function() {
		 var classNumber = document.getElementById('classnumber').value;
		 		var examType = document.getElementById('examtype').value;
		 			   
		 		var url = `/countries/${classNumber}/${examType}`;
		 		window.location.href = url;
		 }, 2000);
		 
		 }, 2000);
		 
		 

}
		    
   //not usable    
  
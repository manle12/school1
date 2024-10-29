
		
function studentDetails() {
			//event.preventDefault();
		//	const div = document.getElementById("myTableButton");	
			
				
		const dik = document.getElementById('studentName').value;
		const dis = document.getElementById('class').value;
		
		if (dis == "[ROLE_USER]") {
						//window.location.href =`/states/nigeria`	
					     //  div.style.display = "block"; // Show the div
						 
						 var url = `/states/${dik}`;
						// document.getElementById("myTableButton").style.display = 'block';
						// window.location.href = url;
						 
					//	setTimeout(function() {
							
							window.location.href = url;
							
					//	 }, 5000);
						 
						 
					     } else {
					      // div.style.display = "none"; // Hide the div
						  window.location.href =`/index`	
					     }
		
			   
		 		
		
		 
		 
}



   //not usable    
  
function toggleDiv5() {
	
const div = document.getElementById("USER");
//const url = `/states/${div}`;
	           // window.location.href = url;
			   
			   if (div == "[ROLE_USER]") {
				window.location.href =`/states/nigeria`	
			     //  div.style.display = "block"; // Show the div
			     } else {
			      // div.style.display = "none"; // Hide the div
				  window.location.href =`/states`	
			     }
	window.location.href =`/states/nigeria`			


}
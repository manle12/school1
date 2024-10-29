document.getElementById('classandexam').addEventListener('submit', function(event) {
        event.preventDefault(); // Prevent form submission to let JS handle it
        
        // Perform form validation or other logic here
        
        // After processing, redirect to the desired URL
		var classNumber = document.getElementById('classnumber').value;
		var examType = document.getElementById('examtype').value;
			   
		var url = `/countries/${classNumber}/${examType}`;
		window.location.href = url;
		

		    
       
    });
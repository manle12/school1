
	
	
	
	$(document).ready(function() {

	    $('.table .btn-primary').on('click', function(event) {  
	        event.preventDefault();
	        
	        var href = $(this).attr('href');
	        
	        // Debugging: Check if href is correctly assigned
	        console.log("Href value: ", href);
	        
	        $.get(href, function(country, status) {
	            // Debugging: Check the response data
	            console.log("Country data: ", country);
	            console.log("Request status: ", status);

	            $('#idEdit').val(country.id);
	            $('#descriptionEdit').val(country.description);
	            $('#codeEdit').val(country.code);
				
				
				$('#englishEdit').val(country.english);
				$('#englishReviewEdit').val(country.reviewenglish);
				
				$('#mathEdit').val(country.maths);
				$('#mathReviewEdit').val(country.reviewmaths);
				
				$('#scienceEdit').val(country.science);
				$('#scienceReviewEdit').val(country.reviewscience);
				
				$('#socialEdit').val(country.social);
				$('#socialReviewEdit').val(country.reviewsocial);
				
				$('#creEdit').val(country.cre);
				$('#creReviewEdit').val(country.reviewcre);
				
				$('#totalEdit').val(country.total);
				$('#totalReviewEdit').val(country.reviewtotal);
				
				
				$('#kiswahiliEdit').val(country.kiswahili);
				$('#kiswahiliReviewEdit').val(country.reviewkiswahili);
				
				
				$('#classnumberMyEdit').val(country.classnumber);
				$('#nameMyEdit').val(country.fullname);
				$('#examtypeEdit').val(country.examtype);
				
				$('#usernameEdit').val(country.username);
				
				
	        });

	        $('#editModal').modal();
	    });
	});
	
	
	
	
	
	
	
	
	$(document).ready(function() {

		    $('.table .btn-primary').on('click', function(event) {  
		        event.preventDefault();
		        
		        var href = $(this).attr('href');
		        
		        // Debugging: Check if href is correctly assigned
		        console.log("Href value: ", href);
		        
		        $.get(href, function(country, status) {
		            // Debugging: Check the response data
		            console.log("Country data: ", country);
		            console.log("Request status: ", status);

		            $('#idMyEdit').val(country.id);
		            $('#descriptionMyEdit').val(country.description);
		            $('#codeMyEdit').val(country.code);
					
					
					$('#englishMyEdit').val(country.english);
					$('#englishMyReviewEdit').val(country.reviewenglish);
					
					$('#mathMyEdit').val(country.maths);
					$('#mathMyReviewEdit').val(country.reviewmaths);
					
					$('#scienceMyEdit').val(country.science);
					$('#scienceMyReviewEdit').val(country.reviewscience);
					
					$('#socialMyEdit').val(country.social);
					$('#socialMyReviewEdit').val(country.reviewsocial);
					
					$('#creMyEdit').val(country.cre);
					$('#creMyReviewEdit').val(country.reviewcre);
					
					$('#totalMyEdit').val(country.total);
					$('#totalMyReviewEdit').val(country.reviewtotal);
					
					
					$('#kiswahiliMyEdit').val(country.kiswahili);
					$('#usernameMyEdit').val(country.username);
					$('#examtypeMyEdit').val(country.examtype);
					
		        });

		        $('#editNewModal').modal();
		    });
		});


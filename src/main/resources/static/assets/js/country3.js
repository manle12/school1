
	
	
	
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
				
				
	        });

	        $('#editModal').modal();
	    });
	});

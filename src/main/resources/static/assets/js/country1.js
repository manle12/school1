
			
			
			
			
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
			$('#nameEdit').val(country.fullname);
			$('#examtypeEdit').val(country.examtype);
			$('#classnumberEdit').val(country.classnumber);
			
			
			$('#mathEdit').val(country.maths);
			 $('#mathReviewEdit').val(country.reviewmaths);
			
			
        });

        $('#editModal').modal();
		//window.location.href = '/countries/{classnumber}/{examtype}';
    });
});
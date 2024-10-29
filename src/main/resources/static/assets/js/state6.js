function downloadTable() {
            var table = document.getElementById("reviewTable");
            var rows = table.rows;
            var csv = [];

            for (var i = 0; i < rows.length; i++) {
                var row = [], cols = rows[i].cells;

                for (var j = 0; j < cols.length; j++) {
                    row.push(cols[j].innerText);
                }

                csv.push(row.join(","));
            }

            var csvFile = new Blob([csv.join("\n")], { type: "text/csv" });
            var downloadLink = document.createElement("a");

            downloadLink.download = "table.csv";
            downloadLink.href = window.URL.createObjectURL(csvFile);
            downloadLink.style.display = "none";

            document.body.appendChild(downloadLink);
            downloadLink.click();
            document.body.removeChild(downloadLink);
        }
		
		
		function downloadTableAsText() {
		            var table = document.getElementById("reviewTable");
		            var rows = table.rows;
		            var txt = [];

		            for (var i = 0; i < rows.length; i++) {
		                var row = [], cols = rows[i].cells;

		                for (var j = 0; j < cols.length; j++) {
		                    row.push(cols[j].innerText);
		                }

		                // Join the cells with tabs for better formatting
		                txt.push(row.join("\t"));
		            }

		            // Create the Blob and the download link for the text file
		            var textFile = new Blob([txt.join("\n")], { type: "text/plain" });
		            var downloadLink = document.createElement("a");

		            downloadLink.download = "table.txt";
		            downloadLink.href = window.URL.createObjectURL(textFile);
		            downloadLink.style.display = "none";

		            document.body.appendChild(downloadLink);
		            downloadLink.click();
		            document.body.removeChild(downloadLink);
		        }
				
				
				
				function downloadTable1() {
				            var table = document.getElementById("academicTable");
				            var rows = table.rows;
				            var csv = [];

				            for (var i = 0; i < rows.length; i++) {
				                var row = [], cols = rows[i].cells;

				                for (var j = 0; j < cols.length; j++) {
				                    row.push(cols[j].innerText);
				                }

				                csv.push(row.join(","));
				            }

				            var csvFile = new Blob([csv.join("\n")], { type: "text/csv" });
				            var downloadLink = document.createElement("a");

				            downloadLink.download = "table.csv";
				            downloadLink.href = window.URL.createObjectURL(csvFile);
				            downloadLink.style.display = "none";

				            document.body.appendChild(downloadLink);
				            downloadLink.click();
				            document.body.removeChild(downloadLink);
				        }
						
						
						
						
						function downloadTable1() {
									            var table = document.getElementById("feeTable");
									            var rows = table.rows;
									            var csv = [];

									            for (var i = 0; i < rows.length; i++) {
									                var row = [], cols = rows[i].cells;

									                for (var j = 0; j < cols.length; j++) {
									                    row.push(cols[j].innerText);
									                }

									                csv.push(row.join(","));
									            }

									            var csvFile = new Blob([csv.join("\n")], { type: "text/csv" });
									            var downloadLink = document.createElement("a");

									            downloadLink.download = "table.csv";
									            downloadLink.href = window.URL.createObjectURL(csvFile);
									            downloadLink.style.display = "none";

									            document.body.appendChild(downloadLink);
									            downloadLink.click();
									            document.body.removeChild(downloadLink);
									        }
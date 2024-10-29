function downloadPDF1() {
					    const { jsPDF } = window.jspdf;
					    const doc = new jsPDF();

					    // Get the HTML table element
					    const table = document.getElementById("feeTable");

					    // Use html2canvas to capture the table as an image
					    html2canvas(table).then((canvas) => {
					        const imgData = canvas.toDataURL("image/png");

					        // Calculate dimensions of the table within the PDF
					        const pdfWidth = doc.internal.pageSize.getWidth();
					        const pdfHeight = (canvas.height * pdfWidth) / canvas.width;

					        // Add image to PDF
					        doc.addImage(imgData, "PNG", 0, 0, pdfWidth, pdfHeight);

					        // Save PDF with desired file name
					        doc.save("student-performance.pdf");
					    });
					}

	function toggleDiv4  () {
		//var div=document.getElementByTagName('table')[1];
		var div = document.getElementById("userRow")
		
		
		//var table_row = Array.from(div.getElementsByTagName("tr")).slice(1); // Skip the header row
		
		
		var table_row = Array.from(document.getElementById("userTable").getElementsByTagName("tr")).slice(1);

		
			//	console.log('Does it match filterText?' );
		
		
		
		for(var i=0;i<table_row.length;i++){
		 
		//var name_row=table_row[i].getElementById('myId');
		
		//var firstCellValue = firstRow.cells[0].innerText;
		
		
		//var name_row=table_row.cells[0].value;
	
		
		var name_row = table_row[i].cells[0].textContent;
		
		toggle();
		
		
		console.log(i);
		console.log(name_row);

		}
		

		//let name_row = document.querySelectorAll('myId');
		

		
		
		
		

			function toggle() {
				

				class Stat {
				  constructor(initialValue) {
				    this.stat = initialValue;
				  }

				  getState() {
				    return this.stat;
				  }

				  setState(newValue) {
				    this.stat = newValue;
				    console.log("State updated:", this.stat);
				  }
				}

				const stat = new Stat(0);
				//console.log(state.getState()); // 0
				stat.setState(name_row);
				

				

			//let name=name_row.textContent ||filterText;
			//console.log('Does it match filterText?' );
			//let name=name_row.textContent ||filterText;
			//if(name===1){
				if (stat.getState() == 1) {
			

			table_row[i].style.display="";
			
			
			document.getElementById("myHeader").innerHTML = name_row;
			//div.style.display="";
			console.log("changed");

			}
			else
			{
			table_row[i].style.display="none";
			//div.style.display="none";
			console.log("not changed");
			}
			
			
		
			   }
			   
			
			}
			
			
			
			
		
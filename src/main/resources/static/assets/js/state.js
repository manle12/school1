function toggleDiv() {
  const div = document.getElementById("myDiv");
  
  
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
  stat.setState(5);
  
  
   // 5
  
 

  if (stat.getState() == 5) {
    div.style.display = "block"; // Show the div
  } else {
    div.style.display = "none"; // Hide the div
  }
  }
  
  function toggleDiv1() {
    const div = document.getElementById("myDiv1");
    
    
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
    stat.setState(5);
    
    
     // 5
    
   

    if (stat.getState() == 5) {
      div.style.display = "block"; // Show the div
    } else {
      div.style.display = "none"; // Hide the div
    }
  
  
  
  
}





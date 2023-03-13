document.getElementById("myForm").addEventListener("submit", function(event) {
  var name = document.getElementById("name").value;
  var age = document.getElementById("age").value;
  
  if (name.length < 3 || name.length > 20) {
    document.getElementById("error-message").innerHTML = "Name must be between 3 and 20 characters";
    event.preventDefault();
    return;
  }
  
  if (age < 18 || age > 99) {
    document.getElementById("error-message").innerHTML = "Age must be between 18 and 99";
    event.preventDefault();
    return;
  }
  
  // If all input fields pass validation, allow the form to submit
}); 

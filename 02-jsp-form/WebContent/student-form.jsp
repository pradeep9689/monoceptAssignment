<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
	<form action="student-form-resposnse.jsp" method="get">
	
	<label class="form-check mt-3" for="languges">
	Select Language
	 <div class="form-check mt-3">
        <input class="form-check-input" type="checkbox" name="language" value="English" id="flexCheckDefault">
        <label class="form-check-label" for="flexCheckDefault">
          English
        </label>
      </div>
      <div class="form-check">
        <input class="form-check-input" type="checkbox" name="language"value="Kannada" id="flexCheckChecked" checked>
        <label class="form-check-label" for="flexCheckChecked">
            Kannada
        </label>
      </div>
      <div class="form-check">
        <input class="form-check-input" name="language"type="checkbox" value="Marathi" id="flexCheckChecked" >
        <label class="form-check-label" for="flexCheckChecked">
            Marathi
        </label>
      </div>
      <div class="form-check">
        <input class="form-check-input" name="language"type="checkbox" value="Hindi" id="flexCheckChecked" >
        <label class="form-check-label" for="flexCheckChecked">
            Hindi
        </label>
      </div>
		<div class="mb-3">
			<label for="firstName" class="form-label">First Name
				</label>
				 <input type="text" name="first_name"class="form-control"id="First_name">
			<div id="emailHelp" class="form-text"></div>
		</div>
		<div class="mb-3">
			<label for="secondname" class="form-label">Second name</label>
			<input type="text" name="second_name" class="form-control"
				id="second_name">
		</div class="col-sm-10 mb-3">
		 <div class="select-check">
    <select class="form-select" name="city" aria-label="Default select example">
     <label class="form-check-label" for="city_selection">
  city <br>
        <option value="mumbai">mumbai</option>
        <option value="vijayapura">vijayapura</option>
        <option value="Solapur">Solapur</option>
      </select>
   </div>
   
   <div class="col-sm-10 mb-3">
   <label class="form-check-label" for="gender">
  select Gender <br>
  <input class="form-check-input" type="radio" value="male" name="RadioDefault" id="RadioDefault1">
  <label class="form-check-label" for="flexRadioDefault1">
    Male
  </label>
</div>
<div class="col-sm-10 mb-3">
  <input class="form-check-input" type="radio" value="female" name="RadioDefault" id="RadioDefault2" checked>
  <label class="form-check-label" for="flexRadioDefault2">
    Female
  </label>
</div>
		
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
	</div>
</body>
</html>
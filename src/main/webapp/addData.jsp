<%@ page import="models.Patient" %>
<%
    Patient patient = (Patient)request.getAttribute("patient");
%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <link rel="stylesheet" href="../css/addData.css">
  <style>
    button{
      border: none;
      cursor: pointer;
      appearance: none;
      background-color: inherit;
      margin-left:10px;
      margin-top:20px;
    }
    button:hover {
        box-shadow: 0px 0px 5px 2px black;
    }

    img{
      width: 70px;
      height: 70px;
    }
  </style>
</head>

<body>
  <div>
    <div class="footer">
        <img
            alt="Logo"
            src="../images/logo.png"
        />
        <h1>Premature</h1>
        <br />
        <h2>Baby Monitor</h2>
    </div>
    <div class="header">
        <form action="/logout">
            <button type="submit">
                <img src="../images/exit.png" alt="LogOut"/>
              </button>
          </form>
    <span class="text05">
        <span>Patient ID: <%=patient.getId()%></span>
    </span>
    <span class="text07">
        <span>St Mary&apos;s</span>
    </span>
    <form action="/">
        <button type="submit" class="home-btn">
            <img src="../images/house.jpg" alt="Home"/>
        </button>
    </form>
    </div>
    <main id="main-holder-1">
        <script>
            const form = document.getElementById("glucose-form");

            form.addEventListener("submit",(e) => {
                e.preventDefault();//in order to prevent page request

                const gluc = document.getElementById("glucose-field").value;
                const timeg = document.getElementById("time_field").value;

                //Crete an object with the inputs
                const glucdata = {
                    input1: gluc,
                    input2: timeg
                };
                //Send a POST request to the backend with the inputs as the request body
                fetch("http://localhost:8080/submit", {
                    method: "POST",
                    body: JSON.stringify(data),
                    headers: {
                        "Content-Type": "application/json"
                    }
                }).catch(error =>{
                    console.log(error);
                });
            });
        </script>

        <button class="save">
            <span class="text17"><span>Save</span></span>
        </button>
        <span class="text21"><span>NEW MEASUREMENT AND COMMENT</span></span>


        <form id="form" action="/login" method="post">
            <input type="text" name="Measurement" id="username-field" class="measurement-form-field" placeholder="Measurement (mmol)">
            <input type="password" name="Comment" id="comment-field" class="comment-form-field" placeholder="Comment">
            <input type="password" name="Time" id="time-field" class="time-form-field" placeholder="Time">
        </form>
        <span class="text11"><span>mmol</span></span>
    </main>
</body>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<<meta charset="ISO-8859-1">
   <link rel="stylesheet" href= 
"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"> 
      
    <script src= 
"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"> 
    </script> 
      
    <script src= 
"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"> 
    </script> 
      
    <script src= 
"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"> 
    </script> 
    <style>
    body{
            background-image: url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ9HBzEmvIMS4exeopzvvOwivL81lxEnnJMcoMKAIJ1TVOOjCU&s:image/jpeg;base64,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');
        background-repeat:no-repeat;
        background-attachment: fixed;
        background-size:cover;
        background-size:100% 100%;
        }
        ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            overflow: hidden;
            background-color: #333;
          }
          
          li {
            float: left;
          }
          
          li a {
            display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
          }
          
          li a:hover {
            background-color: #111;
          }
         
    </style>
    
</head>
<body>

      
   
        
           
      <ul>
          <li><a href="/addbrand" target="_blank">Add Brand</a></li>
            <li><a href="/assignbrandtodealer" target="_blank">Assign brand to dealer</a></li>
            <li><a href="/addbikestobrand" target="_blank">Add Bikes to Brand</a></li>
            <li><a href="/getbikesbydealername" target="_blank">get bike details</a></li>
            <li><a href="/gettotalinvestmentofabrand" target="_blank">get investment of the brand</a></li>
            
          </ul>
          
        
    
</body>
</html>
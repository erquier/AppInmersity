<!DOCTYPE html>

<head>


  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">


  <title>Inmersity</title>

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script defer src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script>
      <!-- Latest compiled and minified CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
      <!-- Optional theme -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
    <!-- Latest compiled and minified JavaScript -->
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

  <link rel="stylesheet" type="text/css" href="/account.css">
  <script src=""></script>


</head>

<html>
<body>

<navbar id="navbar" class="navbar navbar-fixed-top">

<ul>

<div id="navbar-goback-btn" style="float:left;">
<li><button  style="background:transparent; outline:none; border:none;"><a class="fas fa-align-center" style="color:white; font-size:2em; padding:2px; margin-left:10px; margin-top:5px; transform: rotate(180deg);"></a></button></li>
</div>

<input type="text" style="width:30%; border-radius:30px; margin-top:10px; border:none; color:black; text-align:center; overflow:hidden; outline:none;"/>

<div id="navbar-right-btns" style="float:right;">
<li><a class="fas fa-ellipsis-h" style="color:white; font-size:3em; padding:2px; margin-right:12px; margin-top:1px;"></a></li>
</div>

</ul>

</navbar>




<div id="sidebar"> 
<ul id="items-list">

<li><a href="/home"> Home </a></li>
<li><a href="/account"> Account </a></li>
<li><a href="/addnew"> Add album </a></li>
<li><a href="/artist"> Artists </a></li>
<li><a href="/coming"> More coming soon.. </a></li>

</ul>
</div>






<div id="main-container" style="background:none;">

<div id="account-top"class="row">

<div id="account-name-mail" class="col-md-5"> 

<script>
<#if usuario??>res.redirect("/home"); </#if>
</script>

<h1>${name}</h1>
<h3>${email}</h3>


</div>



<div id="account-description" class="col-md-6"> 

<p>Vel pretium lectus quam id leo in. Euismod quis viverra nibh cras pulvinar mattis nunc. 
Massa ultricies mi quis hendrerit dolor magna eget est. 
Arcu felis bibendum ut tristique et.
Ullamcorper eget nulla facilisi etiam dignissim diam. 
Et odio pellentesque diam volutpat commodo sed egestas egestas. 
Lacus sed viverra tellus in hac habitasse platea. Morbi enim nunc faucibus a pellentesque sit amet porttitor. 
Euismod nisi porta lorem mollis aliquam. Volutpat sed cras ornare arcu dui vivamus arcu felis bibendum. 
Massa tincidunt dui ut ornare lectus sit amet. Ut consequat semper viverra nam libero justo laoreet sit. 
At quis risus sed vulputate odio ut enim.</p>

</div>
</div>




</div>
</body>
</html>

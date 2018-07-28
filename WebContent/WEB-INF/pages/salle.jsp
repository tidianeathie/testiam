<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8S">
<title>Gestion Salle</title>
<link href="inc/css/bootstrap.min.css" rel="stylesheet">
<link href="inc/css/datepicker3.css" rel="stylesheet">
<link href="inc/css/styles.css" rel="stylesheet">

<!--Icons-->
<script src="inc/js/lumino.glyphs.js"></script>

<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<script src="js/respond.min.js"></script>
<![endif]-->
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<div class="panel panel-default">
					<div class="panel-heading">Ajout d'une nouvelle salle</div>
					<div class="panel-body">
						<form role="form" id="frm-add-salle">
							<div class="form-group">
								<label>Site</label>
								<select class="form-control">
									<option>Bat A</option>
									<option>Bat B</option>
									<option>Bat C</option>
									<option>Bat D</option>
								</select>
							</div>
						</form>
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="panel panel-default">
					<div class="panel-heading">Recherche d'une salle</div>
					<div class="panel-body">
						<form role="form" id="frm-search-salle">
						</form>
					</div>
				</div>
			</div>
			<div class="col-md-12">
				<div class="panel panel-default">
					<div class="panel-heading">Liste des salles</div>
					<div class="panel-body">
						
					</div>
				</div>
			</div>
		</div>
	</div>
	

	<script src="inc/js/jquery-1.11.1.min.js"></script>
	<script src="inc/js/bootstrap.min.js"></script>
	<script src="inc/js/chart.min.js"></script>
	<script src="inc/js/chart-data.js"></script>
	<script src="inc/js/easypiechart.js"></script>
	<script src="inc/js/easypiechart-data.js"></script>
	<script src="inc/js/bootstrap-datepicker.js"></script>
</body>
</html>
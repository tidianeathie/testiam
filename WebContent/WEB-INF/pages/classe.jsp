<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestion Classe</title>

<link href="inc/css/bootstrap.min.css" rel="stylesheet">
<link href="inc/css/datepicker3.css" rel="stylesheet">
<link href="inc/css/styles.css" rel="stylesheet">

<!--Icons-->
<script src="inc/js/lumino.glyphs.js"></script>

<script type="text/javascript">
		function confirmer(url) {
			var rep = confirm("Etes vous sur de vouloir supprimer");
			if (rep == true) {
				document.location = url;
			}
		}
	</script>

<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<script src="js/respond.min.js"></script>
<![endif]-->

</head>
<body>

<div class="container">
		<div class="row">
			<div class="col-md-12">
				<c:if test="${ok == 1}">
					<div class="alert alert-success alert-dismissible">
					    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
					    <svg class="glyph stroked checkmark">
							<use xlink:href="#stroked-checkmark"></use>
						</svg>
					    <strong>Success!</strong> la classe est bien enregistrée
				  </div>
				</c:if>
				<c:if test="${ok == 3}">
					<div class="alert alert-success alert-dismissible">
					    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
					    <svg class="glyph stroked checkmark">
							<use xlink:href="#stroked-checkmark"></use>
						</svg>
					    <strong>Success!</strong> la classe a été supprimer avec succéss !
				  </div>
				</c:if>
				<div class="panel panel-default">
					<div class="panel-heading">Ajout d'une nouvelle classe</div>
					<div class="panel-body">
					<div>
						<form role="form" id="frm-add-salle" method="post" action="classe">
							<input type="hidden" name="mode" value="${mode}" />
							<input type="hidden" name="code" value="${classe.code}" />
							<table>
								<tr>
									<td>NOM:</td>
									<td><input type="text" name="nom" value="${classe.nom}" /></td>
									<td></td>
								</tr>
								<tr>
									<td>ANNEESCOLAIRE:</td>
									<td><input type="text" name="anneescolaire" value="${classe.anneeScolaire}" /></td>
									<td></td>
								</tr>
								<tr>
									<td>NBETUDIANT:</td>
									<td><input type="text" name="nbetudiant" value="${classe.nbEtudiant}" /></td>
									<td></td>
								</tr>
								<tr>
									<td>Filiere:</td>
									<td>
										<div class="form-group">
											<br>
											<select class="form-control" name="filiere">
												<option value="${classe.filiere.code }" selected>${classe.filiere.nom }</option>
												<c:forEach items="${filieres }" var="filiere">
														<option value="${filiere.code }">${filiere.nom }</option>
												</c:forEach>
											</select>
										</div>
									</td>
								</tr>
								<tr>
									<td>Responsable:</td>
									<td>
										<div class="form-group">
											<br>
											<select class="form-control" name="responsable">
												<option value="${classe.responsable.code }" selected>${classe.responsable.nom }</option>
												<c:forEach items="${responsables }" var="responsable">
													<option value="${responsable.code }">${responsable.nom }</option>
											</c:forEach>
											</select>
										</div>
									</td>
								</tr>
								<tr>
									<td><input type="submit" name="action"  value="save"/></td>
								</tr>
							</table>
					</form>
				</div>
							
					</div>
					
				</div>
			</div>
			
		</div>
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">
						<input id="search" class="form-control pull-right" placeholder="rechercher par nom, prenom ..." style="width: 300px" >
					</div>
					<div class="panel-body">
						<table class="table" data-show-refresh="true" data-show-toggle="true" data-show-columns="true" data-search="true" data-select-item-name="toolbar1" data-pagination="true" data-sort-name="name" data-sort-order="desc">
						    <thead>
						    <tr>
						        <th >nom</th>
						        <th >annee Scolaire</th>
						        <th >nb Etudiant</th>
						        <th >filiere</th>
						        <th >responsable</th>
						        <th colspan="2" style="text-shadow: 1px 1px 2px #71d1eb;text-align: center;">ACTION</th>    
						    </tr>
						    </thead>
							<tbody>
							<c:forEach items="${listeClasse}" var="l">
								<tr>
									<td>${l.nom}</td>
									<td>${l.anneeScolaire}</td>
									<td>${l.nbEtudiant}</td>
									<td>${l.filiere.nom}</td>
									<td>${l.responsable.nom}</td>
									<td><a href="classe?action=update&code=${l.code }">Modifier</a></td>
									<td><a href="javascript:confirmer('classe?action=delete&code=${l.code }')">Supprimer</a></td>
								</tr>
							</c:forEach>
							</tbody>
						</table>
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
	<script type="text/javascript">
		$("#search").keyup(function () {
		    var value = this.value.toLowerCase().trim();
	
		    $("table tr").each(function (index) {
		        if (!index) return;
		        $(this).find("td").each(function () {
		            var id = $(this).text().toLowerCase().trim();
		            var not_found = (id.indexOf(value) == -1);
		            $(this).closest('tr').toggle(!not_found);
		            return not_found;
		        });
		    });
		});
	</script>
</body>
</html>
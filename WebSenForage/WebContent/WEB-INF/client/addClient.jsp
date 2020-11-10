<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>>
<jsp:include page="../../header.jsp"></jsp:include>
<!-- Content Row -->

<div class="row">
	<!-- Content Row -->
	<table class="table table-bordered table-striped">
				<thead>
				<tr>
					<td>id</td>
					<th>Nom </th>
					<th>Prenom </th>
					<th>Village</th>
					<th>Adresse</th>
					<th>Telephone</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${clients}" var="client">
                          <tr>
                          	<td><c:out value="${client.id}"/></td>
                              <td><c:out value="${client.nom}"/></td>
                              <td><c:out value="${client.prenom}"/></td>
                              <td><c:out value="${client.village.nomVillage}"/></td>
                              <td><c:out value="${client.adresse}"/></td>
                              <td><c:out value="${client.tel}"/></td>
                          </tr>
                </c:forEach>
                </tbody>
				</table>
							
		<!-- Pie Chart -->
		<div class="col-xl-8 col-lg-5">
			<div class="card shadow mb-4">
				<!-- Card Header - Dropdown -->
				<div
					class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
					<h6 class="m-0 font-weight-bold text-primary">Ajout Client</h6>
				</div>
				<!-- Card Body -->
				<div class="card-body">
					<form action="Client" method="post">
						<div class="form-group">
							<label>nom</label> <input class="form-control" type="text" name="nom">
						</div>
					
							<div class="form-group">
							<label>prenom</label> <input class="form-control" type="text" name="prenom">
						</div>
						<div>
							<label>village</label> 
							<select name="village">
								<c:forEach items="${listeVillage}" var="client">
									<option value="<c:out value="${client.idV}"></c:out>">
									<c:out value="${client.nomVillage}"></c:out></option>
								</c:forEach>
							</select>
						</div>
						<div class="form-group">
							<label>adresse</label> <input class="form-control" type="text"
								name="adresse">
						</div>
						<div class="form-group">
						<label>telephone</label> <input class="form-control" type="text"
								name="tel">
						</div>
						<div class="form-group">
							<input class="btn btn-success" type="submit" name="Envoyer"/>
						</div>
					</form>
						</div>
		      </div>
	        </div>
				
				
				</div>
				<jsp:include page="../../footer.jsp"></jsp:include>
	
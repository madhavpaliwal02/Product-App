<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="./base.jsp"%>
<title>Add Product</title>
</head>
<body>

	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">

				<h1 class="text-centeer mb-3">Fill the product details</h1>

				<form action="handle-product" method="post">

					<div class="form-group">
						<label for="product-name">Product Name</label> <input type="text"
							class="form-control" id="product-name" name="name"
							aria-describedby="emailHelp" placeholder="Enter the Name">
					</div>

					<div class="form-group">
						<label for="product-desc">Product Description</label>
						<textarea class="form-control" id="product-desc" rows="5"
							name="description" placeholder="Enter the Description"></textarea>
					</div>

					<div class="form-group">
						<label for="product-price">Product Price</label> <input
							type="text" class="form-control" id="product-price" name="price"
							placeholder="Enter the Price">
					</div>

					<div class="container text-center">
						<a href="${pageContext.request.contextPath }/"
							class="btn btn-outline-danger">Back</a>
						<button type="submit" class="btn btn-primary">Add</button>
					</div>


				</form>
			</div>
		</div>
	</div>
</body>
</html>
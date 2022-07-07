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

				<h1 class="text-center mb-3">Change product details</h1>

				<form action="${pageContext.request.contextPath }/handle-product"
					method="post">

					<div class="form-group">
						<input type="hidden" name="id" value="${product.id }">
					</div>

					<div class="form-group">
						<label for="product-name">Product Name</label> <input type="text"
							class="form-control" id="product-name" name="name"
							aria-describedby="emailHelp" value="${product.name }">
					</div>

					<div class="form-group">
						<label for="product-desc">Product Description</label>
						<textarea class="form-control" id="product-desc" rows="5"
							name="description">${product.description }</textarea>
					</div>

					<div class="form-group">
						<label for="product-price">Product Price</label> <input
							type="text" class="form-control" id="product-price" name="price"
							value="${product.price }">
					</div>

					<div class="container text-center">
						<a href="${pageContext.request.contextPath }/"
							class="btn btn-outline-warning">Back</a>
						<button type="submit" class="btn btn-primary">Update</button>
					</div>


				</form>
			</div>
		</div>
	</div>
</body>
</html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1 style="color: blue;">Amazon Invoice Details</h1>
<table border="1">
    <tr>
        <th>CID</th>
        <th>Customer NAME</th>
        <th>Mobile Number</th>
        <th>Product Name</th>
        <th>Price</th>
        <th>Quantity</th>
        <th>Total</th>
        <th>Discount</th>
        <th>GST</th>
        <th>INVOICE Bill</th>
        <th>UPDATE</th>
        <th>DELETE</th>
    </tr>
    <tr>
        <c:forEach var="product" items="${products}">
            <tr>
                <td>${product.cid}</td>
                <td>${product.cname}</td>
                <td>${product.mno}</td>
                <td>${product.pname}</td>
                <td>${product.price}</td>
                <td>${product.quantity}</td>
                <td>${product.total}</td>
                <td>${product.discount}</td>
                <td>${product.gst}</td>
                <td>${product.invoice_bill}</td>
                <td><a href="/update/${product.cid}">Update</a></td>
                <td><a href="/delete/${product.cid}">Delete</a></td>
            </tr>
        </c:forEach>
    </tr>
</table>
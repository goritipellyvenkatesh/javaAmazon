<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body bgcolor="pink">
    <h1 style="color:aqua ;">Edit PRODUCT</h1>
    <form:form method="GET" action="/editp">
        <table>
            <tr>
                <td></td>
                <td><form:hidden path="cid"/></td>
            </tr>
            <tr>
                <td>Customer Name:</td>
                <td><form:input path="cname"/></td>
            </tr>
            <tr>
                <td>Mobile Number:</td>
                <td><form:input path="mno"/></td>
            </tr>
            <tr>
                <td>Product Name:</td>
                <td><form:input path="pname"/></td>
            </tr>
            <tr>
                <td>Price</td>
                <td><form:input path="price"/></td>
            </tr>
            
            <tr>
                <td>Quantity:</td>
                <td><form:input path="quantity"/></td>
            </tr>
            
            <tr>
                <td></td>
                <td><input type="submit" value="Edit Save"></td>
            </tr>
        </table>

    </form:form>
    <a href="/viewProduct"> view All Product Details</a><p></p>
    <a href="/">Add New Product Here</a>
</body>
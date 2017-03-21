<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<t:mainLayout title="Calc">


    <form action="" id="reg" name='registration' method="POST">

        <h2>Order</h2>
        <p>Enter fullname (required, at least 3 characters, 20 symbols)</p>
        <div class="md-form">
            <i class="fa fa-user fa-3x prefix"></i>
            <input type="text" name="fullname" id="fullname" class="form-control"
                   <c:if test="${not empty name}">value="${name}" </c:if>>
            <label for="fullname" class="">for example: Aaron Smith</label>
        </div>
        <br/>

        <p>Enter Email (required)</p>
        <div class="md-form">
            <i class="fa fa-envelope prefix"></i>
            <input type="text" name="email" id="email" class="form-control">
            <label for="email" class="">example@example.com</label>
        </div>
        <br/>
        <p>Enter your name</p>
        <div class="md-form">
            <i class="fa fa-lock prefix"></i>
            <input type="text" name="name" id="name" class="form-control">
            <label for="name" class="">(required, at least 3 characters) </label>
        </div>

        <br/>
        <p>Enter your address</p>
        <div class="md-form">
            <i class="fa fa-lock prefix"></i>
            <input type="text" name="address" id="address" class="form-control">
            <label for="address" class="">You're not robot, right?</label><br/>
        </div>

        <br>
        <c:forEach var="good" items="${list}">

            ${good.getName()}   ${good.getValue() }  <br>
            <input type="number" name="${good.getGoodId()}" id="${good.getGoodId()}" class="form-control">
            <input type="hidden" name="id" id="id"  value="${good.getGoodId()}">
        </c:forEach>

        <br>

        <button type="submit" value="Register" name="submit" class="btn btn-primary btn-lg">Save
        </button>
    </form>
</t:mainLayout>
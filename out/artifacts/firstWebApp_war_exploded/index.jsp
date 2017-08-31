<%--
  Created by IntelliJ IDEA.
  User: adammendak
  Date: 30.08.17
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
 <h1>KALKULATOR</h1>
  <form action="calculator" method="get">
    <p>
      Pierwsza Liczba: <input type="text" name="firstNumber">
    </p>
    <p>
      Druga Liczba: <input type="text" name="secondNumber">
    </p>
    <p>
      co chcesz zrobic ?
      <input type="radio" name="equation" value="dodawanie">dodawanie <br>
      <input type="radio" name="equation" value="odejmowanie"> odejmowanie <br>
      <input type="radio" name="equation" value="dzielenie"> dzielenie <br>
      <input type="radio" name="equation" value="mnozenie">mnozenie <br>

    </p>
    <p>
      <input type="submit" value="slij">
    </p>
  </form>

  </body>
</html>

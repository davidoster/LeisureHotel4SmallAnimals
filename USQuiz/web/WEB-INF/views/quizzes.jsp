<%-- 
    Document   : quizzes
    Created on : 22-May-2020, 16:43:01
    Author     : mac
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page import="models.QuizEntryDTO"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table>
            <thead>
                <tr>
                    <th>STATE</th>
                    <th>CAPITAL</th>
                    <th>LARGEST CITY</th>
                    <th>BIRD</th>
                    <th>FLOWER</th>
                </tr>
            </thead>
            <% 
                List<QuizEntryDTO> dtos = (List<QuizEntryDTO>)(request.getAttribute("dtos")); 
                session.setAttribute("dtos", dtos);
            %> 
            <c:forEach items="${dtos}" var="value">
                <tr>
                    <c:if test="${value.visibility.state}">
                        <td class="vshow">${value.entry.state}</td>
                    </c:if>

                    <c:if test="${!value.visibility.state}">
                        <td class="vhide">${value.entry.state}</td>
                    </c:if>

                    <c:if test="${value.visibility.capital}">
                        <td class="vshow">${value.entry.capital}</td>
                    </c:if>

                    <c:if test="${!value.visibility.capital}">
                        <td class="vhide" onmouseover="vshow()">${value.entry.capital}</td>
                    </c:if>

                    <c:if test="${value.visibility.largestCity}">
                        <td class="vshow">${value.entry.largestCity}</td>
                    </c:if>

                    <c:if test="${!value.visibility.largestCity}">
                        <td class="vhide">${value.entry.largestCity}</td>
                    </c:if>

                    <c:if test="${value.visibility.bird}">
                        <td class="vshow">${value.entry.bird}</td>
                    </c:if>

                    <c:if test="${!value.visibility.bird}">
                        <td class="vhide">${value.entry.bird}</td>
                    </c:if>

                    <c:if test="${value.visibility.flower}">
                        <td class="vshow">${value.entry.flower}</td>
                    </c:if>

                    <c:if test="${!value.visibility.flower}">
                        <td class="vhide">${value.entry.flower}</td>
                    </c:if>
                </tr>
            </c:forEach>
            
        </table>
    </body>
</html>

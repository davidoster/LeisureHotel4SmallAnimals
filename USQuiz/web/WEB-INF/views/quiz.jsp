<%-- 
    Document   : quiz
    Created on : 22-May-2020, 10:28:47
    Author     : mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page import="models.QuizEntryDTO"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .vshow { font-weight: 700; }
            .vhide { display: hidden; }
        </style>
        <script
            src="https://code.jquery.com/jquery-3.5.1.min.js"
            integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0="
            crossorigin="anonymous">
        </script>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%= request.getAttribute("qentry") %>
        ${qentry}
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
                QuizEntryDTO dto = (QuizEntryDTO)(request.getAttribute("qentry")); 
                session.setAttribute("dto", dto);
            %> 
            <tr>
                <c:if test="${dto.visibility.state}">
                    <td class="vshow">${dto.entry.state}</td>
                </c:if>
                
                <c:if test="${!dto.visibility.state}">
                    <td class="vhide">${dto.entry.state}</td>
                </c:if>
                
                <c:if test="${dto.visibility.capital}">
                    <td class="vshow">${dto.entry.capital}</td>
                </c:if>
                
                <c:if test="${!dto.visibility.capital}">
                    <td class="vhide" onmouseover="vshow()">${dto.entry.capital}</td>
                </c:if>
                
                <c:if test="${dto.visibility.largestCity}">
                    <td class="vshow">${dto.entry.largestCity}</td>
                </c:if>
                
                <c:if test="${!dto.visibility.largestCity}">
                    <td class="vhide">${dto.entry.largestCity}</td>
                </c:if>
                
                <c:if test="${dto.visibility.bird}">
                    <td class="vshow">${dto.entry.bird}</td>
                </c:if>
                
                <c:if test="${!dto.visibility.bird}">
                    <td class="vhide">${dto.entry.bird}</td>
                </c:if>
                
                <c:if test="${dto.visibility.flower}">
                    <td class="vshow">${dto.entry.flower}</td>
                </c:if>
                
                <c:if test="${!dto.visibility.flower}">
                    <td class="vhide">${dto.entry.flower}</td>
                </c:if>
            </tr>
        </table>
            <script>
                function vshow() {
                    console.log("entered");
                    $(".vhide").hover(function(){
                        $(this).css("display", "block");
                    }, function() {
                        $(this).css("display", "hidden");
                    });
                }
            </script>
    </body>
</html>

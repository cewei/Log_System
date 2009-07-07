<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : IcePage1
    Created on : Jul 6, 2009, 2:30:53 PM
    Author     : Dell
-->
<jsp:root version="2.0" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:ice="http://www.icesoft.com/icefaces/component" xmlns:jsp="http://java.sun.com/JSP/Page">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <html id="outputHtml1">
            <head id="outputHead1">
                <ice:outputStyle href="./resources/stylesheet.css" id="outputStyle1"/>
                <ice:outputStyle href="./xmlhttp/css/xp/xp.css" id="outputStyle2"/>
            </head>
            <body id="outputBody1" style="-rave-layout: grid">
                <ice:form id="form1">
                    <ice:outputLink id="outputLink1" style="position: absolute; left: 24px; top: 24px" value="./faces/para_type/View.jsp">
                        <ice:outputText id="outputText1" value="Parachute Type"/>
                    </ice:outputLink>
                    <ice:outputChart chartTitle="Parachute Status" colors="#{IcePage1.color}" data="#{IcePage1.data}" id="outputChart1"
                        labels="#{IcePage1.labels}" style="left: 24px; top: 120px; position: absolute" type="pie2d"/>
                </ice:form>
            </body>
        </html>
    </f:view>
</jsp:root>

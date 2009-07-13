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
                <title>Start Page</title>
            </head>
            <body id="outputBody1" style="-rave-layout: grid">
                <ice:form id="form1">
                    <ice:outputLink id="outputLink1" style="left: 24px; top: 24px; position: absolute" value="./faces/para_type/View.jsp">
                        <ice:outputText id="outputText1" value="Parachute Type"/>
                    </ice:outputLink>
                    <ice:outputLink id="outputLink2" style="position: absolute; left: 144px; top: 24px" value="./faces/para_inventory/View.jsp">
                        <ice:outputText id="outputText2" value="Parachute Inventory"/>
                    </ice:outputLink>
                    <ice:outputLink id="outputLink3" style="position: absolute; left: 288px; top: 24px" value="./faces/para_packing/View.jsp">
                        <ice:outputText id="outputText3" value="Parachute Packing"/>
                    </ice:outputLink>
                    <ice:outputLink id="outputLink4" style="position: absolute; left: 432px; top: 24px" value="./faces/para_loan/View.jsp">
                        <ice:outputText id="outputText4" value="Parachute Loan"/>
                    </ice:outputLink>
                    <ice:outputLink id="outputLink5" style="position: absolute; left: 552px; top: 24px" value="./faces/para_riggers/View.jsp">
                        <ice:outputText id="outputText5" value="Parachute Riggers"/>
                    </ice:outputLink>
                    <ice:outputLink id="outputLink6" style="position: absolute; left: 696px; top: 24px" value="./faces/para_borrowers/View.jsp">
                        <ice:outputText id="outputText6" value="Parachute Borrowers"/>
                    </ice:outputLink>
                    <ice:outputChart chartTitle="Parachute Status" colors="#{IcePage1.color}" data="#{IcePage1.data}" id="outputChart1"
                        labels="#{IcePage1.labels}" style="left: 24px; top: 120px; position: absolute" type="pie2d"/>

                </ice:form>
            </body>
        </html>
    </f:view>
</jsp:root>

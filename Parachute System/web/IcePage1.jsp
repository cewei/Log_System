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
                <script type="text/javascript">
                    function render() {
                        document.getElementById("form1:button1").click();
                    }
                </script>
            </head>
            <body id="outputBody1" onload="javascript:render()" style="-rave-layout: grid">
                <ice:form id="form1">
                    <ice:outputLink id="outputLink1" style="left: 24px; top: 24px; position: absolute" value="./faces/para_riggers/View.jsp">
                        <ice:outputText id="outputText1" value="Parachute Riggers"/>
                    </ice:outputLink>
                    <ice:outputLink id="outputLink2" style="left: 168px; top: 24px; position: absolute" value="./faces/para_type/View.jsp">
                        <ice:outputText id="outputText2" value="Parachute Type"/>
                    </ice:outputLink>
                    <ice:outputLink id="outputLink3" style="left: 288px; top: 24px; position: absolute" value="./faces/para_inventory/View.jsp">
                        <ice:outputText id="outputText3" value="Parachute Inventory"/>
                    </ice:outputLink>
                    <ice:outputLink id="outputLink4" style="position: absolute; left: 432px; top: 24px" value="./faces/para_packing/Consolidated_Main.jsp">
                        <ice:outputText id="outputText4" value="Consolidated Maintance"/>
                    </ice:outputLink>
                    <ice:outputLink id="outputLink5" style="left: 600px; top: 24px; position: absolute" value="./faces/para_packing/View_PackDue.jsp">
                        <ice:outputText id="outputText5" value="Pack Due Date Record"/>
                    </ice:outputLink>
                    <ice:outputLink id="outputLink6" style="position: absolute; left: 768px; top: 24px" value="./faces/para_loan/Bulk_Generate.jsp">
                        <ice:outputText id="outputText6" value="Parachute Numbering Form"/>
                    </ice:outputLink>
                    <ice:outputLink id="outputLink7" style="left: 960px; top: 24px; position: absolute" value="./faces/para_packing/View.jsp">
                        <ice:outputText id="outputText7" value="Parachute Packing"/>
                    </ice:outputLink>
                    <ice:outputLink id="outputLink8" style="left: 1104px; top: 24px; position: absolute" value="./faces/para_loan/View.jsp">
                        <ice:outputText id="outputText8" value="Parachute Loan"/>
                    </ice:outputLink>
                    <ice:outputLink id="outputLink9" style="left: 1224px; top: 24px; position: absolute" value="./faces/para_borrowers/View.jsp">
                        <ice:outputText id="outputText9" value="Parachute Borrowers"/>
                    </ice:outputLink>
                    <ice:commandButton action="#{IcePage1.button1_action}" id="button1" style="left: 480px; top: 96px; position: absolute; z-index: 499" value="submit"/>
                    <div style="left: 240px; top: 72px; position: absolute">
                        <jsp:directive.include file="Fragment1.jspf"/>
                    </div>
                    <div style="left: 24px; top: 480px; position: absolute">
                        <jsp:directive.include file="Fragment2.jspf"/>
                    </div>
                    <div style="position: absolute; left: 576px; top: 480px">
                        <jsp:directive.include file="Fragment3.jspf"/>
                    </div>
                    <div style="left: 24px; top: 888px; position: absolute">
                        <jsp:directive.include file="Fragment4.jspf"/>
                    </div>
                    <div style="position: absolute; left: 576px; top: 888px">
                        <jsp:directive.include file="Fragment5.jspf"/>
                    </div>
                </ice:form>
            </body>
        </html>
    </f:view>
</jsp:root>

<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Add
    Created on : Jun 11, 2009, 3:18:11 PM
    Author     : Dell
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="Add Parachute Borrowers">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:label for="nricTF" id="label1" style="left: 24px; top: 48px; position: absolute" text="NRIC"/>
                        <webuijsf:label for="nameTF" id="label2" style="left: 24px; top: 72px; position: absolute" text="Name"/>
                        <webuijsf:label for="rankTF" id="label3" style="left: 24px; top: 96px; position: absolute" text="Rank"/>
                        <webuijsf:label for="unitTF" id="label4" style="position: absolute; left: 24px; top: 120px" text="Unit"/>
                        <webuijsf:textField binding="#{para_borrowers$Add.nricTF}" id="nricTF" required="true" style="left: 96px; top: 48px; position: absolute"/>
                        <webuijsf:textField binding="#{para_borrowers$Add.nameTF}" id="nameTF" required="true" style="left: 96px; top: 72px; position: absolute"/>
                        <webuijsf:textField binding="#{para_borrowers$Add.rankTF}" id="rankTF" required="true" style="left: 96px; top: 96px; position: absolute"/>
                        <webuijsf:textField binding="#{para_borrowers$Add.unitTF}" id="unitTF" required="true" style="position: absolute; left: 96px; top: 120px"/>
                        <webuijsf:button actionExpression="#{para_borrowers$Add.add_action}" id="add" style="position: absolute; left: 24px; top: 144px" text="Add"/>
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink id="hyperlink1" text="Page1" url="/"/>
                            <webuijsf:hyperlink id="hyperlink2" text="para_borrowers/View" url="/faces/para_borrowers/View.jsp"/>
                            <webuijsf:hyperlink id="hyperlink3" text="para_borrowers/Add" url="/faces/para_borrowers/Add.jsp"/>
                        </webuijsf:breadcrumbs>
                        <webuijsf:message for="nricTF" id="message1" showDetail="false" showSummary="true" style="position: absolute; left: 240px; top: 48px"/>
                        <webuijsf:message for="nameTF" id="message2" showDetail="false" showSummary="true" style="position: absolute; left: 240px; top: 72px"/>
                        <webuijsf:message for="rankTF" id="message3" showDetail="false" showSummary="true" style="position: absolute; left: 240px; top: 96px"/>
                        <webuijsf:message for="unitTF" id="message4" showDetail="false" showSummary="true" style="position: absolute; left: 240px; top: 120px"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>

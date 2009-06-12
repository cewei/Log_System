<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Add
    Created on : Jun 12, 2009, 2:45:07 PM
    Author     : Dell
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="Add Parachute Loan">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink id="hyperlink1" text="Page1" url="/"/>
                            <webuijsf:hyperlink id="hyperlink2" text="para_loan/View" url="/faces/para_loan/View.jsp"/>
                            <webuijsf:hyperlink id="hyperlink3" text="para_loan/Add" url="/faces/para_loan/Add.jsp"/>
                        </webuijsf:breadcrumbs>
                        <webuijsf:label id="label1" style="left: 24px; top: 72px; position: absolute" text="NRIC"/>
                        <webuijsf:dropDown id="nricDD" items="#{para_loan$Add.para_borrowersDataProvider.options['para_borrowers.NRIC,para_borrowers.NRIC']}"
                            style="position: absolute; left: 72px; top: 72px" valueChangeListenerExpression="#{para_loan$Add.nricDD_processValueChange}"/>
                        <webuijsf:label id="label2" style="position: absolute; left: 24px; top: 96px" text="Name"/>
                        <webuijsf:label id="label3" style="position: absolute; left: 24px; top: 120px" text="Unit"/>
                        <webuijsf:staticText id="nameST" style="position: absolute; left: 72px; top: 96px"/>
                        <webuijsf:staticText id="unitST" style="position: absolute; left: 72px; top: 120px"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>

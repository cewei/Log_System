<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : BulkReturn
    Created on : Jul 23, 2009, 10:00:29 AM
    Author     : Dell
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="Bulk Return">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink id="hyperlink1" text="Page1" url="/"/>
                            <webuijsf:hyperlink id="hyperlink2" text="para_loan/View" url="/faces/para_loan/View.jsp"/>
                            <webuijsf:hyperlink id="hyperlink3" text="para_loan/BulkReturn" url="/faces/para_loan/BulkReturn.jsp"/>
                        </webuijsf:breadcrumbs>
                        <webuijsf:upload binding="#{para_loan$BulkReturn.fileUpload1}" id="fileUpload1" label="Return List" required="true" style="position: absolute; left: 24px; top: 72px"/>
                        <webuijsf:calendar binding="#{para_loan$BulkReturn.calendar1}" dateFormatPattern="dd/MM/yyyy" id="calendar1" label="Return Date"
                            required="true" style="position: absolute; left: 24px; top: 120px"/>
                        <webuijsf:button actionExpression="#{para_loan$BulkReturn.button1_action}" id="button1"
                            style="position: absolute; left: 24px; top: 168px" text="Return"/>
                        <webuijsf:message for="fileUpload1" id="message1" showDetail="false" showSummary="true" style="position: absolute; left: 456px; top: 72px"/>
                        <webuijsf:message for="calendar1" id="message2" showDetail="false" showSummary="true" style="position: absolute; left: 288px; top: 120px"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>

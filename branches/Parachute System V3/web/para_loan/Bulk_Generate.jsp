<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Bulk
    Created on : Jul 15, 2009, 11:21:40 AM
    Author     : Dell
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="Generate Parachute Numbering Form">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink id="hyperlink1" text="Page1" url="/"/>
                            <webuijsf:hyperlink id="hyperlink3" text="para_loan/Bulk_Generate" url="/faces/para_loan/Bulk_Generate.jsp"/>
                        </webuijsf:breadcrumbs>
                        <webuijsf:upload binding="#{para_loan$Bulk_Generate.fileUpload1}" id="fileUpload1" label="Main" style="left: 24px; top: 72px; position: absolute"/>
                        <webuijsf:button actionExpression="#{para_loan$Bulk_Generate.upload_action}" binding="#{para_loan$Bulk_Generate.upload}" id="upload"
                            style="left: 23px; top: 216px; position: absolute" text="Upload"/>
                        <webuijsf:upload binding="#{para_loan$Bulk_Generate.fileUpload2}" id="fileUpload2" label="Reserve" style="left: 24px; top: 120px; position: absolute"/>
                        <webuijsf:upload binding="#{para_loan$Bulk_Generate.fileUpload3}" id="fileUpload3" label="Life Jacket" style="position: absolute; left: 24px; top: 168px"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>

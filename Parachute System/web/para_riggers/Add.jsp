<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Add
    Created on : Jun 10, 2009, 10:08:10 AM
    Author     : Dell
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="Add Parachute Riggers">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:label for="nricTF" id="label1" style="left: 24px; top: 48px; position: absolute" text="NRIC"/>
                        <webuijsf:label for="nameTF" id="label2" style="left: 24px; top: 72px; position: absolute" text="Name"/>
                        <webuijsf:label for="rankTF" id="label3" style="left: 24px; top: 96px; position: absolute" text="Rank"/>
                        <webuijsf:label for="riggerCB" id="label4" style="left: 24px; top: 120px; position: absolute" text="Packer"/>
                        <webuijsf:label for="inspectorCB" id="label5" style="left: 24px; top: 144px; position: absolute" text="Checker / Inspector"/>
                        <webuijsf:textField binding="#{para_riggers$Add.nricTF}" id="nricTF" required="true" style="left: 96px; top: 48px; position: absolute"/>
                        <webuijsf:textField binding="#{para_riggers$Add.nameTF}" id="nameTF" required="true" style="left: 96px; top: 72px; position: absolute"/>
                        <webuijsf:textField binding="#{para_riggers$Add.rankTF}" id="rankTF" required="true" style="left: 96px; top: 96px; position: absolute"/>
                        <webuijsf:checkbox binding="#{para_riggers$Add.riggerCB}" id="riggerCB" selected="false" style="left: 168px; top: 120px; position: absolute"/>
                        <webuijsf:checkbox binding="#{para_riggers$Add.inspectorCB}" id="inspectorCB" selected="false" style="left: 168px; top: 144px; position: absolute"/>
                        <webuijsf:button actionExpression="#{para_riggers$Add.add_action}" id="add" style="left: 23px; top: 192px; position: absolute" text="Add"/>
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink id="hyperlink1" text="Page1" url="/"/>
                            <webuijsf:hyperlink id="hyperlink2" text="para_riggers/View" url="/faces/para_riggers/View.jsp"/>
                            <webuijsf:hyperlink id="hyperlink3" text="para_riggers/Add" url="/faces/para_riggers/Add.jsp"/>
                        </webuijsf:breadcrumbs>
                        <webuijsf:message for="nricTF" id="message1" showDetail="false" showSummary="true" style="position: absolute; left: 240px; top: 48px"/>
                        <webuijsf:message for="nameTF" id="message2" showDetail="false" showSummary="true" style="left: 240px; top: 72px; position: absolute"/>
                        <webuijsf:message for="rankTF" id="message3" showDetail="false" showSummary="true" style="left: 240px; top: 96px; position: absolute"/>
                        <webuijsf:messageGroup id="messageGroup1" showGlobalOnly="true" style="position: absolute; left: 384px; top: 48px"/>
                        <webuijsf:calendar binding="#{para_riggers$Add.calendar1}" dateFormatPattern="dd-MM-yyyy" id="calendar1" label="Last Refresher Date"
                            required="true" style="left: 24px; top: 168px; position: absolute"/>
                        <webuijsf:message for="calendar1" id="message4" showDetail="false" showSummary="true" style="left: 336px; top: 168px; position: absolute"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>

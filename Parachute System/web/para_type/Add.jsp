<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Add
    Created on : May 21, 2009, 11:47:11 AM
    Author     : Dell
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="Add Parachute Type">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1" virtualFormsConfig="save | typePrefixText nameText lifeSpanText maxJumpText repackCycleText | typePrefixText nameText lifeSpanText maxJumpText repackCycleText">
                        <webuijsf:label for="typePrefixText" id="typePrefixLbl" style="left: 24px; top: 48px; position: absolute" text="Type Prefix"/>
                        <webuijsf:label for="nameText" id="nameLbl" style="left: 24px; top: 72px; position: absolute" text="Type Name"/>
                        <webuijsf:label for="lifeSpanText" id="lifeSpanLbl" style="left: 24px; top: 96px; position: absolute" text="Life Span (Yrs)"/>
                        <webuijsf:label for="maxJumpText" id="maxJumpLbl" style="left: 24px; top: 120px; position: absolute" text="Max No. Jumps"/>
                        <webuijsf:label for="repackCycleText" id="repackCycleLbl" style="left: 24px; top: 144px; position: absolute" text="Repack Cycle (Months)"/>
                        <webuijsf:label id="label1" style="position: absolute; left: 24px; top: 168px" text="Reserve"/>
                        <webuijsf:label id="label2" style="position: absolute; left: 24px; top: 192px" text="Static Line"/>
                        <webuijsf:textField binding="#{para_type$Add.typePrefixText}" id="typePrefixText" required="true" style="left: 168px; top: 48px; position: absolute"/>
                        <webuijsf:textField binding="#{para_type$Add.nameText}" id="nameText" required="true" style="left: 168px; top: 72px; position: absolute"/>
                        <webuijsf:textField binding="#{para_type$Add.lifeSpanText}" id="lifeSpanText" required="true" style="left: 168px; top: 96px; position: absolute"/>
                        <webuijsf:textField binding="#{para_type$Add.maxJumpText}" id="maxJumpText" required="true" style="left: 168px; top: 120px; position: absolute"/>
                        <webuijsf:textField binding="#{para_type$Add.repackCycleText}" id="repackCycleText" required="true" style="left: 168px; top: 144px; position: absolute"/>
                        <webuijsf:checkbox binding="#{para_type$Add.checkbox1}" id="checkbox1" style="position: absolute; left: 168px; top: 168px"/>
                        <webuijsf:checkbox binding="#{para_type$Add.checkbox2}" id="checkbox2" style="position: absolute; left: 168px; top: 192px"/>
                        <webuijsf:button actionExpression="#{para_type$Add.add_action}" id="add" style="left: 23px; top: 288px; position: absolute" text="Add"/>
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink id="hyperlink1" text="Page1" url="/"/>
                            <webuijsf:hyperlink id="hyperlink2" text="para_type/View" url="/faces/para_type/View.jsp"/>
                            <webuijsf:hyperlink id="hyperlink3" text="para_type/Add" url="/faces/para_type/Add.jsp"/>
                        </webuijsf:breadcrumbs>
                        <webuijsf:messageGroup id="messageGroup1" showGlobalOnly="true" style="left: 432px; top: 24px; position: absolute"/>
                        <webuijsf:message for="typePrefixText" id="message1" showDetail="false" showSummary="true" style="position: absolute; left: 312px; top: 48px"/>
                        <webuijsf:message for="nameText" id="message2" showDetail="false" showSummary="true" style="position: absolute; left: 312px; top: 72px"/>
                        <webuijsf:message for="lifeSpanText" id="message3" showDetail="false" showSummary="true" style="position: absolute; left: 312px; top: 96px"/>
                        <webuijsf:message for="maxJumpText" id="message4" showDetail="false" showSummary="true" style="position: absolute; left: 312px; top: 120px"/>
                        <webuijsf:message for="repackCycleText" id="message5" showDetail="false" showSummary="true" style="position: absolute; left: 312px; top: 144px"/>
                        <webuijsf:label id="label3" style="position: absolute; left: 24px; top: 216px" text="Life Jacket"/>
                        <webuijsf:label id="label4" style="position: absolute; left: 24px; top: 240px" text="AD"/>
                        <webuijsf:label id="label5" style="position: absolute; left: 24px; top: 264px" text="Container"/>
                        <webuijsf:checkbox binding="#{para_type$Add.checkbox3}" id="checkbox3" style="position: absolute; left: 168px; top: 216px"/>
                        <webuijsf:checkbox binding="#{para_type$Add.checkbox4}" id="checkbox4" style="position: absolute; left: 168px; top: 240px"/>
                        <webuijsf:checkbox binding="#{para_type$Add.checkbox5}" id="checkbox5" style="position: absolute; left: 168px; top: 264px"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>

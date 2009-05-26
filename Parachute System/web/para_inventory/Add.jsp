<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Add
    Created on : May 26, 2009, 3:22:17 PM
    Author     : Dell
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1" virtualFormsConfig="virtualForm1 | typeDropDown | typeDropDown">
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink id="hyperlink5" text="Page1" url="/faces/para_inventory/Page1.jsp"/>
                            <webuijsf:hyperlink id="hyperlink1" text="para_inventory/View" url="/faces/para_inventory/View.jsp"/>
                            <webuijsf:hyperlink id="hyperlink6" text="para_inventory/Add" url="/faces/para_inventory/Add.jsp"/>
                        </webuijsf:breadcrumbs>
                        <webuijsf:label for="typeDropDown" id="typeLabel" style="position: absolute; left: 24px; top: 48px" text="Type"/>
                        <webuijsf:dropDown binding="#{para_inventory$Add.typeDropDown}" converter="#{para_inventory$Add.typeDropDownConverter}"
                            id="typeDropDown" items="#{para_inventory$Add.para_typeDataProvider.options['para_type.para_type_no,para_type.name']}"
                            onChange="webui.suntheme4_2.common.timeoutSubmitForm(this.form, 'typeDropDown');" required="true" style="left: 168px; top: 48px; position: absolute"/>
                        <webuijsf:label for="chuteTextField" id="chuteLabel" style="position: absolute; left: 24px; top: 72px" text="Chute No"/>
                        <webuijsf:textField id="chuteTextField" required="true" style="left: 168px; top: 72px; position: absolute" text="#{para_inventory$Add.chute_no}"/>
                        <webuijsf:label for="serialTextField" id="serialLabel" style="position: absolute; left: 24px; top: 96px" text="Serial No"/>
                        <webuijsf:textField id="serialTextField" required="true" style="left: 168px; top: 96px; position: absolute"/>
                        <webuijsf:label for="mfgCalendar" id="mfgLabel" style="position: absolute; left: 24px; top: 120px" text="Manufacted Date"/>
                        <webuijsf:calendar dateFormatPattern="yyyy-MM-dd" id="mfgCalendar" required="true" style="left: 168px; top: 120px; position: absolute"/>
                        <webuijsf:messageGroup id="messageGroup1" style="left: 336px; top: 48px; position: absolute"/>
                        <webuijsf:button actionExpression="#{para_inventory$Add.add_action}" id="add" style="left: 23px; top: 216px; position: absolute" text="Add"/>
                        <webuijsf:label for="jumpTextField" id="jumpLabel" style="position: absolute; left: 24px; top: 144px" text="No of Jumps"/>
                        <webuijsf:textField id="jumpTextField" required="true" style="position: absolute; left: 168px; top: 144px" text="0"/>
                        <webuijsf:label for="statusTextField" id="statusLabel" style="position: absolute; left: 24px; top: 168px" text="Status"/>
                        <webuijsf:textField id="statusTextField" style="position: absolute; left: 168px; top: 168px"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>

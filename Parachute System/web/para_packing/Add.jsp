<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Add
    Created on : Jun 3, 2009, 3:50:26 PM
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
                    <webuijsf:form id="form1">
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink id="hyperlink1" text="Page1" url="/"/>
                            <webuijsf:hyperlink id="hyperlink2" text="para_packing/View" url="/faces/para_packing/View.jsp"/>
                            <webuijsf:hyperlink id="hyperlink3" text="para_packing/Add" url="/faces/para_packing/Add.jsp"/>
                        </webuijsf:breadcrumbs>
                        <webuijsf:label id="label1" style="position: absolute; left: 24px; top: 72px" text="Serial No"/>
                        <webuijsf:label id="label2" style="position: absolute; left: 24px; top: 96px" text="Chute No"/>
                        <webuijsf:label id="label3" style="position: absolute; left: 24px; top: 120px" text="Repacked Date"/>
                        <webuijsf:label id="label4" style="position: absolute; left: 24px; top: 144px" text="Packed by"/>
                        <webuijsf:label id="label5" style="position: absolute; left: 24px; top: 168px" text="Inspected by"/>
                        <webuijsf:label id="label6" style="position: absolute; left: 24px; top: 192px" text="Check Type"/>
                        <webuijsf:label id="label7" style="position: absolute; left: 24px; top: 216px" text="Status"/>
                        <webuijsf:staticText binding="#{para_packing$Add.serialNoST}" id="serialNoST" style="position: absolute; left: 120px; top: 72px"/>
                        <webuijsf:staticText id="chuteNoST" style="position: absolute; left: 120px; top: 96px"/>
                        <webuijsf:calendar dateFormatPattern="dd-MM-yyyy" id="repackDateCal" required="true" style="position: absolute; left: 120px; top: 120px"/>
                        <webuijsf:dropDown id="statusDD" items="#{para_packing$Add.statusDDDefaultOptions.options}" style="position: absolute; left: 120px; top: 216px"/>
                        <webuijsf:textField id="inspectedByTF" style="position: absolute; left: 120px; top: 168px"/>
                        <webuijsf:textField id="packedByTF" style="position: absolute; left: 120px; top: 144px"/>
                        <webuijsf:dropDown id="checkTypeDD" items="#{para_packing$Add.checkTypeDDDefaultOptions.options}" style="position: absolute; left: 120px; top: 192px"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>

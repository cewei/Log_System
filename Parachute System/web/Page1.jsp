<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Page1
    Created on : May 21, 2009, 11:43:48 AM
    Author     : Dell
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="Start Page">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:anchor id="para_type_link" style="position: absolute; left: 24px; top: 24px" text="Parachute Type" url="/faces/para_type/View.jsp"/>
                        <webuijsf:anchor id="para_inventory_link" style="left: 24px; top: 48px; position: absolute" text="Parachute Inventory" url="/faces/para_inventory/View.jsp"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>

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
                        <webuijsf:anchor id="para_inventory_link" style="left: 120px; top: 24px; position: absolute" text="Parachute Inventory" url="/faces/para_inventory/View.jsp"/>
                        <webuijsf:anchor id="para_packing_link" style="left: 240px; top: 24px; position: absolute" text="Parachute Packing" url="/faces/para_packing/View.jsp"/>
                        <webuijsf:label id="label1" style="left: 24px; top: 48px; position: absolute" text="Loaned Out : "/>
                        <webuijsf:label id="label2" style="left: 24px; top: 72px; position: absolute" text="Serviceable : "/>
                        <webuijsf:label id="label3" style="left: 24px; top: 96px; position: absolute" text="Servicing : "/>
                        <webuijsf:staticText binding="#{Page1.loanT}" id="loanT" style="left: 120px; top: 48px; position: absolute"/>
                        <webuijsf:staticText binding="#{Page1.serviceableT}" id="serviceableT" style="left: 120px; top: 72px; position: absolute"/>
                        <webuijsf:staticText binding="#{Page1.servicingT}" id="servicingT" style="left: 120px; top: 96px; position: absolute"/>
                        <webuijsf:anchor id="para_loan_link" style="position: absolute; left: 360px; top: 24px" text="Parachute Loan" url="/faces/para_loan/View.jsp"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>

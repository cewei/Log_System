<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : View_Combined
    Created on : 27/07/2009, 10:06:00 AM
    Author     : user
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
                        <webuijsf:tabSet id="tabSet1" selected="tab1" style="position: absolute; left: 24px; top: 48px">
                            <webuijsf:tab actionExpression="#{para_inventory$View_Combined.tab1_action}" id="tab1" text="Tab 1">
                                <webuijsf:panelLayout id="layoutPanel1" style="width: 100%; height: 128px;"/>
                            </webuijsf:tab>
                        </webuijsf:tabSet>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>

<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Report
    Created on : Jul 15, 2009, 3:39:02 PM
    Author     : Dell
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:ice="http://www.icesoft.com/icefaces/component"
    xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <ice:dataTable id="dataTable1" style="position: absolute; left: 24px; top: 24px" value="#{para_loan$Report.dataTable1Model}" var="currentRow">
                            <ice:column id="column1">
                                <ice:outputText id="outputText1" value="#{currentRow['COLUMN1']}"/>
                                <f:facet name="header">
                                    <ice:outputText id="outputText2" value="MAIN"/>
                                </f:facet>
                            </ice:column>
                            <ice:column id="column2">
                                <ice:outputText id="outputText3" value="#{currentRow['COLUMN2']}"/>
                                <f:facet name="header">
                                    <ice:outputText id="outputText4" value="RESERVE"/>
                                </f:facet>
                            </ice:column>
                            <ice:column id="column3">
                                <ice:outputText id="outputText5" value="#{currentRow['COLUMN3']}"/>
                                <f:facet name="header">
                                    <ice:outputText id="outputText6" value="Table_Column3"/>
                                </f:facet>
                            </ice:column>
                        </ice:dataTable>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>

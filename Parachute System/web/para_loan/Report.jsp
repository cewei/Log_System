<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Report
    Created on : Jul 16, 2009, 2:32:28 PM
    Author     : Dell
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="Report">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:table augmentTitle="false" id="table1" style="left: 24px; top: 24px; position: absolute" width="700">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{para_loan$Report.objectArrayDataProvider1}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="MAIN" id="tableColumn1" sort="main" width="350">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['main']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="RESERVE" id="tableColumn2" sort="reserve" width="350">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['reserve']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>

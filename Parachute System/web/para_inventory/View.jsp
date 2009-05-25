<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : View
    Created on : May 24, 2009, 10:01:35 PM
    Author     : Lancer-Matrix
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="View Parachute Inventory">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink id="hyperlink1" text="Page1" url="/"/>
                            <webuijsf:hyperlink id="hyperlink5" text="para_inventory/View" url="/faces/para_inventory/View.jsp"/>
                        </webuijsf:breadcrumbs>
                        <webuijsf:table augmentTitle="false" id="table1" style="position: absolute; left: 24px; top: 72px" title="Parachute Inventory" width="0">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{para_inventory$View.para_overviewDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="type_prefix" id="tableColumn1" sort="para_overview.type_prefix">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['para_overview.type_prefix']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="chute_no" id="tableColumn2" sort="para_overview.chute_no">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['para_overview.chute_no']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="serial_no" id="tableColumn3" sort="para_overview.serial_no">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['para_overview.serial_no']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="date_of_mfg" id="tableColumn4" sort="para_overview.date_of_mfg">
                                    <webuijsf:staticText id="staticText4" text="#{currentRow.value['para_overview.date_of_mfg']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>

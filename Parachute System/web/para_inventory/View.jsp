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
                        <webuijsf:table augmentTitle="false" id="table1" style="position: absolute; left: 24px; top: 72px" title="Table" width="0">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{para_inventory$View.para_overviewDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="serial_no" id="tableColumn1" sort="para_overview.serial_no">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['para_overview.serial_no']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="name" id="tableColumn2" sort="para_overview.name">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['para_overview.name']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="para_serial" id="tableColumn3" sort="para_overview.para_serial">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['para_overview.para_serial']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="life_span" id="tableColumn4" sort="para_overview.life_span">
                                    <webuijsf:staticText id="staticText4" text="#{currentRow.value['para_overview.life_span']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="max_jump" id="tableColumn5" sort="para_overview.max_jump">
                                    <webuijsf:staticText id="staticText5" text="#{currentRow.value['para_overview.max_jump']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="para_jumps_left" id="tableColumn6" sort="para_overview.para_jumps_left">
                                    <webuijsf:staticText id="staticText6" text="#{currentRow.value['para_overview.para_jumps_left']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="date_of_mfg" id="tableColumn7" sort="para_overview.date_of_mfg">
                                    <webuijsf:staticText id="staticText7" text="#{currentRow.value['para_overview.date_of_mfg']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>

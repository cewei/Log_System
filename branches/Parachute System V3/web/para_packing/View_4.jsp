<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : View
    Created on : Jun 22, 2009, 2:27:00 PM
    Author     : Dell
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1" title="View Parachute Packing">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:breadcrumbs id="breadcrumbs1" style="left: 14px; top: 14px; position: absolute">
                            <webuijsf:hyperlink id="hyperlink1" text="Page1" url="/"/>
                            <webuijsf:hyperlink id="hyperlink2" text="para_packing/View" url="/faces/para_packing/View.jsp"/>
                        </webuijsf:breadcrumbs>
                        <webuijsf:table augmentTitle="false" id="table1" style="position: absolute; left: 24px; top: 72px" title="Parachute Packing" width="100%">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{para_packing$View_4.para_packing_viewDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn align="center" headerText="Serial No" id="tableColumn1" valign="middle">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['para_inventory.Serial No']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Chute No" id="tableColumn2" valign="middle">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['Chute No']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Repacked Date" id="tableColumn3" valign="middle">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['para_packing.Repacked Date']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Repack Due Date" id="tableColumn4" valign="middle">
                                    <webuijsf:staticText id="staticText4" text="#{currentRow.value['Repack Due Date']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Pack By" id="tableColumn5" valign="middle">
                                    <webuijsf:staticText id="staticText5" text="#{currentRow.value['para_packing.Pack By']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Inspect By" id="tableColumn6" valign="middle">
                                    <webuijsf:staticText id="staticText6" text="#{currentRow.value['para_packing.Inspect By']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Check Type" id="tableColumn7" valign="middle">
                                    <webuijsf:staticText id="staticText7" text="#{currentRow.value['para_packing.Check Type']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="center" headerText="Status" id="tableColumn8" valign="middle">
                                    <webuijsf:staticText id="staticText8" text="#{currentRow.value['para_inventory.Status']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:button actionExpression="#{para_packing$View_4.add_action}" id="add" style="position: absolute; left: 24px; top: 48px" text="Add"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>

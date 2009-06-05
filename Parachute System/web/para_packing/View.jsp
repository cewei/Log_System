<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : View
    Created on : Jun 3, 2009, 3:47:37 PM
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
                        </webuijsf:breadcrumbs>
                        <webuijsf:table augmentTitle="false" id="table1" style="position: absolute; left: 24px; top: 72px" title="Table" width="0">
                            <webuijsf:tableRowGroup binding="#{para_packing$View.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                sourceData="#{para_packing$View.para_packing_viewDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="Serial No" id="tableColumn1" sort="para_packing.Serial No">
                                    <webuijsf:button actionExpression="#{para_packing$View.button1_action}" id="button1" text="#{currentRow.value['para_packing.Serial No']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Chute No" id="tableColumn2" sort="Chute No">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['Chute No']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Repacked Date" id="tableColumn3" sort="para_packing.Repacked Date">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['para_packing.Repacked Date']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Repack Due Date" id="tableColumn4" sort="Repack Due Date">
                                    <webuijsf:staticText id="staticText4" text="#{currentRow.value['Repack Due Date']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Pack By" id="tableColumn5" sort="para_packing.Pack By">
                                    <webuijsf:staticText id="staticText5" text="#{currentRow.value['para_packing.Pack By']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Inspect By" id="tableColumn6" sort="para_packing.Inspect By">
                                    <webuijsf:staticText id="staticText6" text="#{currentRow.value['para_packing.Inspect By']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Check Type" id="tableColumn7" sort="para_packing.Check Type">
                                    <webuijsf:staticText id="staticText7" text="#{currentRow.value['para_packing.Check Type']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Status" id="tableColumn8" sort="para_inventory.Status">
                                    <webuijsf:staticText id="staticText8" text="#{currentRow.value['para_inventory.Status']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
